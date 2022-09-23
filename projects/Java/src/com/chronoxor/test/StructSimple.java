//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test;

public class StructSimple implements Comparable<Object>
{
    public int id = 0;
    public boolean f1 = false;
    public boolean f2 = true;
    public byte f3 = (byte)0;
    public byte f4 = (byte)0xFF;
    public char f5 = '\0';
    public char f6 = (char)'!';
    public char f7 = '\0';
    public char f8 = (char)0x0444;
    public byte f9 = (byte)0;
    public byte f10 = (byte)127;
    public byte f11 = (byte)0;
    public byte f12 = (byte)0xFF;
    public short f13 = (short)0;
    public short f14 = (short)32767;
    public short f15 = (short)0;
    public short f16 = (short)0xFFFF;
    public int f17 = 0;
    public int f18 = (int)2147483647;
    public int f19 = (int)0;
    public int f20 = (int)0xFFFFFFFF;
    public long f21 = 0L;
    public long f22 = (long)9223372036854775807L;
    public long f23 = (long)0L;
    public long f24 = (long)0xFFFFFFFFFFFFFFFFL;
    public float f25 = 0.0f;
    public float f26 = (float)123.456f;
    public double f27 = 0.0d;
    public double f28 = (double)-123.456e+123d;
    public java.math.BigDecimal f29 = java.math.BigDecimal.valueOf(0L);
    public java.math.BigDecimal f30 = java.math.BigDecimal.valueOf(123456.123456d);
    public String f31 = "";
    public String f32 = "Initial string!";
    public java.time.Instant f33 = java.time.Instant.EPOCH;
    public java.time.Instant f34 = java.time.Instant.EPOCH;
    public java.time.Instant f35 = java.time.Instant.now();
    public java.util.UUID f36 = com.chronoxor.fbe.UUIDGenerator.nil();
    public java.util.UUID f37 = com.chronoxor.fbe.UUIDGenerator.sequential();
    public java.util.UUID f38 = java.util.UUID.fromString("123e4567-e89b-12d3-a456-426655440000");
    public com.chronoxor.proto.OrderSide f39 = new com.chronoxor.proto.OrderSide();
    public com.chronoxor.proto.OrderType f40 = new com.chronoxor.proto.OrderType();
    public com.chronoxor.proto.Order f41 = new com.chronoxor.proto.Order();
    public com.chronoxor.proto.Balance f42 = new com.chronoxor.proto.Balance();
    public com.chronoxor.proto.State f43 = new com.chronoxor.proto.State();
    public com.chronoxor.proto.Account f44 = new com.chronoxor.proto.Account();

    public static final long fbeTypeConst = 110;
    public long fbeType() { return fbeTypeConst; }

    public StructSimple() {}

    public StructSimple(int id, boolean f1, boolean f2, byte f3, byte f4, char f5, char f6, char f7, char f8, byte f9, byte f10, byte f11, byte f12, short f13, short f14, short f15, short f16, int f17, int f18, int f19, int f20, long f21, long f22, long f23, long f24, float f25, float f26, double f27, double f28, java.math.BigDecimal f29, java.math.BigDecimal f30, String f31, String f32, java.time.Instant f33, java.time.Instant f34, java.time.Instant f35, java.util.UUID f36, java.util.UUID f37, java.util.UUID f38, com.chronoxor.proto.OrderSide f39, com.chronoxor.proto.OrderType f40, com.chronoxor.proto.Order f41, com.chronoxor.proto.Balance f42, com.chronoxor.proto.State f43, com.chronoxor.proto.Account f44)
    {
        this.id = id;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;
        this.f6 = f6;
        this.f7 = f7;
        this.f8 = f8;
        this.f9 = f9;
        this.f10 = f10;
        this.f11 = f11;
        this.f12 = f12;
        this.f13 = f13;
        this.f14 = f14;
        this.f15 = f15;
        this.f16 = f16;
        this.f17 = f17;
        this.f18 = f18;
        this.f19 = f19;
        this.f20 = f20;
        this.f21 = f21;
        this.f22 = f22;
        this.f23 = f23;
        this.f24 = f24;
        this.f25 = f25;
        this.f26 = f26;
        this.f27 = f27;
        this.f28 = f28;
        this.f29 = f29;
        this.f30 = f30;
        this.f31 = f31;
        this.f32 = f32;
        this.f33 = f33;
        this.f34 = f34;
        this.f35 = f35;
        this.f36 = f36;
        this.f37 = f37;
        this.f38 = f38;
        this.f39 = f39;
        this.f40 = f40;
        this.f41 = f41;
        this.f42 = f42;
        this.f43 = f43;
        this.f44 = f44;
    }

