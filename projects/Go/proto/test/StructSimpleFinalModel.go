//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding StructSimple final model
type StructSimpleFinalModel struct {
    // Model buffer
    buffer *fbe.Buffer

    // Final model
    model *FinalModelStructSimple
}

// Create a new StructSimple final model
func NewStructSimpleFinalModel(buffer *fbe.Buffer) *StructSimpleFinalModel {
    return &StructSimpleFinalModel{buffer: buffer, model: NewFinalModelStructSimple(buffer, 8)}
}

// Get the final model buffer
func (m *StructSimpleFinalModel) Buffer() *fbe.Buffer { return m.buffer }
// Get the final model
func (m *StructSimpleFinalModel) Model() *FinalModelStructSimple { return m.model }

// // Get the final model type
func (m *StructSimpleFinalModel) FBEType() int { return m.model.FBEType() }

// Check if the struct value is valid
func (m *StructSimpleFinalModel) Verify() bool {
    if (m.buffer.Offset() + m.model.FBEOffset() - 4) > m.buffer.Size() {
        return false
    }

    fbeStructSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 8))
    fbeStructType := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if (fbeStructSize <= 0) || (fbeStructType != m.FBEType()) {
        return false
    }

    return (8 + m.model.Verify()) == fbeStructSize
}

// Create a new final model (begin phase)
func (m *StructSimpleFinalModel) CreateBegin() int {
    fbeBegin := m.buffer.Allocate(4 + m.model.FBESize())
    return fbeBegin
}

// Create a new final model (end phase)
func (m *StructSimpleFinalModel) CreateEnd(fbeBegin int) int {
    fbeEnd := m.buffer.Size()
    fbeFullSize := fbeEnd - fbeBegin
    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4, uint32(fbeFullSize))
    return fbeFullSize
}

// Serialize the struct value
func (m *StructSimpleFinalModel) Serialize(value *StructSimple) (int, error) {
    fbeInitialSize := m.buffer.Size()

    fbeStructType := m.FBEType()
    fbeStructSize := 8 + m.model.FBEAllocationSize(value)
    fbeStructOffset := m.buffer.Allocate(fbeStructSize) - m.buffer.Offset()
    if (m.buffer.Offset() + fbeStructOffset + fbeStructSize) > m.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbeStructSize, err := m.model.Set(value)
    fbeStructSize += 8
    m.buffer.Resize(fbeInitialSize + fbeStructSize)

    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 8, uint32(fbeStructSize))
    fbe.WriteUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4, uint32(fbeStructType))

    return fbeStructSize, err
}

// Deserialize the struct value
func (m *StructSimpleFinalModel) Deserialize() (*StructSimple, int, error) {
    value := NewStructSimple()
    fbeFullSize, err := m.DeserializeValue(value)
    return value, fbeFullSize, err
}

// Deserialize the struct value by the given pointer
func (m *StructSimpleFinalModel) DeserializeValue(value *StructSimple) (int, error) {
    if (m.buffer.Offset() + m.model.FBEOffset()) > m.buffer.Size() {
        value = NewStructSimple()
        return 0, errors.New("model is broken")
    }

    fbeStructSize := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 8))
    fbeStructType := int(fbe.ReadUInt32(m.buffer.Data(), m.buffer.Offset() + m.model.FBEOffset() - 4))
    if (fbeStructSize <= 0) || (fbeStructType != m.FBEType()) {
        value = NewStructSimple()
        return 8, errors.New("model is broken")
    }

    fbeStructSize, err := m.model.GetValue(value)
    return 8 + fbeStructSize, err
}

// Move to the next struct value
func (m *StructSimpleFinalModel) Next(prev int) {
    m.model.FBEShift(prev)
}
