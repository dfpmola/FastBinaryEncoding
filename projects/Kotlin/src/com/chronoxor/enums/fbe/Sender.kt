//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

// Fast Binary Encoding com.chronoxor.enums sender
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class Sender : com.chronoxor.fbe.Sender, ISenderListener
{
    // Sender models accessors

    constructor() : super(false)
    {
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, false)
    {
    }

    fun send(obj: Any): Long
    {
        return sendListener(this, obj)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun sendListener(listener: ISenderListener, obj: Any): Long
    {

        return 0
    }

}
