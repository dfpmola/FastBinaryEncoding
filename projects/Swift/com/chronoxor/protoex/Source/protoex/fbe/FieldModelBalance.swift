// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0


import Foundation

import fbe

import proto

// Fast Binary Encoding Balance field model
public class FieldModelBalance: FieldModel {

    public var _buffer: Buffer
    public var _offset: Int

    let parent: proto.FieldModelBalance
    let locked: FieldModelDouble

    // Field size
    public let fbeSize: Int = 4

    // Field body size
    public let fbeBody: Int

    // Set the struct value (end phase)
    public required init() {
        let buffer = Buffer()
        let offset = 0

        _buffer = buffer
        _offset = offset

        parent = proto.FieldModelBalance(buffer: buffer, offset: 4 + 4)
        locked = FieldModelDouble(buffer: buffer, offset: parent.fbeOffset + parent.fbeBody - 4 - 4)

        var fbeBody = (4 + 4)
            fbeBody += parent.fbeBody - 4 - 4
            fbeBody += locked.fbeSize
            self.fbeBody = fbeBody
    }

    // 
    public required init(buffer: Buffer = Buffer(), offset: Int = 0) {
        _buffer = buffer
        _offset = offset

        parent = proto.FieldModelBalance(buffer: buffer, offset: 4 + 4)
        locked = FieldModelDouble(buffer: buffer, offset: parent.fbeOffset + parent.fbeBody - 4 - 4)

        var fbeBody = (4 + 4)
            fbeBody += parent.fbeBody - 4 - 4
            fbeBody += locked.fbeSize
            self.fbeBody = fbeBody
    }

    // Field extra size
    public var fbeExtra: Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return 0
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4) > _buffer.size) {
            return 0
        }

        _buffer.shift(offset: fbeStructOffset)

        var fbeResult = fbeBody
            fbeResult += parent.fbeExtra
            fbeResult += locked.fbeExtra

        _buffer.unshift(offset: fbeStructOffset)

        return fbeResult
    }

    // Field type
    public var fbeType: Int = fbeTypeConst
    public static let fbeTypeConst: Int = proto.FieldModelBalance.fbeTypeConst

    // Check if the struct value is valid
    func verify(fbeVerifyType: Bool = true) -> Bool {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size) {
            return true
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size) {
            return false
        }

        let fbeStructSize = Int(readUInt32(offset: fbeStructOffset))
        if (fbeStructSize < (4 + 4)) {
            return false
        }

        let fbeStructType = Int(readUInt32(offset: fbeStructOffset + 4))
        if (fbeVerifyType && (fbeStructType != fbeType))  {
            return false
        }

        _buffer.shift(offset: fbeStructOffset)
        let fbeResult = verifyFields(fbeStructSize: fbeStructSize)
        _buffer.unshift(offset: fbeStructOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    public func verifyFields(fbeStructSize: Int) -> Bool {
        var fbeCurrentSize = 4 + 4

        if fbeCurrentSize + parent.fbeBody - 4 - 4 > fbeStructSize {
            return true
        }
        if !parent.verifyFields(fbeStructSize: fbeStructSize) {
            return false
        }
        fbeCurrentSize += parent.fbeBody - 4 - 4

        if (fbeCurrentSize + locked.fbeSize) > fbeStructSize {
            return true
        }
        if !locked.verify() {
            return false
        }
        fbeCurrentSize += locked.fbeSize

        return true
    }

    // Get the struct value (begin phase)
    func getBegin() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return 0
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if ((fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size)) {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeStructSize = Int(readUInt32(offset: fbeStructOffset))
        if fbeStructSize < 4 + 4 {
            assertionFailure("Model is broken!")
            return 0
        }

        _buffer.shift(offset: fbeStructOffset)
        return fbeStructOffset
    }

    // Get the struct value (end phase)
    func getEnd(fbeBegin: Int) {
        _buffer.unshift(offset: fbeBegin)
    }

    // Get the struct value
    public func get() -> Balance {
        var fbeValue = Balance()
        return get(fbeValue: &fbeValue)
    }

    public func get(fbeValue: inout Balance) -> Balance {
        let fbeBegin = getBegin()
        if (fbeBegin == 0) {
            return fbeValue
        }

        let fbeStructSize = Int(readUInt32(offset: 0))
        getFields(fbeValue: &fbeValue, fbeStructSize: fbeStructSize)
        getEnd(fbeBegin: fbeBegin)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout Balance, fbeStructSize: Int) {
        var fbeCurrentSize = 4 + 4

        if fbeCurrentSize + parent.fbeBody - 4 - 4 <= fbeStructSize {
            var fbeValueBase = fbeValue as proto.Balance
            parent.getFields(fbeValue: &fbeValueBase, fbeStructSize: fbeStructSize)
        }
        fbeCurrentSize += parent.fbeBody - 4 - 4

        if fbeCurrentSize + locked.fbeSize <= fbeStructSize {
            fbeValue.locked = locked.get(defaults: 0.0)
        } else {
            fbeValue.locked = 0.0
        }
        fbeCurrentSize += locked.fbeSize
    }

    // Set the struct value (begin phase)
    func setBegin() throws -> Int {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size) {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeStructSize = fbeBody
        let fbeStructOffset = try _buffer.allocate(size: fbeStructSize) - _buffer.offset
        if (fbeStructOffset <= 0) || ((_buffer.offset + fbeStructOffset + fbeStructSize) > _buffer.size) {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: UInt32(fbeStructOffset))
        write(offset: fbeStructOffset, value: UInt32(fbeStructSize))
        write(offset: fbeStructOffset + 4, value: UInt32(fbeType))

        _buffer.shift(offset: fbeStructOffset)
        return fbeStructOffset
    }

    // Set the struct value (end phase)
    public func setEnd(fbeBegin: Int) {
        _buffer.unshift(offset: fbeBegin)
    }

    // Set the struct value
    public func set(value fbeValue: Balance) throws {
        let fbeBegin = try setBegin()
        if fbeBegin == 0 {
            return
        }

        try setFields(fbeValue: fbeValue)
        setEnd(fbeBegin: fbeBegin)
    }

    // Set the struct fields values
    public func setFields(fbeValue: Balance) throws {
        try parent.setFields(fbeValue: fbeValue)
        try locked.set(value: fbeValue.locked)
    }
}
