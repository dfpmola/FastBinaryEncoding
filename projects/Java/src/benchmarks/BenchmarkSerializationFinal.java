package benchmarks;

import java.util.*;
import org.openjdk.jmh.annotations.*;

import com.chronoxor.proto.*;
import com.chronoxor.proto.fbe.*;

@State(Scope.Benchmark)
public class BenchmarkSerializationFinal
{
    private Account _account;
    private final AccountFinalModel _writer;
    private final AccountFinalModel _reader;

    public BenchmarkSerializationFinal()
    {
        // Create a new account with some orders
        _account = new Account(1, "Test", State.good, new Balance("USD", 1000.0), new Balance("EUR", 100.0), new ArrayList<Order>());
        _account.orders.add(new Order(1, "EURUSD", OrderSide.buy, OrderType.market, 1.23456, 1000.0));
        _account.orders.add(new Order(2, "EURUSD", OrderSide.sell, OrderType.limit, 1.0, 100.0));
        _account.orders.add(new Order(3, "EURUSD", OrderSide.buy, OrderType.stop, 1.5, 10.0));

        // Serialize the account to the FBE stream
        _writer = new AccountFinalModel();
        _writer.serialize(_account);
        assert _writer.verify();

        // Deserialize the account from the FBE stream
        _reader = new AccountFinalModel();
        _reader.attach(_writer.getBuffer());
        assert _reader.verify();
        _reader.deserialize(_account);
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    /**
     * Verifies the account by invoking the verification process on the associated writer.
     *
     * <p>This method performs the necessary checks to ensure that the account is valid and meets
     * the required criteria. It delegates the verification task to the writer instance.</p>
     *
     * @throws VerificationException if the verification process fails due to an invalid account state
     * or any other issues encountered during verification.
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
     * This method resets the FBE stream before performing the serialization of the
     * account. It ensures that any previous data in the stream is cleared, allowing
     * for a fresh serialization process.
     * </p>
     *
     * @throws IOException if an I/O error occurs during serialization.
     * @throws SerializationException if the account object cannot be serialized
     *         due to its state or structure.
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
     * This method reads the serialized data and populates the account object
     * with the corresponding values.
     *
     * @throws IOException if an I/O error occurs during deserialization.
     * @throws IllegalArgumentException if the data in the stream is invalid
     *         or cannot be mapped to the account object.
     */
    public void deserialize()
    {
        // Deserialize the account from the FBE stream
        _reader.deserialize(_account);
    }
}
