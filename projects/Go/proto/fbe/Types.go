//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

package fbe

import "time"
import "github.com/google/uuid"
import "github.com/shopspring/decimal"

// Decimal struct
type Decimal struct {
    decimal.Decimal
}

// Create a new decimal from the given float value
func DecimalFromFloat(value float64) Decimal {
    result := decimal.NewFromFloat(value)
    return Decimal{result}
}

// Create a new decimal from the given string
func DecimalFromString(value string) Decimal {
    result, _ := decimal.NewFromString(value)
    return Decimal{result}
}

// Create zero decimal
func DecimalZero() Decimal {
    return Decimal{decimal.New(0, 0)}
}

// Timestamp struct
type Timestamp struct {
    time.Time
}

// Create a new timestamp from the given date
func TimestampFromDate(year, month, day int) Timestamp {
    return Timestamp{time.Date(year, time.Month(month + 1), day, 0, 0, 0, 0, time.UTC)}
}

// Create a new timestamp from the given date
func TimestampFromDateTime(year, month, day, hour, minute, second, nanoseconds int) Timestamp {
    return Timestamp{time.Date(year, time.Month(month + 1), day, hour, minute, second, nanoseconds, time.UTC)}
}

// Create a new timestamp from the given nanoseconds
func TimestampFromNanoseconds(nanoseconds uint64) Timestamp {
    return Timestamp{time.Unix(int64(nanoseconds / 1000000000), int64(nanoseconds % 1000000000)).UTC()}
}

// Create Unix Epoch timestamp
func TimestampEpoch() Timestamp {
    return Timestamp{time.Unix(0, 0).UTC()}
}

// Create the current UTC timestamp
func TimestampUTC() Timestamp {
    return Timestamp{time.Now().UTC()}
}

// Convert timestamp to JSON
func (t *Timestamp) MarshalJSON() ([]byte, error) {
    timestamp := t.UnixNano()
    return Json.Marshal(&timestamp)
}

// Convert JSON to timestamp
func (t *Timestamp) UnmarshalJSON(buffer []byte) error {
    var nanoseconds int64
    err := Json.Unmarshal(buffer, &nanoseconds)
    if err != nil {
        return err
    }
    *t = TimestampFromNanoseconds(uint64(nanoseconds))
    return nil
}

// UUID struct
type UUID struct {
    uuid.UUID
}

// Create a new UUID from the given bytes buffer
func UUIDFromBytes(buffer []byte) UUID {
    result, _ := uuid.FromBytes(buffer)
    return UUID{result}
}

// Create a new UUID from the given string
func UUIDFromString(value string) UUID {
    result, _ := uuid.Parse(value)
    return UUID{result}
}

// Create nil UUID0 (all bits set to zero)
func UUIDNil() UUID {
    return UUID{uuid.Nil}
}

// Create sequential UUID1 (time based version)
func UUIDSequential() UUID {
    result, _ := uuid.NewUUID()
    return UUID{result}
}

// Create random UUID4 (randomly or pseudo-randomly generated version)
func UUIDRandom() UUID {
    result, _ := uuid.NewRandom()
    return UUID{result}
}
