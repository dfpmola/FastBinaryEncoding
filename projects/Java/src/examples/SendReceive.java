package examples;

import java.util.*;

import com.chronoxor.proto.*;
import com.chronoxor.proto.fbe.*;

class MySender extends Sender
{
    @Override
    /**
     * Sends data from the specified buffer starting at the given offset and for the specified size.
     *
     * <p>This method is intended to be overridden by subclasses to implement the actual sending logic.
     * Currently, it does not perform any operation and always returns 0.</p>
     *
     * @param buffer the byte array containing the data to be sent
     * @param offset the starting position in the buffer from which to send data
     * @param size the number of bytes to send from the buffer
     * @return the number of bytes sent, which is always 0 in this implementation
     *
     * @throws IllegalArgumentException if the offset is negative or if the size is negative
     * @throws ArrayIndexOutOfBoundsException if the offset plus size exceeds the length of the buffer
     */
    protected long onSend(byte[] buffer, long offset, long size)
    {
        // Send nothing...
        return 0;
    }

    @Override
    /**
     * This method is called to send a log message.
     * It prints the provided message to the standard output.
     *
     * @param message the log message to be sent
     * @throws NullPointerException if the provided message is null
     */
    protected void onSendLog(String message)
    {
        System.out.println("onSend: " + message);
    }
}

class MyReceiver extends Receiver
{
    @Override
    protected void onReceive(OrderMessage value) {}
    @Override
    protected void onReceive(BalanceMessage value) {}
    @Override
    /**
     * This method is called when an {@link AccountMessage} is received.
     * It processes the incoming message and performs the necessary actions.
     *
     * @param value the {@link AccountMessage} that has been received
     * @throws IllegalArgumentException if the provided {@code value} is null
     * @throws MessageProcessingException if an error occurs while processing the message
     */
    protected void onReceive(AccountMessage value) {}

    @Override
    /**
     * This method is called when a log message is received.
     * It prints the log message to the standard output.
     *
     * @param message the log message to be printed
     * @throws NullPointerException if the provided message is null
     */
    protected void onReceiveLog(String message)
    {
        System.out.println("onReceive: " + message);
    }
}

public class SendReceive
{
    /**
     * The main entry point of the application that demonstrates the functionality of sending and receiving
     * various financial messages such as orders, balances, and accounts.
     *
     * <p>This method initializes a sender and a receiver, enables logging for both, and sends a series of
     * messages including an order, a balance, and an account with multiple orders. It then receives all
     * data from the sender's buffer.</p>
     *
     * <p>Example usage:</p>
     * <pre>
     *     public static void main(String[] args) {
     *         // Application execution
     *     }
     * </pre>
     *
     * @param args Command-line arguments (not used in this implementation).
     *
     * @throws IllegalArgumentException if any of the messages being sent contain invalid data.
     * @throws IOException if there is an error during the sending or receiving of messages.
     */
    public static void main(String[] args)
    {
        var sender = new MySender();

        // Enable logging
        sender.setLogging(true);

        // Create and send a new order
        var order = new Order(1, "EURUSD", OrderSide.buy, OrderType.market, 1.23456, 1000.0);
        sender.send(new OrderMessage(order));

        // Create and send a new balance wallet
        var balance = new Balance("USD", 1000.0);
        sender.send(new BalanceMessage(balance));

        // Create and send a new account with some orders
        var account = new Account(1, "Test", State.good, new Balance("USD", 1000.0), new Balance("EUR", 100.0), new ArrayList<Order>());
        account.orders.add(new Order(1, "EURUSD", OrderSide.buy, OrderType.market, 1.23456, 1000.0));
        account.orders.add(new Order(2, "EURUSD", OrderSide.sell, OrderType.limit, 1.0, 100.0));
        account.orders.add(new Order(3, "EURUSD", OrderSide.buy, OrderType.stop, 1.5, 10.0));
        sender.send(new AccountMessage(account));

        var receiver = new MyReceiver();

        // Enable logging
        receiver.setLogging(true);

        // Receive all data from the sender
        receiver.receive(sender.getBuffer());
    }
}
