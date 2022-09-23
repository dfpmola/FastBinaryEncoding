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

// Fast Binary Encoding StructSimple field model
type FieldModelStructSimple struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    Id *fbe.FieldModelInt32
    F1 *fbe.FieldModelBool
    F2 *fbe.FieldModelBool
    F3 *fbe.FieldModelByte
    F4 *fbe.FieldModelByte
    F5 *fbe.FieldModelChar
    F6 *fbe.FieldModelChar
    F7 *fbe.FieldModelWChar
    F8 *fbe.FieldModelWChar
    F9 *fbe.FieldModelInt8
    F10 *fbe.FieldModelInt8
    F11 *fbe.FieldModelUInt8
    F12 *fbe.FieldModelUInt8
    F13 *fbe.FieldModelInt16
    F14 *fbe.FieldModelInt16
    F15 *fbe.FieldModelUInt16
    F16 *fbe.FieldModelUInt16
    F17 *fbe.FieldModelInt32
    F18 *fbe.FieldModelInt32
    F19 *fbe.FieldModelUInt32
    F20 *fbe.FieldModelUInt32
    F21 *fbe.FieldModelInt64
    F22 *fbe.FieldModelInt64
    F23 *fbe.FieldModelUInt64
    F24 *fbe.FieldModelUInt64
    F25 *fbe.FieldModelFloat
    F26 *fbe.FieldModelFloat
    F27 *fbe.FieldModelDouble
    F28 *fbe.FieldModelDouble
    F29 *fbe.FieldModelDecimal
    F30 *fbe.FieldModelDecimal
    F31 *fbe.FieldModelString
    F32 *fbe.FieldModelString
    F33 *fbe.FieldModelTimestamp
    F34 *fbe.FieldModelTimestamp
    F35 *fbe.FieldModelTimestamp
    F36 *fbe.FieldModelUUID
    F37 *fbe.FieldModelUUID
    F38 *fbe.FieldModelUUID
    F39 *proto.FieldModelOrderSide
    F40 *proto.FieldModelOrderType
    F41 *proto.FieldModelOrder
    F42 *proto.FieldModelBalance
    F43 *proto.FieldModelState
    F44 *proto.FieldModelAccount
}

