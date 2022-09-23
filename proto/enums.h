//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe.h"

namespace enums {
using namespace FBE;
} // namespace enums

namespace FBE {
using namespace ::enums;
} // namespace FBE

namespace enums {

enum class EnumByte : uint8_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (uint8_t)0u,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (uint8_t)254u,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumByte value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumByte> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumByte value);
#endif

enum class EnumChar : uint8_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (char)'1',
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (char)'3',
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumChar value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumChar> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumChar value);
#endif

enum class EnumWChar : uint32_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (wchar_t)0x0444,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (wchar_t)0x0555,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumWChar value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumWChar> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumWChar value);
#endif

enum class EnumInt8 : int8_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (int8_t)-128,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (int8_t)126,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumInt8 value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumInt8> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumInt8 value);
#endif

enum class EnumUInt8 : uint8_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (uint8_t)0u,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (uint8_t)254u,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumUInt8 value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumUInt8> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumUInt8 value);
#endif

enum class EnumInt16 : int16_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (int16_t)-32768,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (int16_t)32766,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumInt16 value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumInt16> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumInt16 value);
#endif

enum class EnumUInt16 : uint16_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (uint16_t)0u,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (uint16_t)65534u,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumUInt16 value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumUInt16> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumUInt16 value);
#endif

enum class EnumInt32 : int32_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (int32_t)-2147483648ll,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (int32_t)2147483646ll,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumInt32 value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumInt32> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumInt32 value);
#endif

enum class EnumUInt32 : uint32_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (uint32_t)0ull,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (uint32_t)0xFFFFFFFEull,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumUInt32 value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumUInt32> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumUInt32 value);
#endif

enum class EnumInt64 : int64_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (int64_t)-9223372036854775807ll,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (int64_t)9223372036854775806ll,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumInt64 value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumInt64> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumInt64 value);
#endif

enum class EnumUInt64 : uint64_t
{
    ENUM_VALUE_0,
    ENUM_VALUE_1 = (uint64_t)0ull,
    ENUM_VALUE_2,
    ENUM_VALUE_3 = (uint64_t)0xFFFFFFFFFFFFFFFEull,
    ENUM_VALUE_4,
    ENUM_VALUE_5 = ENUM_VALUE_3,
};

std::ostream& operator<<(std::ostream& stream, EnumUInt64 value);

