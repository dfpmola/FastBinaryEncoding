//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto.fbe

class OrderTypeJson : com.google.gson.JsonSerializer<com.chronoxor.proto.OrderType>, com.google.gson.JsonDeserializer<com.chronoxor.proto.OrderType>
{
    override fun serialize(src: com.chronoxor.proto.OrderType, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): com.chronoxor.proto.OrderType
    {
        return com.chronoxor.proto.OrderType(json.asJsonPrimitive.asByte)
    }
}
