//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class EnumEmptyEnum
{
    ;

    var raw: Int = 0
        private set

    constructor(value: Byte) { this.raw = value.toInt() }
    constructor(value: Short) { this.raw = value.toInt() }
    constructor(value: Int) { this.raw = value.toInt() }
    constructor(value: Long) { this.raw = value.toInt() }
    constructor(value: EnumEmptyEnum) { this.raw = value.raw }

    override fun toString(): String
    {
        return "<empty>"
    }

    companion object
    {
        private val mapping = java.util.HashMap<Int, EnumEmptyEnum>()

        init
        {
            for (value in EnumEmptyEnum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Int): EnumEmptyEnum? { return mapping[value] }
    }
}
