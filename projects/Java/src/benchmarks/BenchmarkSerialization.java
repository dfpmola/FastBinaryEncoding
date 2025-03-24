package benchmarks;

import java.util.*;
import org.openjdk.jmh.annotations.*;

import com.chronoxor.proto.*;
import com.chronoxor.proto.fbe.*;

@State(Scope.Benchmark)
public class BenchmarkSerialization
{
    private Account _account;
    private final AccountModel _writer;
    private final AccountModel _reader;

    public BenchmarkSerialization()
    {
        // Create a new account with some orders
        _account = new Account(1, "Test", State.good, new Balance("USD", 1000.0), new Balance("EUR", 100.0), new ArrayList<Order>());
        _account.orders.add(new Order(1, "EURUSD", OrderSide.buy, OrderType.market, 1.23456, 1000.0));
        _account.orders.add(new Order(2, "EURUSD", OrderSide.sell, OrderType.limit, 1.0, 100.0));
        _account.orders.add(new Order(3, "EURUSD", OrderSide.buy, OrderType.stop, 1.5, 10.0));

        // Serialize the account to the FBE stream
        _writer = new AccountModel();
        _writer.serialize(_account);
        assert _writer.verify();

        // Deserialize the account from the FBE stream
        _reader = new AccountModel();
        _reader.attach(_writer.getBuffer());
        assert _reader.verify();
        _reader.deserialize(_account);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    /**
     * Verifies the account by calling the verify method on the associated writer.
     *
     * This method performs the necessary checks to ensure that the account is valid
     * and meets all required criteria. It is essential to call this method before
     * proceeding with any operations that depend on the account's validity.
     *
     * @throws IllegalStateException if the account is not in a valid state for verification.
     * @throws NullPointerException if the writer is not initialized or is null.
     */
    public void verify()
    {
        // Verify the account
        _writer.verify();
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    /**
     * Serializes the account object to the FBE (Fast Binary Encoding) stream.
     * <p>
     * This method resets the FBE stream before performing the serialization.
     * </p>
     *
     * @throws IOException if an I/O error occurs during serialization.
     * @throws SerializationException if the account object cannot be serialized.
     */
    public void serialize()
    {
        // Reset FBE stream
        _writer.reset();

        // Serialize the account to the FBE stream
        _writer.serialize(_account);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    /**
     * Deserializes the account from the FBE (Flat Buffer Encoding) stream.
     * This method reads the serialized data and populates the
     * account object with the corresponding values.
     *
     * @throws IOException if an I/O error occurs during deserialization.
     * @throws IllegalArgumentException if the data format is invalid or
     *         does not match the expected structure for the account.
     */
    public void deserialize()
    {
        // Deserialize the account from the FBE stream
        _reader.deserialize(_account);
    }
}
