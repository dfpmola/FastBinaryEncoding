//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;

// Fast Binary Encoding com.chronoxor.test final receiver
public class FinalReceiver extends com.chronoxor.fbe.Receiver
{
    // Imported receivers
    public com.chronoxor.proto.fbe.FinalReceiver protoReceiver;

    // Receiver values accessors

    // Receiver models accessors

    public FinalReceiver()
    {
        super(true);
        protoReceiver = new com.chronoxor.proto.fbe.FinalReceiver(getBuffer());
    }
    public FinalReceiver(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, true);
        protoReceiver = new com.chronoxor.proto.fbe.FinalReceiver(getBuffer());
    }

    // Receive handlers

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            default: break;
        }

        if ((protoReceiver != null) && protoReceiver.onReceive(type, buffer, offset, size))
            return true;

        return false;
    }
}
