//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

#include "fbe_protocol.h"

namespace FBE {

size_t Sender::send_serialized(size_t serialized)
{
    assert((serialized > 0) && "Invalid size of the serialized buffer!");
    if (serialized == 0)
        return 0;

    // Shift the send buffer
    this->_buffer->shift(serialized);

    // Send the value
    size_t sent = onSend(this->_buffer->data(), this->_buffer->size());
    this->_buffer->remove(0, sent);
    return sent;
}

void Receiver::receive(const void* data, size_t size)
{
    if (size == 0)
        return;

    assert((data != nullptr) && "Invalid buffer!");
    if (data == nullptr)
        return;

    // Storage buffer
    uint8_t* buffer1 = _buffer->data();
    size_t offset0 = _buffer->offset();
    size_t offset1 = _buffer->size();
    size_t size1 = _buffer->size();

    // Receive buffer
    const uint8_t* buffer2 = (const uint8_t*)data;
    size_t offset2 = 0;
    size_t size2 = size;

    // While receive buffer is available to handle...
    while (offset2 < size2)
    {
        const uint8_t* message_buffer = nullptr;
        size_t message_size = 0;

        // Try to receive message size
        bool message_size_copied = false;
        bool message_size_found = false;
        while (!message_size_found)
        {
            // Look into the storage buffer
            if (offset0 < size1)
            {
                size_t count = std::min(size1 - offset0, (size_t)4);
                if (count == 4)
                {
                    message_size_copied = true;
                    message_size_found = true;
                    message_size = (size_t)(*((const uint32_t*)(buffer1 + offset0)));
                    offset0 += 4;
                    break;
                }
                else
                {
                    // Fill remaining data from the receive buffer
                    if (offset2 < size2)
                    {
                        count = std::min(size2 - offset2, 4 - count);

                        // Allocate and refresh the storage buffer
                        _buffer->allocate(count);
                        buffer1 = _buffer->data();
                        size1 += count;

                        memcpy(buffer1 + offset1, buffer2 + offset2, count);
                        offset1 += count;
                        offset2 += count;
                        continue;
                    }
                    else
                        break;
                }
            }

            // Look into the receive buffer
            if (offset2 < size2)
            {
                size_t count = std::min(size2 - offset2, (size_t)4);
                if (count == 4)
                {
                    message_size_found = true;
                    message_size = (size_t)(*((const uint32_t*)(buffer2 + offset2)));
                    offset2 += 4;
                    break;
                }
                else
                {
                    // Allocate and refresh the storage buffer
                    _buffer->allocate(count);
                    buffer1 = _buffer->data();
                    size1 += count;

                    memcpy(buffer1 + offset1, buffer2 + offset2, count);
                    offset1 += count;
                    offset2 += count;
                    continue;
                }
            }
            else
                break;
        }

        if (!message_size_found)
            return;

        // Check the message full size
        size_t min_size = _final ? (4 + 4) : (4 + 4 + 4 + 4);
        assert((message_size >= min_size) && "Invalid receive data!");
        if (message_size < min_size)
            return;

        // Try to receive message body
        bool message_found = false;
        while (!message_found)
        {
            // Look into the storage buffer
            if (offset0 < size1)
            {
                size_t count = std::min(size1 - offset0, message_size - 4);
                if (count == (message_size - 4))
                {
                    message_found = true;
                    message_buffer = buffer1 + offset0 - 4;
                    offset0 += message_size - 4;
                    break;
                }
                else
                {
                    // Fill remaining data from the receive buffer
                    if (offset2 < size2)
                    {
                        // Copy message size into the storage buffer
                        if (!message_size_copied)
                        {
                            // Allocate and refresh the storage buffer
                            _buffer->allocate(4);
                            buffer1 = _buffer->data();
                            size1 += 4;

                            *((uint32_t*)(buffer1 + offset0)) = (uint32_t)message_size;
                            offset0 += 4;
                            offset1 += 4;

                            message_size_copied = true;
                        }

                        count = std::min(size2 - offset2, message_size - 4 - count);

                        // Allocate and refresh the storage buffer
                        _buffer->allocate(count);
                        buffer1 = _buffer->data();
                        size1 += count;

                        memcpy(buffer1 + offset1, buffer2 + offset2, count);
                        offset1 += count;
                        offset2 += count;
                        continue;
                    }
                    else
                        break;
                }
            }

            // Look into the receive buffer
            if (offset2 < size2)
            {
                size_t count = std::min(size2 - offset2, message_size - 4);
                if (!message_size_copied && (count == (message_size - 4)))
                {
                    message_found = true;
                    message_buffer = buffer2 + offset2 - 4;
                    offset2 += message_size - 4;
                    break;
                }
                else
                {
                    // Copy message size into the storage buffer
                    if (!message_size_copied)
                    {
                        // Allocate and refresh the storage buffer
                        _buffer->allocate(4);
                        buffer1 = _buffer->data();
                        size1 += 4;

                        *((uint32_t*)(buffer1 + offset0)) = (uint32_t)message_size;
                        offset0 += 4;
                        offset1 += 4;

                        message_size_copied = true;
                    }

                    // Allocate and refresh the storage buffer
                    _buffer->allocate(count);
                    buffer1 = _buffer->data();
                    size1 += count;

                    memcpy(buffer1 + offset1, buffer2 + offset2, count);
                    offset1 += count;
                    offset2 += count;
                    continue;
                }
            }
            else
                break;
        }

        if (!message_found)
        {
            // Copy message size into the storage buffer
            if (!message_size_copied)
            {
                // Allocate and refresh the storage buffer
                _buffer->allocate(4);
                buffer1 = _buffer->data();
                size1 += 4;

                *((uint32_t*)(buffer1 + offset0)) = (uint32_t)message_size;
                offset0 += 4;
                offset1 += 4;

                message_size_copied = true;
            }
            return;
        }

        [[maybe_unused]] uint32_t fbe_struct_size;
        uint32_t fbe_struct_type;

        // Read the message parameters
        if (_final)
        {
            fbe_struct_size = *((const uint32_t*)(message_buffer));
            fbe_struct_type = *((const uint32_t*)(message_buffer + 4));
        }
        else
        {
            uint32_t fbe_struct_offset = *((const uint32_t*)(message_buffer + 4));
            fbe_struct_size = *((const uint32_t*)(message_buffer + fbe_struct_offset));
            fbe_struct_type = *((const uint32_t*)(message_buffer + fbe_struct_offset + 4));
        }

        // Handle the message
        onReceive(fbe_struct_type, message_buffer, message_size);

        // Reset the storage buffer
        _buffer->reset();

        // Refresh the storage buffer
        buffer1 = _buffer->data();
        offset0 = _buffer->offset();
        offset1 = _buffer->size();
        size1 = _buffer->size();
    }
}

} // namespace FBE