// Create a new StructSimple field model
func NewFieldModelStructSimple(buffer *fbe.Buffer, offset int) *FieldModelStructSimple {
    fbeResult := FieldModelStructSimple{buffer: buffer, offset: offset}
    fbeResult.Id = fbe.NewFieldModelInt32(buffer, 4 + 4)
    fbeResult.F1 = fbe.NewFieldModelBool(buffer, fbeResult.Id.FBEOffset() + fbeResult.Id.FBESize())
    fbeResult.F2 = fbe.NewFieldModelBool(buffer, fbeResult.F1.FBEOffset() + fbeResult.F1.FBESize())
    fbeResult.F3 = fbe.NewFieldModelByte(buffer, fbeResult.F2.FBEOffset() + fbeResult.F2.FBESize())
    fbeResult.F4 = fbe.NewFieldModelByte(buffer, fbeResult.F3.FBEOffset() + fbeResult.F3.FBESize())
    fbeResult.F5 = fbe.NewFieldModelChar(buffer, fbeResult.F4.FBEOffset() + fbeResult.F4.FBESize())
    fbeResult.F6 = fbe.NewFieldModelChar(buffer, fbeResult.F5.FBEOffset() + fbeResult.F5.FBESize())
    fbeResult.F7 = fbe.NewFieldModelWChar(buffer, fbeResult.F6.FBEOffset() + fbeResult.F6.FBESize())
    fbeResult.F8 = fbe.NewFieldModelWChar(buffer, fbeResult.F7.FBEOffset() + fbeResult.F7.FBESize())
    fbeResult.F9 = fbe.NewFieldModelInt8(buffer, fbeResult.F8.FBEOffset() + fbeResult.F8.FBESize())
    fbeResult.F10 = fbe.NewFieldModelInt8(buffer, fbeResult.F9.FBEOffset() + fbeResult.F9.FBESize())
    fbeResult.F11 = fbe.NewFieldModelUInt8(buffer, fbeResult.F10.FBEOffset() + fbeResult.F10.FBESize())
    fbeResult.F12 = fbe.NewFieldModelUInt8(buffer, fbeResult.F11.FBEOffset() + fbeResult.F11.FBESize())
    fbeResult.F13 = fbe.NewFieldModelInt16(buffer, fbeResult.F12.FBEOffset() + fbeResult.F12.FBESize())
    fbeResult.F14 = fbe.NewFieldModelInt16(buffer, fbeResult.F13.FBEOffset() + fbeResult.F13.FBESize())
    fbeResult.F15 = fbe.NewFieldModelUInt16(buffer, fbeResult.F14.FBEOffset() + fbeResult.F14.FBESize())
    fbeResult.F16 = fbe.NewFieldModelUInt16(buffer, fbeResult.F15.FBEOffset() + fbeResult.F15.FBESize())
    fbeResult.F17 = fbe.NewFieldModelInt32(buffer, fbeResult.F16.FBEOffset() + fbeResult.F16.FBESize())
    fbeResult.F18 = fbe.NewFieldModelInt32(buffer, fbeResult.F17.FBEOffset() + fbeResult.F17.FBESize())
    fbeResult.F19 = fbe.NewFieldModelUInt32(buffer, fbeResult.F18.FBEOffset() + fbeResult.F18.FBESize())
    fbeResult.F20 = fbe.NewFieldModelUInt32(buffer, fbeResult.F19.FBEOffset() + fbeResult.F19.FBESize())
    fbeResult.F21 = fbe.NewFieldModelInt64(buffer, fbeResult.F20.FBEOffset() + fbeResult.F20.FBESize())
    fbeResult.F22 = fbe.NewFieldModelInt64(buffer, fbeResult.F21.FBEOffset() + fbeResult.F21.FBESize())
    fbeResult.F23 = fbe.NewFieldModelUInt64(buffer, fbeResult.F22.FBEOffset() + fbeResult.F22.FBESize())
    fbeResult.F24 = fbe.NewFieldModelUInt64(buffer, fbeResult.F23.FBEOffset() + fbeResult.F23.FBESize())
    fbeResult.F25 = fbe.NewFieldModelFloat(buffer, fbeResult.F24.FBEOffset() + fbeResult.F24.FBESize())
    fbeResult.F26 = fbe.NewFieldModelFloat(buffer, fbeResult.F25.FBEOffset() + fbeResult.F25.FBESize())
    fbeResult.F27 = fbe.NewFieldModelDouble(buffer, fbeResult.F26.FBEOffset() + fbeResult.F26.FBESize())
    fbeResult.F28 = fbe.NewFieldModelDouble(buffer, fbeResult.F27.FBEOffset() + fbeResult.F27.FBESize())
    fbeResult.F29 = fbe.NewFieldModelDecimal(buffer, fbeResult.F28.FBEOffset() + fbeResult.F28.FBESize())
    fbeResult.F30 = fbe.NewFieldModelDecimal(buffer, fbeResult.F29.FBEOffset() + fbeResult.F29.FBESize())
    fbeResult.F31 = fbe.NewFieldModelString(buffer, fbeResult.F30.FBEOffset() + fbeResult.F30.FBESize())
    fbeResult.F32 = fbe.NewFieldModelString(buffer, fbeResult.F31.FBEOffset() + fbeResult.F31.FBESize())
    fbeResult.F33 = fbe.NewFieldModelTimestamp(buffer, fbeResult.F32.FBEOffset() + fbeResult.F32.FBESize())
    fbeResult.F34 = fbe.NewFieldModelTimestamp(buffer, fbeResult.F33.FBEOffset() + fbeResult.F33.FBESize())
    fbeResult.F35 = fbe.NewFieldModelTimestamp(buffer, fbeResult.F34.FBEOffset() + fbeResult.F34.FBESize())
    fbeResult.F36 = fbe.NewFieldModelUUID(buffer, fbeResult.F35.FBEOffset() + fbeResult.F35.FBESize())
    fbeResult.F37 = fbe.NewFieldModelUUID(buffer, fbeResult.F36.FBEOffset() + fbeResult.F36.FBESize())
    fbeResult.F38 = fbe.NewFieldModelUUID(buffer, fbeResult.F37.FBEOffset() + fbeResult.F37.FBESize())
    fbeResult.F39 = proto.NewFieldModelOrderSide(buffer, fbeResult.F38.FBEOffset() + fbeResult.F38.FBESize())
    fbeResult.F40 = proto.NewFieldModelOrderType(buffer, fbeResult.F39.FBEOffset() + fbeResult.F39.FBESize())
    fbeResult.F41 = proto.NewFieldModelOrder(buffer, fbeResult.F40.FBEOffset() + fbeResult.F40.FBESize())
    fbeResult.F42 = proto.NewFieldModelBalance(buffer, fbeResult.F41.FBEOffset() + fbeResult.F41.FBESize())
    fbeResult.F43 = proto.NewFieldModelState(buffer, fbeResult.F42.FBEOffset() + fbeResult.F42.FBESize())
    fbeResult.F44 = proto.NewFieldModelAccount(buffer, fbeResult.F43.FBEOffset() + fbeResult.F43.FBESize())
    return &fbeResult
}

// Get the field size
func (fm *FieldModelStructSimple) FBESize() int { return 4 }

