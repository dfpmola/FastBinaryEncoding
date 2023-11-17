//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

package fbe

import "errors"

// Fast Binary Encoding Float final model
type FinalModelFloat struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new Float final model
func NewFinalModelFloat(buffer *Buffer, offset int) *FinalModelFloat {
    return &FinalModelFloat{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelFloat) FBEAllocationSize(value float32) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelFloat) FBESize() int { return 4 }

// Get the final offset
func (fm *FinalModelFloat) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelFloat) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelFloat) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelFloat) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelFloat) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelFloat) Get() (float32, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0.0, 0, errors.New("model is broken")
    }

    return ReadFloat(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), fm.FBESize(), nil
}

// Set the value
func (fm *FinalModelFloat) Set(value float32) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    WriteFloat(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return fm.FBESize(), nil
}
