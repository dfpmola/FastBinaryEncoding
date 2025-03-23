package examples;

import java.util.*;

import com.chronoxor.proto.*;
import com.chronoxor.proto.fbe.*;

public class Serialization
{
    /**
     * The main method serves as the entry point for the application. It demonstrates the
     * creation of an account with associated orders, serialization of the account to a
     * FBE (Flat Buffer Encoding) stream, and subsequent deserialization of the account
     * from that stream.
     *
     * <p>This method performs the following steps:</p>
     * <ol>
     *     <li>Creates a new account with a specified ID, name, state, and balances in
     *         different currencies.</li>
     *     <li>Adds several orders to the account, including buy and sell orders with
     *         different types.</li>
     *     <li>Serializes the account into a FBE stream using the {@link AccountModel}
     *         class.</li>
     *     <li>Verifies the integrity of the serialized data.</li>
     *     <li>Prints the size of the serialized FBE buffer.</li>
     *     <li>Deserializes the account from the FBE stream back into an account object.</li>
     *     <li>Verifies the integrity of the deserialized data.</li>
     *     <li>Prints the content of the account to the console.</li>
     * </ol>
     *
     * @param args Command-line arguments passed to the application. This method does not
     *             utilize any command-line arguments.
     *
     * @throws IllegalArgumentException if any of the parameters used to create the
     *                                  account or orders are invalid (e.g., negative
     *                                  balances, invalid order types).
     * @throws SerializationException if an error occurs during the serialization or
     *                                 deserialization process.
     */
    public static void main(String[] args)
    {
        // Create a new account with some orders
        var account = new Account(1, "Test", State.good, new Balance("USD", 1000.0), new Balance("EUR", 100.0), new ArrayList<Order>());
        account.orders.add(new Order(1, "EURUSD", OrderSide.buy, OrderType.market, 1.23456, 1000.0));
        account.orders.add(new Order(2, "EURUSD", OrderSide.sell, OrderType.limit, 1.0, 100.0));
        account.orders.add(new Order(3, "EURUSD", OrderSide.buy, OrderType.stop, 1.5, 10.0));

        // Serialize the account to the FBE stream
        var writer = new AccountModel();
        writer.serialize(account);
        assert writer.verify();

        // Show the serialized FBE size
        System.out.println("FBE size: " + writer.getBuffer().getSize());

        // Deserialize the account from the FBE stream
        var reader = new AccountModel();
        reader.attach(writer.getBuffer());
        assert reader.verify();
        reader.deserialize(account);

        // Show account content
        System.out.println();
        System.out.println(account);
    }
}