// Get the field body size
func (fm *FieldModelStructSimple) FBEBody() int {
    fbeResult := 4 + 4 +
        fm.Id.FBESize() +
        fm.F1.FBESize() +
        fm.F2.FBESize() +
        fm.F3.FBESize() +
        fm.F4.FBESize() +
        fm.F5.FBESize() +
        fm.F6.FBESize() +
        fm.F7.FBESize() +
        fm.F8.FBESize() +
        fm.F9.FBESize() +
        fm.F10.FBESize() +
        fm.F11.FBESize() +
        fm.F12.FBESize() +
        fm.F13.FBESize() +
        fm.F14.FBESize() +
        fm.F15.FBESize() +
        fm.F16.FBESize() +
        fm.F17.FBESize() +
        fm.F18.FBESize() +
        fm.F19.FBESize() +
        fm.F20.FBESize() +
        fm.F21.FBESize() +
        fm.F22.FBESize() +
        fm.F23.FBESize() +
        fm.F24.FBESize() +
        fm.F25.FBESize() +
        fm.F26.FBESize() +
        fm.F27.FBESize() +
        fm.F28.FBESize() +
        fm.F29.FBESize() +
        fm.F30.FBESize() +
        fm.F31.FBESize() +
        fm.F32.FBESize() +
        fm.F33.FBESize() +
        fm.F34.FBESize() +
        fm.F35.FBESize() +
        fm.F36.FBESize() +
        fm.F37.FBESize() +
        fm.F38.FBESize() +
        fm.F39.FBESize() +
        fm.F40.FBESize() +
        fm.F41.FBESize() +
        fm.F42.FBESize() +
        fm.F43.FBESize() +
        fm.F44.FBESize() +
        0
    return fbeResult
}

// Get the field extra size
func (fm *FieldModelStructSimple) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fm.buffer.Shift(fbeStructOffset)

    fbeResult := fm.FBEBody() +
        fm.Id.FBEExtra() +
        fm.F1.FBEExtra() +
        fm.F2.FBEExtra() +
        fm.F3.FBEExtra() +
        fm.F4.FBEExtra() +
        fm.F5.FBEExtra() +
        fm.F6.FBEExtra() +
        fm.F7.FBEExtra() +
        fm.F8.FBEExtra() +
        fm.F9.FBEExtra() +
        fm.F10.FBEExtra() +
        fm.F11.FBEExtra() +
        fm.F12.FBEExtra() +
        fm.F13.FBEExtra() +
        fm.F14.FBEExtra() +
        fm.F15.FBEExtra() +
        fm.F16.FBEExtra() +
        fm.F17.FBEExtra() +
        fm.F18.FBEExtra() +
        fm.F19.FBEExtra() +
        fm.F20.FBEExtra() +
        fm.F21.FBEExtra() +
        fm.F22.FBEExtra() +
        fm.F23.FBEExtra() +
        fm.F24.FBEExtra() +
        fm.F25.FBEExtra() +
        fm.F26.FBEExtra() +
        fm.F27.FBEExtra() +
        fm.F28.FBEExtra() +
        fm.F29.FBEExtra() +
        fm.F30.FBEExtra() +
        fm.F31.FBEExtra() +
        fm.F32.FBEExtra() +
        fm.F33.FBEExtra() +
        fm.F34.FBEExtra() +
        fm.F35.FBEExtra() +
        fm.F36.FBEExtra() +
        fm.F37.FBEExtra() +
        fm.F38.FBEExtra() +
        fm.F39.FBEExtra() +
        fm.F40.FBEExtra() +
        fm.F41.FBEExtra() +
        fm.F42.FBEExtra() +
        fm.F43.FBEExtra() +
        fm.F44.FBEExtra() +
        0

    fm.buffer.Unshift(fbeStructOffset)

    return fbeResult
}

// Get the field type
func (fm *FieldModelStructSimple) FBEType() int { return 110 }

// Get the field offset
func (fm *FieldModelStructSimple) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelStructSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelStructSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelStructSimple) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FieldModelStructSimple) Verify() bool { return fm.VerifyType(true) }

// Check if the struct value and its type are valid
func (fm *FieldModelStructSimple) VerifyType(fbeVerifyType bool) bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return true
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4 + 4) > fm.buffer.Size()) {
        return false
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset))
    if fbeStructSize < (4 + 4) {
        return false
    }

    fbeStructType := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset + 4))
    if fbeVerifyType && (fbeStructType != fm.FBEType()) {
        return false
    }

    fm.buffer.Shift(fbeStructOffset)
    fbeResult := fm.VerifyFields(fbeStructSize)
    fm.buffer.Unshift(fbeStructOffset)
    return fbeResult
}

