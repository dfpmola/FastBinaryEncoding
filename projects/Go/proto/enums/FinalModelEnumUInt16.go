//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumUInt16 final model
type FinalModelEnumUInt16 struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new EnumUInt16 final model
func NewFinalModelEnumUInt16(buffer *fbe.Buffer, offset int) *FinalModelEnumUInt16 {
    return &FinalModelEnumUInt16{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelEnumUInt16) FBEAllocationSize(value *EnumUInt16) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelEnumUInt16) FBESize() int { return 2 }

// Get the final offset
func (fm *FinalModelEnumUInt16) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelEnumUInt16) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelEnumUInt16) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelEnumUInt16) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelEnumUInt16) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelEnumUInt16) Get() (*EnumUInt16, int, error) {
    var value EnumUInt16
    size, err := fm.GetValueDefault(&value, EnumUInt16(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelEnumUInt16) GetDefault(defaults EnumUInt16) (*EnumUInt16, int, error) {
    var value EnumUInt16
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelEnumUInt16) GetValue(value *EnumUInt16) (int, error) {
    return fm.GetValueDefault(value, EnumUInt16(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelEnumUInt16) GetValueDefault(value *EnumUInt16, defaults EnumUInt16) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = EnumUInt16(fbe.ReadUInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelEnumUInt16) Set(value *EnumUInt16) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelEnumUInt16) SetValue(value EnumUInt16) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint16(value))
    return fm.FBESize(), nil
}
