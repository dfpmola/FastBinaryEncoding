package examples;

import java.util.*;

import com.chronoxor.proto.*;

public class SerializationJson
{
    /**
     * The main method serves as the entry point for the application.
     * It demonstrates the creation of an account with associated orders,
     * serialization of the account to a JSON string, and deserialization
     * of the account from that JSON string.
     *
     * <p>This method performs the following steps:</p>
     * <ol>
     *     <li>Creates a new account with a specified ID, name, state, and balances in different currencies.</li>
     *     <li>Adds several orders to the account, including buy and sell orders with different types.</li>
     *     <li>Serializes the account object to a JSON string representation.</li>
     *     <li>Prints the serialized JSON string and its size to the console.</li>
     *     <li>Deserializes the JSON string back into an account object.</li>
     *     <li>Prints the content of the deserialized account to the console.</li>
     * </ol>
     *
     * @param args Command line arguments passed to the program. This implementation does not utilize these arguments.
     *
     * @throws JsonSerializationException if there is an error during serialization of the account to JSON.
     * @throws JsonDeserializationException if there is an error during deserialization of the JSON string back to an account.
     */
    public static void main(String[] args)
    {
        // Create a new account with some orders
        var account = new Account(1, "Test", State.good, new Balance("USD", 1000.0), new Balance("EUR", 100.0), new ArrayList<Order>());
        account.orders.add(new Order(1, "EURUSD", OrderSide.buy, OrderType.market, 1.23456, 1000.0));
        account.orders.add(new Order(2, "EURUSD", OrderSide.sell, OrderType.limit, 1.0, 100.0));
        account.orders.add(new Order(3, "EURUSD", OrderSide.buy, OrderType.stop, 1.5, 10.0));

        // Serialize the account to the JSON string
        var json = account.toJson();

        // Show the serialized JSON and its size
        System.out.println("JSON: " + json);
        System.out.println("JSON size: " + json.length());

        // Deserialize the account from the JSON string
        account = Account.fromJson(json);

        // Show account content
        System.out.println();
        System.out.println(account);
    }
}