// // Check if the struct value fields are valid
func (fm *FieldModelStructSimple) VerifyFields(fbeStructSize int) bool {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.Id.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.Id.Verify() {
        return false
    }
    fbeCurrentSize += fm.Id.FBESize()

    if (fbeCurrentSize + fm.F1.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F1.Verify() {
        return false
    }
    fbeCurrentSize += fm.F1.FBESize()

    if (fbeCurrentSize + fm.F2.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F2.Verify() {
        return false
    }
    fbeCurrentSize += fm.F2.FBESize()

    if (fbeCurrentSize + fm.F3.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F3.Verify() {
        return false
    }
    fbeCurrentSize += fm.F3.FBESize()

    if (fbeCurrentSize + fm.F4.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F4.Verify() {
        return false
    }
    fbeCurrentSize += fm.F4.FBESize()

    if (fbeCurrentSize + fm.F5.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F5.Verify() {
        return false
    }
    fbeCurrentSize += fm.F5.FBESize()

    if (fbeCurrentSize + fm.F6.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F6.Verify() {
        return false
    }
    fbeCurrentSize += fm.F6.FBESize()

    if (fbeCurrentSize + fm.F7.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F7.Verify() {
        return false
    }
    fbeCurrentSize += fm.F7.FBESize()

    if (fbeCurrentSize + fm.F8.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F8.Verify() {
        return false
    }
    fbeCurrentSize += fm.F8.FBESize()

    if (fbeCurrentSize + fm.F9.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F9.Verify() {
        return false
    }
    fbeCurrentSize += fm.F9.FBESize()

    if (fbeCurrentSize + fm.F10.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F10.Verify() {
        return false
    }
    fbeCurrentSize += fm.F10.FBESize()

    if (fbeCurrentSize + fm.F11.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F11.Verify() {
        return false
    }
    fbeCurrentSize += fm.F11.FBESize()

    if (fbeCurrentSize + fm.F12.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F12.Verify() {
        return false
    }
    fbeCurrentSize += fm.F12.FBESize()

    if (fbeCurrentSize + fm.F13.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F13.Verify() {
        return false
    }
    fbeCurrentSize += fm.F13.FBESize()

    if (fbeCurrentSize + fm.F14.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F14.Verify() {
        return false
    }
    fbeCurrentSize += fm.F14.FBESize()

    if (fbeCurrentSize + fm.F15.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F15.Verify() {
        return false
    }
    fbeCurrentSize += fm.F15.FBESize()

    if (fbeCurrentSize + fm.F16.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F16.Verify() {
        return false
    }
    fbeCurrentSize += fm.F16.FBESize()

    if (fbeCurrentSize + fm.F17.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F17.Verify() {
        return false
    }
    fbeCurrentSize += fm.F17.FBESize()

    if (fbeCurrentSize + fm.F18.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F18.Verify() {
        return false
    }
    fbeCurrentSize += fm.F18.FBESize()

    if (fbeCurrentSize + fm.F19.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F19.Verify() {
        return false
    }
    fbeCurrentSize += fm.F19.FBESize()

    if (fbeCurrentSize + fm.F20.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F20.Verify() {
        return false
    }
    fbeCurrentSize += fm.F20.FBESize()

    if (fbeCurrentSize + fm.F21.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F21.Verify() {
        return false
    }
    fbeCurrentSize += fm.F21.FBESize()

    if (fbeCurrentSize + fm.F22.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F22.Verify() {
        return false
    }
    fbeCurrentSize += fm.F22.FBESize()

    if (fbeCurrentSize + fm.F23.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F23.Verify() {
        return false
    }
    fbeCurrentSize += fm.F23.FBESize()

    if (fbeCurrentSize + fm.F24.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F24.Verify() {
        return false
    }
    fbeCurrentSize += fm.F24.FBESize()

    if (fbeCurrentSize + fm.F25.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F25.Verify() {
        return false
    }
    fbeCurrentSize += fm.F25.FBESize()

    if (fbeCurrentSize + fm.F26.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F26.Verify() {
        return false
    }
    fbeCurrentSize += fm.F26.FBESize()

    if (fbeCurrentSize + fm.F27.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F27.Verify() {
        return false
    }
    fbeCurrentSize += fm.F27.FBESize()

    if (fbeCurrentSize + fm.F28.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F28.Verify() {
        return false
    }
    fbeCurrentSize += fm.F28.FBESize()

    if (fbeCurrentSize + fm.F29.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F29.Verify() {
        return false
    }
    fbeCurrentSize += fm.F29.FBESize()

    if (fbeCurrentSize + fm.F30.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F30.Verify() {
        return false
    }
    fbeCurrentSize += fm.F30.FBESize()

    if (fbeCurrentSize + fm.F31.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F31.Verify() {
        return false
    }
    fbeCurrentSize += fm.F31.FBESize()

    if (fbeCurrentSize + fm.F32.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F32.Verify() {
        return false
    }
    fbeCurrentSize += fm.F32.FBESize()

    if (fbeCurrentSize + fm.F33.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F33.Verify() {
        return false
    }
    fbeCurrentSize += fm.F33.FBESize()

    if (fbeCurrentSize + fm.F34.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F34.Verify() {
        return false
    }
    fbeCurrentSize += fm.F34.FBESize()

    if (fbeCurrentSize + fm.F35.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F35.Verify() {
        return false
    }
    fbeCurrentSize += fm.F35.FBESize()

    if (fbeCurrentSize + fm.F36.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F36.Verify() {
        return false
    }
    fbeCurrentSize += fm.F36.FBESize()

    if (fbeCurrentSize + fm.F37.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F37.Verify() {
        return false
    }
    fbeCurrentSize += fm.F37.FBESize()

    if (fbeCurrentSize + fm.F38.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F38.Verify() {
        return false
    }
    fbeCurrentSize += fm.F38.FBESize()

    if (fbeCurrentSize + fm.F39.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F39.Verify() {
        return false
    }
    fbeCurrentSize += fm.F39.FBESize()

    if (fbeCurrentSize + fm.F40.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F40.Verify() {
        return false
    }
    fbeCurrentSize += fm.F40.FBESize()

    if (fbeCurrentSize + fm.F41.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F41.Verify() {
        return false
    }
    fbeCurrentSize += fm.F41.FBESize()

    if (fbeCurrentSize + fm.F42.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F42.Verify() {
        return false
    }
    fbeCurrentSize += fm.F42.FBESize()

    if (fbeCurrentSize + fm.F43.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F43.Verify() {
        return false
    }
    fbeCurrentSize += fm.F43.FBESize()

    if (fbeCurrentSize + fm.F44.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.F44.Verify() {
        return false
    }
    fbeCurrentSize += fm.F44.FBESize()

    return true
}

// Get the struct value (begin phase)
func (fm *FieldModelStructSimple) GetBegin() (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, nil
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4 + 4) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset))
    if fbeStructSize < (4 + 4) {
        return 0, errors.New("model is broken")
    }

    fm.buffer.Shift(fbeStructOffset)
    return fbeStructOffset, nil
}

// Get the struct value (end phase)
func (fm *FieldModelStructSimple) GetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Get the struct value
func (fm *FieldModelStructSimple) Get() (*StructSimple, error) {
    fbeResult := NewStructSimple()
    return fbeResult, fm.GetValue(fbeResult)
}

// Get the struct value by the given pointer
func (fm *FieldModelStructSimple) GetValue(fbeValue *StructSimple) error {
    fbeBegin, err := fm.GetBegin()
    if fbeBegin == 0 {
        return err
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset()))
    fm.GetFields(fbeValue, fbeStructSize)
    fm.GetEnd(fbeBegin)
    return nil
}

// Get the struct fields values
func (fm *FieldModelStructSimple) GetFields(fbeValue *StructSimple, fbeStructSize int) {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.Id.FBESize()) <= fbeStructSize {
        fbeValue.Id, _ = fm.Id.Get()
    } else {
        fbeValue.Id = 0
    }
    fbeCurrentSize += fm.Id.FBESize()

    if (fbeCurrentSize + fm.F1.FBESize()) <= fbeStructSize {
        fbeValue.F1, _ = fm.F1.Get()
    } else {
        fbeValue.F1 = false
    }
    fbeCurrentSize += fm.F1.FBESize()

    if (fbeCurrentSize + fm.F2.FBESize()) <= fbeStructSize {
        fbeValue.F2, _ = fm.F2.GetDefault(true)
    } else {
        fbeValue.F2 = true
    }
    fbeCurrentSize += fm.F2.FBESize()

    if (fbeCurrentSize + fm.F3.FBESize()) <= fbeStructSize {
        fbeValue.F3, _ = fm.F3.Get()
    } else {
        fbeValue.F3 = 0
    }
    fbeCurrentSize += fm.F3.FBESize()

    if (fbeCurrentSize + fm.F4.FBESize()) <= fbeStructSize {
        fbeValue.F4, _ = fm.F4.GetDefault(255)
    } else {
        fbeValue.F4 = 255
    }
    fbeCurrentSize += fm.F4.FBESize()

    if (fbeCurrentSize + fm.F5.FBESize()) <= fbeStructSize {
        fbeValue.F5, _ = fm.F5.Get()
    } else {
        fbeValue.F5 = '\000'
    }
    fbeCurrentSize += fm.F5.FBESize()

    if (fbeCurrentSize + fm.F6.FBESize()) <= fbeStructSize {
        fbeValue.F6, _ = fm.F6.GetDefault('!')
    } else {
        fbeValue.F6 = '!'
    }
    fbeCurrentSize += fm.F6.FBESize()

    if (fbeCurrentSize + fm.F7.FBESize()) <= fbeStructSize {
        fbeValue.F7, _ = fm.F7.Get()
    } else {
        fbeValue.F7 = '\000'
    }
    fbeCurrentSize += fm.F7.FBESize()

    if (fbeCurrentSize + fm.F8.FBESize()) <= fbeStructSize {
        fbeValue.F8, _ = fm.F8.GetDefault(rune(0x0444))
    } else {
        fbeValue.F8 = rune(0x0444)
    }
    fbeCurrentSize += fm.F8.FBESize()

    if (fbeCurrentSize + fm.F9.FBESize()) <= fbeStructSize {
        fbeValue.F9, _ = fm.F9.Get()
    } else {
        fbeValue.F9 = 0
    }
    fbeCurrentSize += fm.F9.FBESize()

    if (fbeCurrentSize + fm.F10.FBESize()) <= fbeStructSize {
        fbeValue.F10, _ = fm.F10.GetDefault(127)
    } else {
        fbeValue.F10 = 127
    }
    fbeCurrentSize += fm.F10.FBESize()

    if (fbeCurrentSize + fm.F11.FBESize()) <= fbeStructSize {
        fbeValue.F11, _ = fm.F11.GetDefault(0)
    } else {
        fbeValue.F11 = 0
    }
    fbeCurrentSize += fm.F11.FBESize()

    if (fbeCurrentSize + fm.F12.FBESize()) <= fbeStructSize {
        fbeValue.F12, _ = fm.F12.GetDefault(255)
    } else {
        fbeValue.F12 = 255
    }
    fbeCurrentSize += fm.F12.FBESize()

    if (fbeCurrentSize + fm.F13.FBESize()) <= fbeStructSize {
        fbeValue.F13, _ = fm.F13.Get()
    } else {
        fbeValue.F13 = 0
    }
    fbeCurrentSize += fm.F13.FBESize()

    if (fbeCurrentSize + fm.F14.FBESize()) <= fbeStructSize {
        fbeValue.F14, _ = fm.F14.GetDefault(32767)
    } else {
        fbeValue.F14 = 32767
    }
    fbeCurrentSize += fm.F14.FBESize()

    if (fbeCurrentSize + fm.F15.FBESize()) <= fbeStructSize {
        fbeValue.F15, _ = fm.F15.GetDefault(0)
    } else {
        fbeValue.F15 = 0
    }
    fbeCurrentSize += fm.F15.FBESize()

    if (fbeCurrentSize + fm.F16.FBESize()) <= fbeStructSize {
        fbeValue.F16, _ = fm.F16.GetDefault(65535)
    } else {
        fbeValue.F16 = 65535
    }
    fbeCurrentSize += fm.F16.FBESize()

    if (fbeCurrentSize + fm.F17.FBESize()) <= fbeStructSize {
        fbeValue.F17, _ = fm.F17.Get()
    } else {
        fbeValue.F17 = 0
    }
    fbeCurrentSize += fm.F17.FBESize()

    if (fbeCurrentSize + fm.F18.FBESize()) <= fbeStructSize {
        fbeValue.F18, _ = fm.F18.GetDefault(2147483647)
    } else {
        fbeValue.F18 = 2147483647
    }
    fbeCurrentSize += fm.F18.FBESize()

    if (fbeCurrentSize + fm.F19.FBESize()) <= fbeStructSize {
        fbeValue.F19, _ = fm.F19.GetDefault(0)
    } else {
        fbeValue.F19 = 0
    }
    fbeCurrentSize += fm.F19.FBESize()

    if (fbeCurrentSize + fm.F20.FBESize()) <= fbeStructSize {
        fbeValue.F20, _ = fm.F20.GetDefault(4294967295)
    } else {
        fbeValue.F20 = 4294967295
    }
    fbeCurrentSize += fm.F20.FBESize()

    if (fbeCurrentSize + fm.F21.FBESize()) <= fbeStructSize {
        fbeValue.F21, _ = fm.F21.Get()
    } else {
        fbeValue.F21 = 0
    }
    fbeCurrentSize += fm.F21.FBESize()

    if (fbeCurrentSize + fm.F22.FBESize()) <= fbeStructSize {
        fbeValue.F22, _ = fm.F22.GetDefault(9223372036854775807)
    } else {
        fbeValue.F22 = 9223372036854775807
    }
    fbeCurrentSize += fm.F22.FBESize()

    if (fbeCurrentSize + fm.F23.FBESize()) <= fbeStructSize {
        fbeValue.F23, _ = fm.F23.GetDefault(0)
    } else {
        fbeValue.F23 = 0
    }
    fbeCurrentSize += fm.F23.FBESize()

    if (fbeCurrentSize + fm.F24.FBESize()) <= fbeStructSize {
        fbeValue.F24, _ = fm.F24.GetDefault(18446744073709551615)
    } else {
        fbeValue.F24 = 18446744073709551615
    }
    fbeCurrentSize += fm.F24.FBESize()

    if (fbeCurrentSize + fm.F25.FBESize()) <= fbeStructSize {
        fbeValue.F25, _ = fm.F25.Get()
    } else {
        fbeValue.F25 = 0.0
    }
    fbeCurrentSize += fm.F25.FBESize()

    if (fbeCurrentSize + fm.F26.FBESize()) <= fbeStructSize {
        fbeValue.F26, _ = fm.F26.GetDefault(float32(123.456))
    } else {
        fbeValue.F26 = float32(123.456)
    }
    fbeCurrentSize += fm.F26.FBESize()

    if (fbeCurrentSize + fm.F27.FBESize()) <= fbeStructSize {
        fbeValue.F27, _ = fm.F27.Get()
    } else {
        fbeValue.F27 = 0.0
    }
    fbeCurrentSize += fm.F27.FBESize()

    if (fbeCurrentSize + fm.F28.FBESize()) <= fbeStructSize {
        fbeValue.F28, _ = fm.F28.GetDefault(float64(-123.456e+123))
    } else {
        fbeValue.F28 = float64(-123.456e+123)
    }
    fbeCurrentSize += fm.F28.FBESize()

    if (fbeCurrentSize + fm.F29.FBESize()) <= fbeStructSize {
        fbeValue.F29, _ = fm.F29.Get()
    } else {
        fbeValue.F29 = fbe.DecimalZero()
    }
    fbeCurrentSize += fm.F29.FBESize()

    if (fbeCurrentSize + fm.F30.FBESize()) <= fbeStructSize {
        fbeValue.F30, _ = fm.F30.GetDefault(fbe.DecimalFromString("123456.123456"))
    } else {
        fbeValue.F30 = fbe.DecimalFromString("123456.123456")
    }
    fbeCurrentSize += fm.F30.FBESize()

    if (fbeCurrentSize + fm.F31.FBESize()) <= fbeStructSize {
        fbeValue.F31, _ = fm.F31.Get()
    } else {
        fbeValue.F31 = ""
    }
    fbeCurrentSize += fm.F31.FBESize()

    if (fbeCurrentSize + fm.F32.FBESize()) <= fbeStructSize {
        fbeValue.F32, _ = fm.F32.GetDefault("Initial string!")
    } else {
        fbeValue.F32 = "Initial string!"
    }
    fbeCurrentSize += fm.F32.FBESize()

    if (fbeCurrentSize + fm.F33.FBESize()) <= fbeStructSize {
        fbeValue.F33, _ = fm.F33.Get()
    } else {
        fbeValue.F33 = fbe.TimestampEpoch()
    }
    fbeCurrentSize += fm.F33.FBESize()

    if (fbeCurrentSize + fm.F34.FBESize()) <= fbeStructSize {
        fbeValue.F34, _ = fm.F34.GetDefault(fbe.TimestampEpoch())
    } else {
        fbeValue.F34 = fbe.TimestampEpoch()
    }
    fbeCurrentSize += fm.F34.FBESize()

    if (fbeCurrentSize + fm.F35.FBESize()) <= fbeStructSize {
        fbeValue.F35, _ = fm.F35.GetDefault(fbe.TimestampUTC())
    } else {
        fbeValue.F35 = fbe.TimestampUTC()
    }
    fbeCurrentSize += fm.F35.FBESize()

    if (fbeCurrentSize + fm.F36.FBESize()) <= fbeStructSize {
        fbeValue.F36, _ = fm.F36.Get()
    } else {
        fbeValue.F36 = fbe.UUIDNil()
    }
    fbeCurrentSize += fm.F36.FBESize()

    if (fbeCurrentSize + fm.F37.FBESize()) <= fbeStructSize {
        fbeValue.F37, _ = fm.F37.GetDefault(fbe.UUIDSequential())
    } else {
        fbeValue.F37 = fbe.UUIDSequential()
    }
    fbeCurrentSize += fm.F37.FBESize()

    if (fbeCurrentSize + fm.F38.FBESize()) <= fbeStructSize {
        fbeValue.F38, _ = fm.F38.GetDefault(fbe.UUIDFromString("123e4567-e89b-12d3-a456-426655440000"))
    } else {
        fbeValue.F38 = fbe.UUIDFromString("123e4567-e89b-12d3-a456-426655440000")
    }
    fbeCurrentSize += fm.F38.FBESize()

    if (fbeCurrentSize + fm.F39.FBESize()) <= fbeStructSize {
        _ = fm.F39.GetValue(&fbeValue.F39)
    } else {
        fbeValue.F39 = *proto.NewOrderSide()
    }
    fbeCurrentSize += fm.F39.FBESize()

    if (fbeCurrentSize + fm.F40.FBESize()) <= fbeStructSize {
        _ = fm.F40.GetValue(&fbeValue.F40)
    } else {
        fbeValue.F40 = *proto.NewOrderType()
    }
    fbeCurrentSize += fm.F40.FBESize()

    if (fbeCurrentSize + fm.F41.FBESize()) <= fbeStructSize {
        _ = fm.F41.GetValue(&fbeValue.F41)
    } else {
        fbeValue.F41 = *proto.NewOrder()
    }
    fbeCurrentSize += fm.F41.FBESize()

    if (fbeCurrentSize + fm.F42.FBESize()) <= fbeStructSize {
        _ = fm.F42.GetValue(&fbeValue.F42)
    } else {
        fbeValue.F42 = *proto.NewBalance()
    }
    fbeCurrentSize += fm.F42.FBESize()

    if (fbeCurrentSize + fm.F43.FBESize()) <= fbeStructSize {
        _ = fm.F43.GetValue(&fbeValue.F43)
    } else {
        fbeValue.F43 = *proto.NewState()
    }
    fbeCurrentSize += fm.F43.FBESize()

    if (fbeCurrentSize + fm.F44.FBESize()) <= fbeStructSize {
        _ = fm.F44.GetValue(&fbeValue.F44)
    } else {
        fbeValue.F44 = *proto.NewAccount()
    }
    fbeCurrentSize += fm.F44.FBESize()
}

// Set the struct value (begin phase)
func (fm *FieldModelStructSimple) SetBegin() (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbeStructSize := fm.FBEBody()
    fbeStructOffset := fm.buffer.Allocate(fbeStructSize) - fm.buffer.Offset()
    if (fbeStructOffset <= 0) || ((fm.buffer.Offset() + fbeStructOffset + fbeStructSize) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(fbeStructOffset))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset, uint32(fbeStructSize))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset + 4, uint32(fm.FBEType()))

    fm.buffer.Shift(fbeStructOffset)
    return fbeStructOffset, nil
}

// Set the struct value (end phase)
func (fm *FieldModelStructSimple) SetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Set the struct value
func (fm *FieldModelStructSimple) Set(fbeValue *StructSimple) error {
    fbeBegin, err := fm.SetBegin()
    if fbeBegin == 0 {
        return err
    }

    err = fm.SetFields(fbeValue)
    fm.SetEnd(fbeBegin)
    return err
}

// Set the struct fields values
func (fm *FieldModelStructSimple) SetFields(fbeValue *StructSimple) error {
    var err error = nil

    if err = fm.Id.Set(fbeValue.Id); err != nil {
        return err
    }
    if err = fm.F1.Set(fbeValue.F1); err != nil {
        return err
    }
    if err = fm.F2.Set(fbeValue.F2); err != nil {
        return err
    }
    if err = fm.F3.Set(fbeValue.F3); err != nil {
        return err
    }
    if err = fm.F4.Set(fbeValue.F4); err != nil {
        return err
    }
    if err = fm.F5.Set(fbeValue.F5); err != nil {
        return err
    }
    if err = fm.F6.Set(fbeValue.F6); err != nil {
        return err
    }
    if err = fm.F7.Set(fbeValue.F7); err != nil {
        return err
    }
    if err = fm.F8.Set(fbeValue.F8); err != nil {
        return err
    }
    if err = fm.F9.Set(fbeValue.F9); err != nil {
        return err
    }
    if err = fm.F10.Set(fbeValue.F10); err != nil {
        return err
    }
    if err = fm.F11.Set(fbeValue.F11); err != nil {
        return err
    }
    if err = fm.F12.Set(fbeValue.F12); err != nil {
        return err
    }
    if err = fm.F13.Set(fbeValue.F13); err != nil {
        return err
    }
    if err = fm.F14.Set(fbeValue.F14); err != nil {
        return err
    }
    if err = fm.F15.Set(fbeValue.F15); err != nil {
        return err
    }
    if err = fm.F16.Set(fbeValue.F16); err != nil {
        return err
    }
    if err = fm.F17.Set(fbeValue.F17); err != nil {
        return err
    }
    if err = fm.F18.Set(fbeValue.F18); err != nil {
        return err
    }
    if err = fm.F19.Set(fbeValue.F19); err != nil {
        return err
    }
    if err = fm.F20.Set(fbeValue.F20); err != nil {
        return err
    }
    if err = fm.F21.Set(fbeValue.F21); err != nil {
        return err
    }
    if err = fm.F22.Set(fbeValue.F22); err != nil {
        return err
    }
    if err = fm.F23.Set(fbeValue.F23); err != nil {
        return err
    }
    if err = fm.F24.Set(fbeValue.F24); err != nil {
        return err
    }
    if err = fm.F25.Set(fbeValue.F25); err != nil {
        return err
    }
    if err = fm.F26.Set(fbeValue.F26); err != nil {
        return err
    }
    if err = fm.F27.Set(fbeValue.F27); err != nil {
        return err
    }
    if err = fm.F28.Set(fbeValue.F28); err != nil {
        return err
    }
    if err = fm.F29.Set(fbeValue.F29); err != nil {
        return err
    }
    if err = fm.F30.Set(fbeValue.F30); err != nil {
        return err
    }
    if err = fm.F31.Set(fbeValue.F31); err != nil {
        return err
    }
    if err = fm.F32.Set(fbeValue.F32); err != nil {
        return err
    }
    if err = fm.F33.Set(fbeValue.F33); err != nil {
        return err
    }
    if err = fm.F34.Set(fbeValue.F34); err != nil {
        return err
    }
    if err = fm.F35.Set(fbeValue.F35); err != nil {
        return err
    }
    if err = fm.F36.Set(fbeValue.F36); err != nil {
        return err
    }
    if err = fm.F37.Set(fbeValue.F37); err != nil {
        return err
    }
    if err = fm.F38.Set(fbeValue.F38); err != nil {
        return err
    }
    if err = fm.F39.Set(&fbeValue.F39); err != nil {
        return err
    }
    if err = fm.F40.Set(&fbeValue.F40); err != nil {
        return err
    }
    if err = fm.F41.Set(&fbeValue.F41); err != nil {
        return err
    }
    if err = fm.F42.Set(&fbeValue.F42); err != nil {
        return err
    }
    if err = fm.F43.Set(&fbeValue.F43); err != nil {
        return err
    }
    if err = fm.F44.Set(&fbeValue.F44); err != nil {
        return err
    }
    return err
}
