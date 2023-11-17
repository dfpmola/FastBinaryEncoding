//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding UInt64 field model
type FieldModelUInt64 struct {
    // Field model buffer
    buffer *Buffer
    // Field model buffer offset
    offset int
}

// Create a new UInt64 field model
func NewFieldModelUInt64(buffer *Buffer, offset int) *FieldModelUInt64 {
    return &FieldModelUInt64{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelUInt64) FBESize() int { return 8 }
// Get the field extra size
func (fm *FieldModelUInt64) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelUInt64) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelUInt64) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelUInt64) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelUInt64) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelUInt64) Verify() bool { return true }

// Get the value
func (fm *FieldModelUInt64) Get() (uint64, error) {
    return fm.GetDefault(0)
}

// Get the value with provided default value
func (fm *FieldModelUInt64) GetDefault(defaults uint64) (uint64, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return defaults, nil
    }

    return ReadUInt64(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), nil
}

// Set the value
func (fm *FieldModelUInt64) Set(value uint64) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    WriteUInt64(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return nil
}
