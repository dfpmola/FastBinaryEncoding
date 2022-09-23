//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

// Fast Binary Encoding com.chronoxor.enums client
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class Client : com.chronoxor.fbe.Client, IClientListener
{
    // Client sender models accessors

    // Client receiver values accessors

    // Client receiver models accessors

    constructor() : super(false)
    {
    }

    constructor(sendBuffer: com.chronoxor.fbe.Buffer, receiveBuffer: com.chronoxor.fbe.Buffer) : super(sendBuffer, receiveBuffer, false)
    {
    }

    fun send(obj: Any): Long
    {
        return sendListener(this, obj)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun sendListener(listener: IClientListener, obj: Any): Long
    {

        return 0
    }


    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: IClientListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {

        return false
    }
}