    public StructSimple(StructSimple other)
    {
        this.id = other.id;
        this.f1 = other.f1;
        this.f2 = other.f2;
        this.f3 = other.f3;
        this.f4 = other.f4;
        this.f5 = other.f5;
        this.f6 = other.f6;
        this.f7 = other.f7;
        this.f8 = other.f8;
        this.f9 = other.f9;
        this.f10 = other.f10;
        this.f11 = other.f11;
        this.f12 = other.f12;
        this.f13 = other.f13;
        this.f14 = other.f14;
        this.f15 = other.f15;
        this.f16 = other.f16;
        this.f17 = other.f17;
        this.f18 = other.f18;
        this.f19 = other.f19;
        this.f20 = other.f20;
        this.f21 = other.f21;
        this.f22 = other.f22;
        this.f23 = other.f23;
        this.f24 = other.f24;
        this.f25 = other.f25;
        this.f26 = other.f26;
        this.f27 = other.f27;
        this.f28 = other.f28;
        this.f29 = other.f29;
        this.f30 = other.f30;
        this.f31 = other.f31;
        this.f32 = other.f32;
        this.f33 = other.f33;
        this.f34 = other.f34;
        this.f35 = other.f35;
        this.f36 = other.f36;
        this.f37 = other.f37;
        this.f38 = other.f38;
        this.f39 = other.f39;
        this.f40 = other.f40;
        this.f41 = other.f41;
        this.f42 = other.f42;
        this.f43 = other.f43;
        this.f44 = other.f44;
    }

    public StructSimple clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new com.chronoxor.test.fbe.StructSimpleModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new com.chronoxor.test.fbe.StructSimpleModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!StructSimple.class.isAssignableFrom(other.getClass()))
            return -1;

        final StructSimple obj = (StructSimple)other;

        int result = 0;
        result = Integer.compare(id, obj.id);
        if (result != 0)
            return result;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!StructSimple.class.isAssignableFrom(other.getClass()))
            return false;

        final StructSimple obj = (StructSimple)other;

        if (id != obj.id)
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + Integer.hashCode(id);
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("StructSimple(");
        sb.append("id="); sb.append(id);
        sb.append(",f1="); sb.append(f1 ? "true" : "false");
        sb.append(",f2="); sb.append(f2 ? "true" : "false");
        sb.append(",f3="); sb.append(f3);
        sb.append(",f4="); sb.append(f4);
        sb.append(",f5="); sb.append("'").append(f5).append("'");
        sb.append(",f6="); sb.append("'").append(f6).append("'");
        sb.append(",f7="); sb.append("'").append(f7).append("'");
        sb.append(",f8="); sb.append("'").append(f8).append("'");
        sb.append(",f9="); sb.append(f9);
        sb.append(",f10="); sb.append(f10);
        sb.append(",f11="); sb.append(f11);
        sb.append(",f12="); sb.append(f12);
        sb.append(",f13="); sb.append(f13);
        sb.append(",f14="); sb.append(f14);
        sb.append(",f15="); sb.append(f15);
        sb.append(",f16="); sb.append(f16);
        sb.append(",f17="); sb.append(f17);
        sb.append(",f18="); sb.append(f18);
        sb.append(",f19="); sb.append(f19);
        sb.append(",f20="); sb.append(f20);
        sb.append(",f21="); sb.append(f21);
        sb.append(",f22="); sb.append(f22);
        sb.append(",f23="); sb.append(f23);
        sb.append(",f24="); sb.append(f24);
        sb.append(",f25="); sb.append(f25);
        sb.append(",f26="); sb.append(f26);
        sb.append(",f27="); sb.append(f27);
        sb.append(",f28="); sb.append(f28);
        sb.append(",f29="); if (f29 != null) sb.append(f29); else sb.append("null");
        sb.append(",f30="); if (f30 != null) sb.append(f30); else sb.append("null");
        sb.append(",f31="); if (f31 != null) sb.append("\"").append(f31).append("\""); else sb.append("null");
        sb.append(",f32="); if (f32 != null) sb.append("\"").append(f32).append("\""); else sb.append("null");
        sb.append(",f33="); if (f33 != null) sb.append(f33.getEpochSecond() * 1000000000 + f33.getNano()); else sb.append("null");
        sb.append(",f34="); if (f34 != null) sb.append(f34.getEpochSecond() * 1000000000 + f34.getNano()); else sb.append("null");
        sb.append(",f35="); if (f35 != null) sb.append(f35.getEpochSecond() * 1000000000 + f35.getNano()); else sb.append("null");
        sb.append(",f36="); if (f36 != null) sb.append("\"").append(f36).append("\""); else sb.append("null");
        sb.append(",f37="); if (f37 != null) sb.append("\"").append(f37).append("\""); else sb.append("null");
        sb.append(",f38="); if (f38 != null) sb.append("\"").append(f38).append("\""); else sb.append("null");
        sb.append(",f39="); sb.append(f39);
        sb.append(",f40="); sb.append(f40);
        sb.append(",f41="); sb.append(f41);
        sb.append(",f42="); sb.append(f42);
        sb.append(",f43="); sb.append(f43);
        sb.append(",f44="); sb.append(f44);
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return com.chronoxor.test.fbe.Json.getEngine().toJson(this); }
    public static StructSimple fromJson(String json) { return com.chronoxor.test.fbe.Json.getEngine().fromJson(json, StructSimple.class); }
}
