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

// EnumInt32 enum key
type EnumInt32Key int32

// Convert EnumInt32 enum key to string
func (k EnumInt32Key) String() string {
    return EnumInt32(k).String()
}

// EnumInt32 enum
type EnumInt32 int32

// EnumInt32 enum values
//noinspection GoSnakeCaseUsage
const (
    EnumInt32_ENUM_VALUE_0 = EnumInt32(0 + 0)
    EnumInt32_ENUM_VALUE_1 = EnumInt32(-2147483648 + 0)
    EnumInt32_ENUM_VALUE_2 = EnumInt32(-2147483648 + 1)
    EnumInt32_ENUM_VALUE_3 = EnumInt32(2147483646 + 0)
    EnumInt32_ENUM_VALUE_4 = EnumInt32(2147483646 + 1)
    EnumInt32_ENUM_VALUE_5 = EnumInt32(EnumInt32_ENUM_VALUE_3)
)

// Create a new EnumInt32 enum
func NewEnumInt32() *EnumInt32 {
    return new(EnumInt32)
}

// Create a new EnumInt32 enum from the given value
func NewEnumInt32FromValue(value int32) *EnumInt32 {
    result := EnumInt32(value)
    return &result
}

// Get the enum key
func (e EnumInt32) Key() EnumInt32Key {
    return EnumInt32Key(e)
}

// Convert enum to optional
func (e *EnumInt32) Optional() *EnumInt32 {
    return e
}

// Convert enum to string
func (e EnumInt32) String() string {
    if e == EnumInt32_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumInt32_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumInt32_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumInt32_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumInt32_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumInt32_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumInt32) MarshalJSON() ([]byte, error) {
    value := int32(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumInt32) UnmarshalJSON(buffer []byte) error {
    var result int32
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumInt32(result)
    return nil
}
