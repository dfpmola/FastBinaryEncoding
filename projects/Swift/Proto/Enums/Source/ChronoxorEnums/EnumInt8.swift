//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

import Foundation

public struct EnumInt8: Comparable, Hashable, Codable {
    typealias RawValue = Int8
    public static let ENUM_VALUE_0 = EnumInt8(value: EnumInt8Enum.ENUM_VALUE_0)
    public static let ENUM_VALUE_1 = EnumInt8(value: EnumInt8Enum.ENUM_VALUE_1)
    public static let ENUM_VALUE_2 = EnumInt8(value: EnumInt8Enum.ENUM_VALUE_2)
    public static let ENUM_VALUE_3 = EnumInt8(value: EnumInt8Enum.ENUM_VALUE_3)
    public static let ENUM_VALUE_4 = EnumInt8(value: EnumInt8Enum.ENUM_VALUE_4)
    public static let ENUM_VALUE_5 = EnumInt8(value: EnumInt8Enum.ENUM_VALUE_5)

    var value: EnumInt8Enum?

    public var raw: Int8 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: Int8) { setEnum(value: value) }
    public init(value: EnumInt8Enum) { setEnum(value: value) }
    public init(value: EnumInt8) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).int8Value) }

    public mutating func setEnum(value: Int8) { self.value = EnumInt8Enum.mapValue(value: value) }
    public mutating func setEnum(value: EnumInt8Enum) { self.value = value }
    public mutating func setEnum(value: EnumInt8) { self.value = value.value }

    public static func < (lhs: EnumInt8, rhs: EnumInt8) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: EnumInt8, rhs: EnumInt8) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue == rhsValue.rawValue
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(value?.rawValue ?? 0)
    }

    public var description: String {
        return value?.description ?? "<unknown>"
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> EnumInt8 {
        return try JSONDecoder().decode(EnumInt8.self, from: json.data(using: .utf8)!)
    }
}
