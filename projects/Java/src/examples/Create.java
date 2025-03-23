package examples;

import com.chronoxor.proto.*;
import com.chronoxor.proto.fbe.*;

public class Create
{
    /**
     * The main method serves as the entry point for the application. It demonstrates the creation,
     * serialization, and deserialization of an account using the FBE (Flat Buffer Encoding) model.
     *
     * <p>This method performs the following operations:</p>
     * <ol>
     *     <li>Creates a new account and initializes its properties.</li>
     *     <li>Serializes the account data into a buffer.</li>
     *     <li>Displays the size of the serialized buffer.</li>
     *     <li>Deserializes the account data from the buffer into a new account instance.</li>
     *     <li>Prints the details of the account to the console.</li>
     * </ol>
     *
     * @param args Command line arguments (not used in this method).
     *
     * @throws IllegalArgumentException if any of the account properties are invalid during creation or access.
     * @throws NullPointerException if any required fields are not set before accessing them.
     * @throws Exception if there is an error during serialization or deserialization of the account data.
     */
    public static void main(String[] args)
    {
        // Create a new account using FBE model
        var account = new AccountModel();
        long modelBegin = account.createBegin();
        long accountBegin = account.model.setBegin();
        account.model.id.set(1);
        account.model.name.set("Test");
        account.model.state.set(State.good);
        long walletBegin = account.model.wallet.setBegin();
        account.model.wallet.currency.set("USD");
        account.model.wallet.amount.set(1000.0);
        account.model.wallet.setEnd(walletBegin);
        account.model.setEnd(accountBegin);
        account.createEnd(modelBegin);
        assert account.verify();

        // Show the serialized FBE size
        System.out.println("FBE size: " + account.getBuffer().getSize());

        // Access the account using the FBE model
        var access = new AccountModel();
        access.attach(account.getBuffer());
        assert access.verify();

        int id;
        String name;
        State state;
        String walletCurrency;
        double walletAmount;

        accountBegin = access.model.getBegin();
        id = access.model.id.get();
        name = access.model.name.get();
        state = access.model.state.get();
        walletBegin = access.model.wallet.getBegin();
        walletCurrency = access.model.wallet.currency.get();
        walletAmount = access.model.wallet.amount.get();
        access.model.wallet.getEnd(walletBegin);
        access.model.getEnd(accountBegin);

        // Show account content
        System.out.println();
        System.out.println("account.id = " + id);
        System.out.println("account.name = " + name);
        System.out.println("account.state = " + state);
        System.out.println("account.wallet.currency = " + walletCurrency);
        System.out.println("account.wallet.amount = " + walletAmount);
    }
}
