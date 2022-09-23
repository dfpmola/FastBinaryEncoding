//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

import Foundation

// Fast Binary Encoding Float field model
public class FieldModelFloat: FieldModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    // Field size
    public let fbeSize: Int = 4

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    // Get the value
    public func get(defaults: Float = 0.0) -> Float {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return defaults
        }

        return readFloat(offset: fbeOffset)
    }

    // Set the value
    public func set(value: Float) throws {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return
        }

        write(offset: fbeOffset, value: value)
    }
}
