package benchmarks;

import java.util.*;
import org.openjdk.jmh.annotations.*;

import com.chronoxor.proto.*;

@State(Scope.Benchmark)
public class BenchmarkSerializationJson
{
    private Account _account;
    private String _json;

    public BenchmarkSerializationJson()
    {
        // Create a new account with some orders
        _account = new Account(1, "Test", State.good, new Balance("USD", 1000.0), new Balance("EUR", 100.0), new ArrayList<Order>());
        _account.orders.add(new Order(1, "EURUSD", OrderSide.buy, OrderType.market, 1.23456, 1000.0));
        _account.orders.add(new Order(2, "EURUSD", OrderSide.sell, OrderType.limit, 1.0, 100.0));
        _account.orders.add(new Order(3, "EURUSD", OrderSide.buy, OrderType.stop, 1.5, 10.0));

        // Serialize the account to the JSON string
        _json = _account.toJson();

        // Deserialize the account from the JSON string
        _account = Account.fromJson(_json);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    /**
     * Serializes the account object into a JSON string representation.
     * <p>
     * This method converts the current state of the account into a JSON format
     * using the {@code toJson()} method of the account object. The resulting
     * JSON string is stored in the {@code _json} variable.
     * </p>
     *
     * @throws NullPointerException if the account object is null or if the
     *         {@code toJson()} method cannot be called due to a null reference.
     * @throws JsonProcessingException if there is an error during the JSON
     *         serialization process.
     */
    public void serialize()
    {
        // Serialize the account to the JSON string
        _json = _account.toJson();
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    /**
     * Deserializes the account from a JSON string.
     * <p>
     * This method converts the JSON representation of an account into an
     * {@link Account} object and assigns it to the instance variable
     * {@code _account}. It is expected that the JSON string is properly
     * formatted and corresponds to the structure of the {@link Account} class.
     * </p>
     *
     * @throws IllegalArgumentException if the JSON string is invalid or does
     *         not conform to the expected format for an {@link Account}.
     * @throws NullPointerException if the JSON string is {@code null}.
     */
    public void deserialize()
    {
        // Deserialize the account from the JSON string
        _account = Account.fromJson(_json);
    }
}
