//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class EnumTyped : Comparable<EnumTyped>
{
    companion object
    {
        val ENUM_VALUE_0 = EnumTyped(EnumTypedEnum.ENUM_VALUE_0)
        val ENUM_VALUE_1 = EnumTyped(EnumTypedEnum.ENUM_VALUE_1)
        val ENUM_VALUE_2 = EnumTyped(EnumTypedEnum.ENUM_VALUE_2)
        val ENUM_VALUE_3 = EnumTyped(EnumTypedEnum.ENUM_VALUE_3)
        val ENUM_VALUE_4 = EnumTyped(EnumTypedEnum.ENUM_VALUE_4)
        val ENUM_VALUE_5 = EnumTyped(EnumTypedEnum.ENUM_VALUE_5)
    }

    var value: EnumTypedEnum? = EnumTypedEnum.values()[0]
        private set

    val raw: Byte
        get() = value!!.raw

    constructor()
    constructor(value: Byte) { setEnum(value) }
    constructor(value: EnumTypedEnum) { setEnum(value) }
    constructor(value: EnumTyped) { setEnum(value) }

    fun setDefault() { setEnum(0.toByte()) }

    fun setEnum(value: Byte) { this.value = EnumTypedEnum.mapValue(value) }
    fun setEnum(value: EnumTypedEnum) { this.value = value }
    fun setEnum(value: EnumTyped) { this.value = value.value }

    override fun compareTo(other: EnumTyped): Int
    {
        if (value == null)
            return -1
        if (other.value == null)
            return 1
        return (value!!.raw - other.value!!.raw).toInt()
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!EnumTyped::class.java.isAssignableFrom(other.javaClass))
            return false

        val enm = other as EnumTyped? ?: return false

        if (enm.value == null)
            return false
        if (value!!.raw != enm.value!!.raw)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        var hash = 17
        hash = hash * 31 + if (value != null) value!!.hashCode() else 0
        return hash
    }

    override fun toString(): String
    {
        return if (value != null) value!!.toString() else "<unknown>"
    }
}
