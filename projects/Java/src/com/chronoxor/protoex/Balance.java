//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex;

public class Balance extends com.chronoxor.proto.Balance
{
    public double locked = (double)0.0d;

    public static final long fbeTypeConst = com.chronoxor.proto.Balance.fbeTypeConst;
    public long fbeType() { return fbeTypeConst; }

    public Balance() {}

    public Balance(com.chronoxor.proto.Balance parent, double locked)
    {
        super(parent);
        this.locked = locked;
    }

    public Balance(Balance other)
    {
        super(other);
        this.locked = other.locked;
    }

    public Balance clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new com.chronoxor.protoex.fbe.BalanceModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new com.chronoxor.protoex.fbe.BalanceModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!Balance.class.isAssignableFrom(other.getClass()))
            return -1;

        final Balance obj = (Balance)other;

        int result = 0;
        result = super.compareTo(obj);
        if (result != 0)
            return result;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!Balance.class.isAssignableFrom(other.getClass()))
            return false;

        final Balance obj = (Balance)other;

        if (!super.equals(obj))
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + super.hashCode();
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("Balance(");
        sb.append(super.toString());
        sb.append(",locked="); sb.append(locked);
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return com.chronoxor.protoex.fbe.Json.getEngine().toJson(this); }
    public static Balance fromJson(String json) { return com.chronoxor.protoex.fbe.Json.getEngine().fromJson(json, Balance.class); }
}
