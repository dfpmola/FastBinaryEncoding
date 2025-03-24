package examples;

import java.util.*;

import com.chronoxor.proto.*;
import com.chronoxor.proto.fbe.*;

public class SerializationFinal
{
    /**
     * The main method serves as the entry point for the application. It demonstrates the creation,
     * serialization, and deserialization of an account with associated orders.
     *
     * <p>This method performs the following steps:</p>
     * <ol>
     *   <li>Creates a new account with a specified ID, name, state, and balances in different currencies.</li>
     *   <li>Adds several orders to the account, including buy and sell orders with different types.</li>
     *   <li>Serializes the account object into a FBE (Flat Buffer Encoding) stream using the
     *       {@link AccountFinalModel#serialize(Account)} method.</li>
     *   <li>Verifies the integrity of the serialized data using {@link AccountFinalModel#verify()}.</li>
     *   <li>Prints the size of the serialized FBE buffer to the console.</li>
     *   <li>Deserializes the account object from the FBE stream using the
     *       {@link AccountFinalModel#attach(Buffer)} and {@link AccountFinalModel#deserialize(Account)} methods.</li>
     *   <li>Prints the content of the account to the console.</li>
     * </ol>
     *
     * @param args Command line arguments passed to the application. This method does not utilize these arguments.
     *
     * @throws IllegalArgumentException if any of the account or order parameters are invalid during creation.
     * @throws SerializationException if an error occurs during serialization of the account.
     * @throws DeserializationException if an error occurs during deserialization of the account.
     */
    public static void main(String[] args)
    {
        // Create a new account with some orders
        var account = new Account(1, "Test", State.good, new Balance("USD", 1000.0), new Balance("EUR", 100.0), new ArrayList<Order>());
        account.orders.add(new Order(1, "EURUSD", OrderSide.buy, OrderType.market, 1.23456, 1000.0));
        account.orders.add(new Order(2, "EURUSD", OrderSide.sell, OrderType.limit, 1.0, 100.0));
        account.orders.add(new Order(3, "EURUSD", OrderSide.buy, OrderType.stop, 1.5, 10.0));

        // Serialize the account to the FBE stream
        var writer = new AccountFinalModel();
        writer.serialize(account);
        assert writer.verify();

        // Show the serialized FBE size
        System.out.println("FBE final size: " + writer.getBuffer().getSize());

        // Deserialize the account from the FBE stream
        var reader = new AccountFinalModel();
        reader.attach(writer.getBuffer());
        assert reader.verify();
        reader.deserialize(account);

        // Show account content
        System.out.println();
        System.out.println(account);
    }
}
