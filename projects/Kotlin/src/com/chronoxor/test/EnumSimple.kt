//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
class EnumSimple : Comparable<EnumSimple>
{
    companion object
    {
        val ENUM_VALUE_0 = EnumSimple(EnumSimpleEnum.ENUM_VALUE_0)
        val ENUM_VALUE_1 = EnumSimple(EnumSimpleEnum.ENUM_VALUE_1)
        val ENUM_VALUE_2 = EnumSimple(EnumSimpleEnum.ENUM_VALUE_2)
        val ENUM_VALUE_3 = EnumSimple(EnumSimpleEnum.ENUM_VALUE_3)
        val ENUM_VALUE_4 = EnumSimple(EnumSimpleEnum.ENUM_VALUE_4)
        val ENUM_VALUE_5 = EnumSimple(EnumSimpleEnum.ENUM_VALUE_5)
    }

    var value: EnumSimpleEnum? = EnumSimpleEnum.values()[0]
        private set

    val raw: Int
        get() = value!!.raw

    constructor()
    constructor(value: Int) { setEnum(value) }
    constructor(value: EnumSimpleEnum) { setEnum(value) }
    constructor(value: EnumSimple) { setEnum(value) }

    fun setDefault() { setEnum(0.toInt()) }

    fun setEnum(value: Int) { this.value = EnumSimpleEnum.mapValue(value) }
    fun setEnum(value: EnumSimpleEnum) { this.value = value }
    fun setEnum(value: EnumSimple) { this.value = value.value }

    override fun compareTo(other: EnumSimple): Int
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

        if (!EnumSimple::class.java.isAssignableFrom(other.javaClass))
            return false

        val enm = other as EnumSimple? ?: return false

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
