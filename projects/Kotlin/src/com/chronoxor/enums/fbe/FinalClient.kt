//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

// Fast Binary Encoding com.chronoxor.enums final client
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class FinalClient : com.chronoxor.fbe.Client, IFinalClientListener
{
    // Client sender models accessors

    // Client receiver values accessors

    // Client receiver models accessors

    constructor() : super(true)
    {
    }

    constructor(sendBuffer: com.chronoxor.fbe.Buffer, receiveBuffer: com.chronoxor.fbe.Buffer) : super(sendBuffer, receiveBuffer, true)
    {
    }

    fun send(obj: Any): Long
    {
        return sendListener(this, obj)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun sendListener(listener: IFinalClientListener, obj: Any): Long
    {

        return 0
    }


    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: IFinalClientListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {

        return false
    }
}
