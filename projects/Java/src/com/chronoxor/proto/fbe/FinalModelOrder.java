//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package com.chronoxor.proto.fbe;

// Fast Binary Encoding Order final model
public final class FinalModelOrder extends com.chronoxor.fbe.FinalModel
{
    public final com.chronoxor.fbe.FinalModelInt32 id;
    public final com.chronoxor.fbe.FinalModelString symbol;
    public final FinalModelOrderSide side;
    public final FinalModelOrderType type;
    public final com.chronoxor.fbe.FinalModelDouble price;
    public final com.chronoxor.fbe.FinalModelDouble volume;

    public FinalModelOrder(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        id = new com.chronoxor.fbe.FinalModelInt32(buffer, 0);
        symbol = new com.chronoxor.fbe.FinalModelString(buffer, 0);
        side = new FinalModelOrderSide(buffer, 0);
        type = new FinalModelOrderType(buffer, 0);
        price = new com.chronoxor.fbe.FinalModelDouble(buffer, 0);
        volume = new com.chronoxor.fbe.FinalModelDouble(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(com.chronoxor.proto.Order fbeValue)
    {
        long fbeResult = 0
            + id.fbeAllocationSize(fbeValue.id)
            + symbol.fbeAllocationSize(fbeValue.symbol)
            + side.fbeAllocationSize(fbeValue.side)
            + type.fbeAllocationSize(fbeValue.type)
            + price.fbeAllocationSize(fbeValue.price)
            + volume.fbeAllocationSize(fbeValue.volume)
            ;
        return fbeResult;
    }

    // Get the final type
    public static final long fbeTypeConst = 1;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        id.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = id.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        symbol.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = symbol.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        side.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = side.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        type.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = type.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        price.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = price.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        volume.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = volume.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public com.chronoxor.proto.Order get(com.chronoxor.fbe.Size fbeSize) { return get(fbeSize, new com.chronoxor.proto.Order()); }
    public com.chronoxor.proto.Order get(com.chronoxor.fbe.Size fbeSize, com.chronoxor.proto.Order fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(com.chronoxor.proto.Order fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new com.chronoxor.fbe.Size(0);

        id.fbeOffset(fbeCurrentOffset);
        fbeValue.id = id.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        symbol.fbeOffset(fbeCurrentOffset);
        fbeValue.symbol = symbol.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        side.fbeOffset(fbeCurrentOffset);
        fbeValue.side = side.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        type.fbeOffset(fbeCurrentOffset);
        fbeValue.type = type.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        price.fbeOffset(fbeCurrentOffset);
        fbeValue.price = price.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        volume.fbeOffset(fbeCurrentOffset);
        fbeValue.volume = volume.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(com.chronoxor.proto.Order fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(com.chronoxor.proto.Order fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new com.chronoxor.fbe.Size();

        id.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = id.set(fbeValue.id);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        symbol.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = symbol.set(fbeValue.symbol);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        side.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = side.set(fbeValue.side);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        type.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = type.set(fbeValue.type);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        price.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = price.set(fbeValue.price);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        volume.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = volume.set(fbeValue.volume);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
