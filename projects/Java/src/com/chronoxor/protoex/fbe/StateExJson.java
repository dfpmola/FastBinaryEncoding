//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex.fbe;;

public final class StateExJson implements com.google.gson.JsonSerializer<com.chronoxor.protoex.StateEx>, com.google.gson.JsonDeserializer<com.chronoxor.protoex.StateEx>
{

    @Override
    public com.google.gson.JsonElement serialize(com.chronoxor.protoex.StateEx src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive(src.getRaw());
    }

    @Override
    public com.chronoxor.protoex.StateEx deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return new com.chronoxor.protoex.StateEx(json.getAsJsonPrimitive().getAsByte());
    }
}
