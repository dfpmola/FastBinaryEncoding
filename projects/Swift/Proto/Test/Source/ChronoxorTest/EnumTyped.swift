//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

import Foundation

public struct EnumTyped: Comparable, Hashable, Codable {
    typealias RawValue = UInt8
    public static let ENUM_VALUE_0 = EnumTyped(value: EnumTypedEnum.ENUM_VALUE_0)
    public static let ENUM_VALUE_1 = EnumTyped(value: EnumTypedEnum.ENUM_VALUE_1)
    public static let ENUM_VALUE_2 = EnumTyped(value: EnumTypedEnum.ENUM_VALUE_2)
    public static let ENUM_VALUE_3 = EnumTyped(value: EnumTypedEnum.ENUM_VALUE_3)
    public static let ENUM_VALUE_4 = EnumTyped(value: EnumTypedEnum.ENUM_VALUE_4)
    public static let ENUM_VALUE_5 = EnumTyped(value: EnumTypedEnum.ENUM_VALUE_5)

    var value: EnumTypedEnum?

    public var raw: UInt8 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: UInt8) { setEnum(value: value) }
    public init(value: EnumTypedEnum) { setEnum(value: value) }
    public init(value: EnumTyped) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).uint8Value) }

    public mutating func setEnum(value: UInt8) { self.value = EnumTypedEnum.mapValue(value: value) }
    public mutating func setEnum(value: EnumTypedEnum) { self.value = value }
    public mutating func setEnum(value: EnumTyped) { self.value = value.value }

    public static func < (lhs: EnumTyped, rhs: EnumTyped) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: EnumTyped, rhs: EnumTyped) -> Bool {
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

    public static func fromJson(_ json: String) throws -> EnumTyped {
        return try JSONDecoder().decode(EnumTyped.self, from: json.data(using: .utf8)!)
    }
}
