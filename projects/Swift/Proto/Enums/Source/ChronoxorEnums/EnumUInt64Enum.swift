//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

import Foundation

public enum EnumUInt64Enum {
    typealias RawValue = UInt64
    case ENUM_VALUE_0
    case ENUM_VALUE_1
    case ENUM_VALUE_2
    case ENUM_VALUE_3
    case ENUM_VALUE_4
    case ENUM_VALUE_5

    var rawValue: RawValue {
        switch self {
        case .ENUM_VALUE_0: return 0 + 0
        case .ENUM_VALUE_1: return 0 + 0
        case .ENUM_VALUE_2: return 0 + 1
        case .ENUM_VALUE_3: return 0xFFFFFFFFFFFFFFFE + 0
        case .ENUM_VALUE_4: return 0xFFFFFFFFFFFFFFFE + 1
        case .ENUM_VALUE_5: return Self.ENUM_VALUE_3.rawValue
        }
    }

    init(value: UInt8) { self = EnumUInt64Enum(rawValue: NSNumber(value: value).uint64Value) }
    init(value: UInt16) { self = EnumUInt64Enum(rawValue: NSNumber(value: value).uint64Value) }
    init(value: UInt32) { self = EnumUInt64Enum(rawValue: NSNumber(value: value).uint64Value) }
    init(value: UInt64) { self = EnumUInt64Enum(rawValue: NSNumber(value: value).uint64Value) }
    init(value: EnumUInt64Enum) { self = EnumUInt64Enum(rawValue: value.rawValue) }
    init(rawValue: UInt64) { self = Self.mapValue(value: rawValue)! }

    var description: String {
        switch self {
        case .ENUM_VALUE_0: return "ENUM_VALUE_0"
        case .ENUM_VALUE_1: return "ENUM_VALUE_1"
        case .ENUM_VALUE_2: return "ENUM_VALUE_2"
        case .ENUM_VALUE_3: return "ENUM_VALUE_3"
        case .ENUM_VALUE_4: return "ENUM_VALUE_4"
        case .ENUM_VALUE_5: return "ENUM_VALUE_5"
        }
    }

    static let rawValuesMap: [RawValue: EnumUInt64Enum] = {
        var value = [RawValue: EnumUInt64Enum]()
        value[EnumUInt64Enum.ENUM_VALUE_0.rawValue] = .ENUM_VALUE_0
        value[EnumUInt64Enum.ENUM_VALUE_1.rawValue] = .ENUM_VALUE_1
        value[EnumUInt64Enum.ENUM_VALUE_2.rawValue] = .ENUM_VALUE_2
        value[EnumUInt64Enum.ENUM_VALUE_3.rawValue] = .ENUM_VALUE_3
        value[EnumUInt64Enum.ENUM_VALUE_4.rawValue] = .ENUM_VALUE_4
        value[EnumUInt64Enum.ENUM_VALUE_5.rawValue] = .ENUM_VALUE_5
        return value
    }()

    static func mapValue(value: UInt64) -> EnumUInt64Enum? {
        return rawValuesMap[value]
    }
}
