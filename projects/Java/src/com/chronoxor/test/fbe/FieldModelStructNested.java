//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;

// Fast Binary Encoding StructNested field model
public final class FieldModelStructNested extends com.chronoxor.fbe.FieldModel
{
    public final FieldModelStructOptional parent;
    public final FieldModelEnumSimple f1000;
    public final FieldModelOptionalEnumSimple f1001;
    public final FieldModelEnumTyped f1002;
    public final FieldModelOptionalEnumTyped f1003;
    public final FieldModelFlagsSimple f1004;
    public final FieldModelOptionalFlagsSimple f1005;
    public final FieldModelFlagsTyped f1006;
    public final FieldModelOptionalFlagsTyped f1007;
    public final FieldModelStructSimple f1008;
    public final FieldModelOptionalStructSimple f1009;
    public final FieldModelStructOptional f1010;
    public final FieldModelOptionalStructOptional f1011;

    public FieldModelStructNested(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        parent = new FieldModelStructOptional(buffer, 4 + 4);
        f1000 = new FieldModelEnumSimple(buffer, parent.fbeOffset() + parent.fbeBody() - 4 - 4);
        f1001 = new FieldModelOptionalEnumSimple(buffer, f1000.fbeOffset() + f1000.fbeSize());
        f1002 = new FieldModelEnumTyped(buffer, f1001.fbeOffset() + f1001.fbeSize());
        f1003 = new FieldModelOptionalEnumTyped(buffer, f1002.fbeOffset() + f1002.fbeSize());
        f1004 = new FieldModelFlagsSimple(buffer, f1003.fbeOffset() + f1003.fbeSize());
        f1005 = new FieldModelOptionalFlagsSimple(buffer, f1004.fbeOffset() + f1004.fbeSize());
        f1006 = new FieldModelFlagsTyped(buffer, f1005.fbeOffset() + f1005.fbeSize());
        f1007 = new FieldModelOptionalFlagsTyped(buffer, f1006.fbeOffset() + f1006.fbeSize());
        f1008 = new FieldModelStructSimple(buffer, f1007.fbeOffset() + f1007.fbeSize());
        f1009 = new FieldModelOptionalStructSimple(buffer, f1008.fbeOffset() + f1008.fbeSize());
        f1010 = new FieldModelStructOptional(buffer, f1009.fbeOffset() + f1009.fbeSize());
        f1011 = new FieldModelOptionalStructOptional(buffer, f1010.fbeOffset() + f1010.fbeSize());
    }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }
    // Get the field body size
    public long fbeBody()
    {
        long fbeResult = 4 + 4
            + parent.fbeBody() - 4 - 4
            + f1000.fbeSize()
            + f1001.fbeSize()
            + f1002.fbeSize()
            + f1003.fbeSize()
            + f1004.fbeSize()
            + f1005.fbeSize()
            + f1006.fbeSize()
            + f1007.fbeSize()
            + f1008.fbeSize()
            + f1009.fbeSize()
            + f1010.fbeSize()
            + f1011.fbeSize()
            ;
        return fbeResult;
    }
    // Get the field extra size
    @Override
    public long fbeExtra()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4) > _buffer.getSize()))
            return 0;

        _buffer.shift(fbeStructOffset);

        long fbeResult = fbeBody()
            + parent.fbeExtra()
            + f1000.fbeExtra()
            + f1001.fbeExtra()
            + f1002.fbeExtra()
            + f1003.fbeExtra()
            + f1004.fbeExtra()
            + f1005.fbeExtra()
            + f1006.fbeExtra()
            + f1007.fbeExtra()
            + f1008.fbeExtra()
            + f1009.fbeExtra()
            + f1010.fbeExtra()
            + f1011.fbeExtra()
            ;

        _buffer.unshift(fbeStructOffset);

        return fbeResult;
    }
    // Get the field type
    public static final long fbeTypeConst = 112;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public boolean verify() { return verify(true); }
    public boolean verify(boolean fbeVerifyType)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return true;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return false;

        int fbeStructSize = readInt32(fbeStructOffset);
        if (fbeStructSize < (4 + 4))
            return false;

        int fbeStructType = readInt32(fbeStructOffset + 4);
        if (fbeVerifyType && (fbeStructType != fbeType()))
            return false;

        _buffer.shift(fbeStructOffset);
        boolean fbeResult = verifyFields(fbeStructSize);
        _buffer.unshift(fbeStructOffset);
        return fbeResult;
    }

    // Check if the struct fields are valid
    public boolean verifyFields(long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + parent.fbeBody() - 4 - 4) > fbeStructSize)
            return true;
        if (!parent.verifyFields(fbeStructSize))
            return false;
        fbeCurrentSize += parent.fbeBody() - 4 - 4;

        if ((fbeCurrentSize + f1000.fbeSize()) > fbeStructSize)
            return true;
        if (!f1000.verify())
            return false;
        fbeCurrentSize += f1000.fbeSize();

        if ((fbeCurrentSize + f1001.fbeSize()) > fbeStructSize)
            return true;
        if (!f1001.verify())
            return false;
        fbeCurrentSize += f1001.fbeSize();

        if ((fbeCurrentSize + f1002.fbeSize()) > fbeStructSize)
            return true;
        if (!f1002.verify())
            return false;
        fbeCurrentSize += f1002.fbeSize();

        if ((fbeCurrentSize + f1003.fbeSize()) > fbeStructSize)
            return true;
        if (!f1003.verify())
            return false;
        fbeCurrentSize += f1003.fbeSize();

        if ((fbeCurrentSize + f1004.fbeSize()) > fbeStructSize)
            return true;
        if (!f1004.verify())
            return false;
        fbeCurrentSize += f1004.fbeSize();

        if ((fbeCurrentSize + f1005.fbeSize()) > fbeStructSize)
            return true;
        if (!f1005.verify())
            return false;
        fbeCurrentSize += f1005.fbeSize();

        if ((fbeCurrentSize + f1006.fbeSize()) > fbeStructSize)
            return true;
        if (!f1006.verify())
            return false;
        fbeCurrentSize += f1006.fbeSize();

        if ((fbeCurrentSize + f1007.fbeSize()) > fbeStructSize)
            return true;
        if (!f1007.verify())
            return false;
        fbeCurrentSize += f1007.fbeSize();

        if ((fbeCurrentSize + f1008.fbeSize()) > fbeStructSize)
            return true;
        if (!f1008.verify())
            return false;
        fbeCurrentSize += f1008.fbeSize();

        if ((fbeCurrentSize + f1009.fbeSize()) > fbeStructSize)
            return true;
        if (!f1009.verify())
            return false;
        fbeCurrentSize += f1009.fbeSize();

        if ((fbeCurrentSize + f1010.fbeSize()) > fbeStructSize)
            return true;
        if (!f1010.verify())
            return false;
        fbeCurrentSize += f1010.fbeSize();

        if ((fbeCurrentSize + f1011.fbeSize()) > fbeStructSize)
            return true;
        if (!f1011.verify())
            return false;
        fbeCurrentSize += f1011.fbeSize();

        return true;
    }

    // Get the struct value (begin phase)
    public long getBegin()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + 4 + 4) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return 0;

        int fbeStructSize = readInt32(fbeStructOffset);
        assert (fbeStructSize >= (4 + 4)) : "Model is broken!";
        if (fbeStructSize < (4 + 4))
            return 0;

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Get the struct value (end phase)
    public void getEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Get the struct value
    public com.chronoxor.test.StructNested get() { return get(new com.chronoxor.test.StructNested()); }
    public com.chronoxor.test.StructNested get(com.chronoxor.test.StructNested fbeValue)
    {
        long fbeBegin = getBegin();
        if (fbeBegin == 0)
            return fbeValue;

        int fbeStructSize = readInt32(0);
        getFields(fbeValue, fbeStructSize);
        getEnd(fbeBegin);
        return fbeValue;
    }

    // Get the struct fields values
    public void getFields(com.chronoxor.test.StructNested fbeValue, long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + parent.fbeBody() - 4 - 4) <= fbeStructSize)
            parent.getFields(fbeValue, fbeStructSize);
        fbeCurrentSize += parent.fbeBody() - 4 - 4;

        if ((fbeCurrentSize + f1000.fbeSize()) <= fbeStructSize)
            fbeValue.f1000 = f1000.get();
        else
            fbeValue.f1000 = new com.chronoxor.test.EnumSimple();
        fbeCurrentSize += f1000.fbeSize();

        if ((fbeCurrentSize + f1001.fbeSize()) <= fbeStructSize)
            fbeValue.f1001 = f1001.get();
        else
            fbeValue.f1001 = null;
        fbeCurrentSize += f1001.fbeSize();

        if ((fbeCurrentSize + f1002.fbeSize()) <= fbeStructSize)
            fbeValue.f1002 = f1002.get(com.chronoxor.test.EnumTyped.ENUM_VALUE_2);
        else
            fbeValue.f1002 = com.chronoxor.test.EnumTyped.ENUM_VALUE_2;
        fbeCurrentSize += f1002.fbeSize();

        if ((fbeCurrentSize + f1003.fbeSize()) <= fbeStructSize)
            fbeValue.f1003 = f1003.get(null);
        else
            fbeValue.f1003 = null;
        fbeCurrentSize += f1003.fbeSize();

        if ((fbeCurrentSize + f1004.fbeSize()) <= fbeStructSize)
            fbeValue.f1004 = f1004.get();
        else
            fbeValue.f1004 = new com.chronoxor.test.FlagsSimple();
        fbeCurrentSize += f1004.fbeSize();

        if ((fbeCurrentSize + f1005.fbeSize()) <= fbeStructSize)
            fbeValue.f1005 = f1005.get();
        else
            fbeValue.f1005 = null;
        fbeCurrentSize += f1005.fbeSize();

        if ((fbeCurrentSize + f1006.fbeSize()) <= fbeStructSize)
            fbeValue.f1006 = f1006.get(com.chronoxor.test.FlagsTyped.fromSet(java.util.EnumSet.of(com.chronoxor.test.FlagsTyped.FLAG_VALUE_2.getEnum(), com.chronoxor.test.FlagsTyped.FLAG_VALUE_4.getEnum(), com.chronoxor.test.FlagsTyped.FLAG_VALUE_6.getEnum())));
        else
            fbeValue.f1006 = com.chronoxor.test.FlagsTyped.fromSet(java.util.EnumSet.of(com.chronoxor.test.FlagsTyped.FLAG_VALUE_2.getEnum(), com.chronoxor.test.FlagsTyped.FLAG_VALUE_4.getEnum(), com.chronoxor.test.FlagsTyped.FLAG_VALUE_6.getEnum()));
        fbeCurrentSize += f1006.fbeSize();

        if ((fbeCurrentSize + f1007.fbeSize()) <= fbeStructSize)
            fbeValue.f1007 = f1007.get(null);
        else
            fbeValue.f1007 = null;
        fbeCurrentSize += f1007.fbeSize();

        if ((fbeCurrentSize + f1008.fbeSize()) <= fbeStructSize)
            fbeValue.f1008 = f1008.get();
        else
            fbeValue.f1008 = new com.chronoxor.test.StructSimple();
        fbeCurrentSize += f1008.fbeSize();

        if ((fbeCurrentSize + f1009.fbeSize()) <= fbeStructSize)
            fbeValue.f1009 = f1009.get();
        else
            fbeValue.f1009 = null;
        fbeCurrentSize += f1009.fbeSize();

        if ((fbeCurrentSize + f1010.fbeSize()) <= fbeStructSize)
            fbeValue.f1010 = f1010.get();
        else
            fbeValue.f1010 = new com.chronoxor.test.StructOptional();
        fbeCurrentSize += f1010.fbeSize();

        if ((fbeCurrentSize + f1011.fbeSize()) <= fbeStructSize)
            fbeValue.f1011 = f1011.get(null);
        else
            fbeValue.f1011 = null;
        fbeCurrentSize += f1011.fbeSize();
    }

    // Set the struct value (begin phase)
    public long setBegin()
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructSize = (int)fbeBody();
        int fbeStructOffset = (int)(_buffer.allocate(fbeStructSize) - _buffer.getOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset <= 0) || ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) > _buffer.getSize()))
            return 0;

        write(fbeOffset(), fbeStructOffset);
        write(fbeStructOffset, fbeStructSize);
        write(fbeStructOffset + 4, (int)fbeType());

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Set the struct value (end phase)
    public void setEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Set the struct value
    public void set(com.chronoxor.test.StructNested fbeValue)
    {
        long fbeBegin = setBegin();
        if (fbeBegin == 0)
            return;

        setFields(fbeValue);
        setEnd(fbeBegin);
    }

    // Set the struct fields values
    public void setFields(com.chronoxor.test.StructNested fbeValue)
    {
        parent.setFields(fbeValue);
        f1000.set(fbeValue.f1000);
        f1001.set(fbeValue.f1001);
        f1002.set(fbeValue.f1002);
        f1003.set(fbeValue.f1003);
        f1004.set(fbeValue.f1004);
        f1005.set(fbeValue.f1005);
        f1006.set(fbeValue.f1006);
        f1007.set(fbeValue.f1007);
        f1008.set(fbeValue.f1008);
        f1009.set(fbeValue.f1009);
        f1010.set(fbeValue.f1010);
        f1011.set(fbeValue.f1011);
    }
}