#if defined(FMT_VERSION)
} template <> struct fmt::formatter<enums::EnumUInt64> : ostream_formatter {}; namespace enums {
#endif

#if defined(LOGGING_PROTOCOL)
CppLogging::Record& operator<<(CppLogging::Record& record, EnumUInt64 value);
#endif

struct Enums
{
    ::enums::EnumByte byte0;
    ::enums::EnumByte byte1;
    ::enums::EnumByte byte2;
    ::enums::EnumByte byte3;
    ::enums::EnumByte byte4;
    ::enums::EnumByte byte5;
    ::enums::EnumChar char0;
    ::enums::EnumChar char1;
    ::enums::EnumChar char2;
    ::enums::EnumChar char3;
    ::enums::EnumChar char4;
    ::enums::EnumChar char5;
    ::enums::EnumWChar wchar0;
    ::enums::EnumWChar wchar1;
    ::enums::EnumWChar wchar2;
    ::enums::EnumWChar wchar3;
    ::enums::EnumWChar wchar4;
    ::enums::EnumWChar wchar5;
    ::enums::EnumInt8 int8b0;
    ::enums::EnumInt8 int8b1;
    ::enums::EnumInt8 int8b2;
    ::enums::EnumInt8 int8b3;
    ::enums::EnumInt8 int8b4;
    ::enums::EnumInt8 int8b5;
    ::enums::EnumUInt8 uint8b0;
    ::enums::EnumUInt8 uint8b1;
    ::enums::EnumUInt8 uint8b2;
    ::enums::EnumUInt8 uint8b3;
    ::enums::EnumUInt8 uint8b4;
    ::enums::EnumUInt8 uint8b5;
    ::enums::EnumInt16 int16b0;
    ::enums::EnumInt16 int16b1;
    ::enums::EnumInt16 int16b2;
    ::enums::EnumInt16 int16b3;
    ::enums::EnumInt16 int16b4;
    ::enums::EnumInt16 int16b5;
    ::enums::EnumUInt16 uint16b0;
    ::enums::EnumUInt16 uint16b1;
    ::enums::EnumUInt16 uint16b2;
    ::enums::EnumUInt16 uint16b3;
    ::enums::EnumUInt16 uint16b4;
    ::enums::EnumUInt16 uint16b5;
    ::enums::EnumInt32 int32b0;
    ::enums::EnumInt32 int32b1;
    ::enums::EnumInt32 int32b2;
    ::enums::EnumInt32 int32b3;
    ::enums::EnumInt32 int32b4;
    ::enums::EnumInt32 int32b5;
    ::enums::EnumUInt32 uint32b0;
    ::enums::EnumUInt32 uint32b1;
    ::enums::EnumUInt32 uint32b2;
    ::enums::EnumUInt32 uint32b3;
    ::enums::EnumUInt32 uint32b4;
    ::enums::EnumUInt32 uint32b5;
    ::enums::EnumInt64 int64b0;
    ::enums::EnumInt64 int64b1;
    ::enums::EnumInt64 int64b2;
    ::enums::EnumInt64 int64b3;
    ::enums::EnumInt64 int64b4;
    ::enums::EnumInt64 int64b5;
    ::enums::EnumUInt64 uint64b0;
    ::enums::EnumUInt64 uint64b1;
    ::enums::EnumUInt64 uint64b2;
    ::enums::EnumUInt64 uint64b3;
    ::enums::EnumUInt64 uint64b4;
    ::enums::EnumUInt64 uint64b5;

    size_t fbe_type() const noexcept { return 1; }

    Enums();
    Enums(const ::enums::EnumByte& arg_byte0, const ::enums::EnumByte& arg_byte1, const ::enums::EnumByte& arg_byte2, const ::enums::EnumByte& arg_byte3, const ::enums::EnumByte& arg_byte4, const ::enums::EnumByte& arg_byte5, const ::enums::EnumChar& arg_char0, const ::enums::EnumChar& arg_char1, const ::enums::EnumChar& arg_char2, const ::enums::EnumChar& arg_char3, const ::enums::EnumChar& arg_char4, const ::enums::EnumChar& arg_char5, const ::enums::EnumWChar& arg_wchar0, const ::enums::EnumWChar& arg_wchar1, const ::enums::EnumWChar& arg_wchar2, const ::enums::EnumWChar& arg_wchar3, const ::enums::EnumWChar& arg_wchar4, const ::enums::EnumWChar& arg_wchar5, const ::enums::EnumInt8& arg_int8b0, const ::enums::EnumInt8& arg_int8b1, const ::enums::EnumInt8& arg_int8b2, const ::enums::EnumInt8& arg_int8b3, const ::enums::EnumInt8& arg_int8b4, const ::enums::EnumInt8& arg_int8b5, const ::enums::EnumUInt8& arg_uint8b0, const ::enums::EnumUInt8& arg_uint8b1, const ::enums::EnumUInt8& arg_uint8b2, const ::enums::EnumUInt8& arg_uint8b3, const ::enums::EnumUInt8& arg_uint8b4, const ::enums::EnumUInt8& arg_uint8b5, const ::enums::EnumInt16& arg_int16b0, const ::enums::EnumInt16& arg_int16b1, const ::enums::EnumInt16& arg_int16b2, const ::enums::EnumInt16& arg_int16b3, const ::enums::EnumInt16& arg_int16b4, const ::enums::EnumInt16& arg_int16b5, const ::enums::EnumUInt16& arg_uint16b0, const ::enums::EnumUInt16& arg_uint16b1, const ::enums::EnumUInt16& arg_uint16b2, const ::enums::EnumUInt16& arg_uint16b3, const ::enums::EnumUInt16& arg_uint16b4, const ::enums::EnumUInt16& arg_uint16b5, const ::enums::EnumInt32& arg_int32b0, const ::enums::EnumInt32& arg_int32b1, const ::enums::EnumInt32& arg_int32b2, const ::enums::EnumInt32& arg_int32b3, const ::enums::EnumInt32& arg_int32b4, const ::enums::EnumInt32& arg_int32b5, const ::enums::EnumUInt32& arg_uint32b0, const ::enums::EnumUInt32& arg_uint32b1, const ::enums::EnumUInt32& arg_uint32b2, const ::enums::EnumUInt32& arg_uint32b3, const ::enums::EnumUInt32& arg_uint32b4, const ::enums::EnumUInt32& arg_uint32b5, const ::enums::EnumInt64& arg_int64b0, const ::enums::EnumInt64& arg_int64b1, const ::enums::EnumInt64& arg_int64b2, const ::enums::EnumInt64& arg_int64b3, const ::enums::EnumInt64& arg_int64b4, const ::enums::EnumInt64& arg_int64b5, const ::enums::EnumUInt64& arg_uint64b0, const ::enums::EnumUInt64& arg_uint64b1, const ::enums::EnumUInt64& arg_uint64b2, const ::enums::EnumUInt64& arg_uint64b3, const ::enums::EnumUInt64& arg_uint64b4, const ::enums::EnumUInt64& arg_uint64b5);
    Enums(const Enums& other) = default;
    Enums(Enums&& other) = default;
    ~Enums() = default;

    Enums& operator=(const Enums& other) = default;
    Enums& operator=(Enums&& other) = default;

    bool operator==(const Enums& other) const noexcept;
    bool operator!=(const Enums& other) const noexcept { return !operator==(other); }
    bool operator<(const Enums& other) const noexcept;
    bool operator<=(const Enums& other) const noexcept { return operator<(other) || operator==(other); }
    bool operator>(const Enums& other) const noexcept { return !operator<=(other); }
    bool operator>=(const Enums& other) const noexcept { return !operator<(other); }

    std::string string() const { std::stringstream ss; ss << *this; return ss.str(); }

    friend std::ostream& operator<<(std::ostream& stream, const Enums& value);

    void swap(Enums& other) noexcept;
    friend void swap(Enums& value1, Enums& value2) noexcept { value1.swap(value2); }
};

} // namespace enums

#if defined(FMT_VERSION)
template <> struct fmt::formatter<enums::Enums> : ostream_formatter {};
#endif

template<>
struct std::hash<enums::Enums>
{
    typedef enums::Enums argument_type;
    typedef size_t result_type;

    result_type operator() (const argument_type& value) const
    {
        result_type result = 17;
        return result;
    }
};

namespace enums {

} // namespace enums
