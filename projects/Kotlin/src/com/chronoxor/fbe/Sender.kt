//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding base sender
@Suppress("MemberVisibilityCanBePrivate")
abstract class Sender : ISenderListener
{
    // Get the bytes buffer
    var buffer: Buffer = Buffer()
        private set
    // Enable/Disable logging
    var logging: Boolean = false
    // Get the final protocol flag
    var final: Boolean = false
        private set

    protected constructor(final: Boolean) { this.final = final }
    protected constructor(buffer: Buffer, final: Boolean) { this.buffer = buffer; this.final = final }

    // Reset the sender buffer
    fun reset() { buffer.reset() }

    // Send serialized buffer.
    // Direct call of the method requires knowledge about internals of FBE models serialization.
    // Use it with care!
    fun sendSerialized(listener: ISenderListener, serialized: Long): Long
    {
        assert(serialized > 0) { "Invalid size of the serialized buffer!" }
        if (serialized <= 0)
            return 0

        // Shift the send buffer
        buffer.shift(serialized)

        // Send the value
        val sent = listener.onSend(buffer.data, 0, buffer.size)
        buffer.remove(0, sent)
        return sent
    }
}
