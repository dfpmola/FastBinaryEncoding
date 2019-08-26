// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0

import ChronoxorFbe
import Foundation
import ChronoxorProto

// Fast Binary Encoding ChronoxorProtoex sender
open class Sender : ChronoxorFbe.SenderProtocol { 
    // Imported senders
    let ProtoSender: ChronoxorProto.Sender

    // Sender models accessors
    private let OrderModel: OrderModel
    private let BalanceModel: BalanceModel
    private let AccountModel: AccountModel
    private let OrderMessageModel: OrderMessageModel
    private let BalanceMessageModel: BalanceMessageModel
    private let AccountMessageModel: AccountMessageModel

    public var buffer: Buffer = Buffer()
    public var logging: Bool = false
    public var final: Bool = false

    public init() {
        ProtoSender = ChronoxorProto.Sender(buffer: buffer)
        OrderModel = ChronoxorProtoex.OrderModel(buffer: buffer)
        BalanceModel = ChronoxorProtoex.BalanceModel(buffer: buffer)
        AccountModel = ChronoxorProtoex.AccountModel(buffer: buffer)
        OrderMessageModel = ChronoxorProtoex.OrderMessageModel(buffer: buffer)
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageModel(buffer: buffer)
        AccountMessageModel = ChronoxorProtoex.AccountMessageModel(buffer: buffer)
        build(with: false)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        ProtoSender = ChronoxorProto.Sender(buffer: buffer)
        OrderModel = ChronoxorProtoex.OrderModel(buffer: buffer)
        BalanceModel = ChronoxorProtoex.BalanceModel(buffer: buffer)
        AccountModel = ChronoxorProtoex.AccountModel(buffer: buffer)
        OrderMessageModel = ChronoxorProtoex.OrderMessageModel(buffer: buffer)
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageModel(buffer: buffer)
        AccountMessageModel = ChronoxorProtoex.AccountMessageModel(buffer: buffer)
        build(with: buffer, final: false)
    }

    public func send(obj: Any) throws -> Int {
        return try send(obj: obj, listener: self as! ChronoxorFbe.LogListener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.LogListener) throws -> Int {
        switch obj {
            case is ChronoxorProtoex.Order: return try send(value: obj as! ChronoxorProtoex.Order, listener: listener)
            case is ChronoxorProtoex.Balance: return try send(value: obj as! ChronoxorProtoex.Balance, listener: listener)
            case is ChronoxorProtoex.Account: return try send(value: obj as! ChronoxorProtoex.Account, listener: listener)
            case is ChronoxorProtoex.OrderMessage: return try send(value: obj as! ChronoxorProtoex.OrderMessage, listener: listener)
            case is ChronoxorProtoex.BalanceMessage: return try send(value: obj as! ChronoxorProtoex.BalanceMessage, listener: listener)
            case is ChronoxorProtoex.AccountMessage: return try send(value: obj as! ChronoxorProtoex.AccountMessage, listener: listener)
            default: break
        }

        // Try to send using imported senders
        var result: Int = 0
        result = try ProtoSender.send(obj: obj, listener: listener)
        if result > 0 {
            return result
            }

        return 0
    }

    public func send(value: ChronoxorProtoex.Order) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProtoex.Order, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try OrderModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.Order serialization failed!")
        assert(OrderModel.verify(), "ChronoxorProtoex.Order validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorProtoex.Balance) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProtoex.Balance, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try BalanceModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.Balance serialization failed!")
        assert(BalanceModel.verify(), "ChronoxorProtoex.Balance validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorProtoex.Account) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProtoex.Account, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try AccountModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.Account serialization failed!")
        assert(AccountModel.verify(), "ChronoxorProtoex.Account validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorProtoex.OrderMessage) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProtoex.OrderMessage, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try OrderMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.OrderMessage serialization failed!")
        assert(OrderMessageModel.verify(), "ChronoxorProtoex.OrderMessage validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorProtoex.BalanceMessage) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProtoex.BalanceMessage, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try BalanceMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.BalanceMessage serialization failed!")
        assert(BalanceMessageModel.verify(), "ChronoxorProtoex.BalanceMessage validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorProtoex.AccountMessage) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProtoex.AccountMessage, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try AccountMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.AccountMessage serialization failed!")
        assert(AccountMessageModel.verify(), "ChronoxorProtoex.AccountMessage validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }

    // Send message handler
    open func onSend(buffer: Data, offset: Int, size: Int) throws -> Int { throw NSError() }
}
