//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

class FlagsSimpleJson : com.google.gson.JsonSerializer<com.chronoxor.test.FlagsSimple>, com.google.gson.JsonDeserializer<com.chronoxor.test.FlagsSimple>
{

    @Override
    override fun serialize(src: com.chronoxor.test.FlagsSimple, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext):com.chronoxor.test.FlagsSimple
    {
        return com.chronoxor.test.FlagsSimple(json.asJsonPrimitive.asInt)
    }
}
