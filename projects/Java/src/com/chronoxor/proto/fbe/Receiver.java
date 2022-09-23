//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package com.chronoxor.proto.fbe;

// Fast Binary Encoding com.chronoxor.proto receiver
public class Receiver extends com.chronoxor.fbe.Receiver
{
    // Receiver values accessors
    private final com.chronoxor.proto.OrderMessage OrderMessageValue;
    private final com.chronoxor.proto.BalanceMessage BalanceMessageValue;
    private final com.chronoxor.proto.AccountMessage AccountMessageValue;

    // Receiver models accessors
    private final OrderMessageModel OrderMessageModel;
    private final BalanceMessageModel BalanceMessageModel;
    private final AccountMessageModel AccountMessageModel;

    public Receiver()
    {
        super(false);
        OrderMessageValue = new com.chronoxor.proto.OrderMessage();
        OrderMessageModel = new OrderMessageModel();
        BalanceMessageValue = new com.chronoxor.proto.BalanceMessage();
        BalanceMessageModel = new BalanceMessageModel();
        AccountMessageValue = new com.chronoxor.proto.AccountMessage();
        AccountMessageModel = new AccountMessageModel();
    }
    public Receiver(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, false);
        OrderMessageValue = new com.chronoxor.proto.OrderMessage();
        OrderMessageModel = new OrderMessageModel();
        BalanceMessageValue = new com.chronoxor.proto.BalanceMessage();
        BalanceMessageModel = new BalanceMessageModel();
        AccountMessageValue = new com.chronoxor.proto.AccountMessage();
        AccountMessageModel = new AccountMessageModel();
    }

    // Receive handlers
    protected void onReceive(com.chronoxor.proto.OrderMessage value) {}
    protected void onReceive(com.chronoxor.proto.BalanceMessage value) {}
    protected void onReceive(com.chronoxor.proto.AccountMessage value) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)com.chronoxor.proto.fbe.OrderMessageModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                OrderMessageModel.attach(buffer, offset);
                assert OrderMessageModel.verify() : "proto.OrderMessage validation failed!";
                long deserialized = OrderMessageModel.deserialize(OrderMessageValue);
                assert (deserialized > 0) : "proto.OrderMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = OrderMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(OrderMessageValue);
                return true;
            }
            case (int)com.chronoxor.proto.fbe.BalanceMessageModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                BalanceMessageModel.attach(buffer, offset);
                assert BalanceMessageModel.verify() : "proto.BalanceMessage validation failed!";
                long deserialized = BalanceMessageModel.deserialize(BalanceMessageValue);
                assert (deserialized > 0) : "proto.BalanceMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = BalanceMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(BalanceMessageValue);
                return true;
            }
            case (int)com.chronoxor.proto.fbe.AccountMessageModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                AccountMessageModel.attach(buffer, offset);
                assert AccountMessageModel.verify() : "proto.AccountMessage validation failed!";
                long deserialized = AccountMessageModel.deserialize(AccountMessageValue);
                assert (deserialized > 0) : "proto.AccountMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = AccountMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(AccountMessageValue);
                return true;
            }
            default: break;
        }

        return false;
    }
}
