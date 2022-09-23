//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// EnumChar enum key
type EnumCharKey uint8

// Convert EnumChar enum key to string
func (k EnumCharKey) String() string {
    return EnumChar(k).String()
}

// EnumChar enum
type EnumChar uint8

// EnumChar enum values
//noinspection GoSnakeCaseUsage
const (
    EnumChar_ENUM_VALUE_0 = EnumChar(0 + 0)
    EnumChar_ENUM_VALUE_1 = EnumChar(EnumChar('1') + 0)
    EnumChar_ENUM_VALUE_2 = EnumChar(EnumChar('1') + 1)
    EnumChar_ENUM_VALUE_3 = EnumChar(EnumChar('3') + 0)
    EnumChar_ENUM_VALUE_4 = EnumChar(EnumChar('3') + 1)
    EnumChar_ENUM_VALUE_5 = EnumChar(EnumChar_ENUM_VALUE_3)
)

// Create a new EnumChar enum
func NewEnumChar() *EnumChar {
    return new(EnumChar)
}

// Create a new EnumChar enum from the given value
func NewEnumCharFromValue(value uint8) *EnumChar {
    result := EnumChar(value)
    return &result
}

// Get the enum key
func (e EnumChar) Key() EnumCharKey {
    return EnumCharKey(e)
}

// Convert enum to optional
func (e *EnumChar) Optional() *EnumChar {
    return e
}

// Convert enum to string
func (e EnumChar) String() string {
    if e == EnumChar_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumChar_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumChar_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumChar_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumChar_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumChar_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumChar) MarshalJSON() ([]byte, error) {
    value := uint8(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumChar) UnmarshalJSON(buffer []byte) error {
    var result uint8
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumChar(result)
    return nil
}
