//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums.fbe;

// Fast Binary Encoding EnumUInt64 final model
public final class FinalModelEnumUInt64 extends com.chronoxor.fbe.FinalModel
{
    public FinalModelEnumUInt64(com.chronoxor.fbe.Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(com.chronoxor.enums.EnumUInt64 value) { return fbeSize(); }

    // Get the final size
    @Override
    public long fbeSize() { return 8; }

    // Check if the value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return fbeSize();
    }

    // Get the value
    public com.chronoxor.enums.EnumUInt64 get(com.chronoxor.fbe.Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return new com.chronoxor.enums.EnumUInt64();

        size.value = fbeSize();
        return new com.chronoxor.enums.EnumUInt64(readInt64(fbeOffset()));
    }

    // Set the value
    public long set(com.chronoxor.enums.EnumUInt64 value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        write(fbeOffset(), value.getRaw());
        return fbeSize();
    }
}
