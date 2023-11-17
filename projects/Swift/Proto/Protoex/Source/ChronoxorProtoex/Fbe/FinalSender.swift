//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

import ChronoxorFbe
import Foundation
import ChronoxorProto

// Fast Binary Encoding ChronoxorProtoex final sender
open class FinalSender: ChronoxorFbe.SenderProtocol {
    // Imported senders
    let ProtoSender: ChronoxorProto.FinalSender

    // Sender models accessors
    private let OrderMessageModel: OrderMessageFinalModel
    private let BalanceMessageModel: BalanceMessageFinalModel
    private let AccountMessageModel: AccountMessageFinalModel

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        ProtoSender = ChronoxorProto.FinalSender(buffer: buffer)
        OrderMessageModel = ChronoxorProtoex.OrderMessageFinalModel(buffer: buffer)
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageFinalModel(buffer: buffer)
        AccountMessageModel = ChronoxorProtoex.AccountMessageFinalModel(buffer: buffer)
        build(with: true)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        ProtoSender = ChronoxorProto.FinalSender(buffer: buffer)
        OrderMessageModel = ChronoxorProtoex.OrderMessageFinalModel(buffer: buffer)
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageFinalModel(buffer: buffer)
        AccountMessageModel = ChronoxorProtoex.AccountMessageFinalModel(buffer: buffer)
        build(with: buffer, final: true)
    }

    public func send(obj: Any) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(obj: obj, listener: listener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.SenderListener) throws -> Int {
        let objType = type(of: obj)
        if objType == ChronoxorProtoex.OrderMessage.self, let value = obj as? ChronoxorProtoex.OrderMessage { return try send(value: value, listener: listener) }
        if objType == ChronoxorProtoex.BalanceMessage.self, let value = obj as? ChronoxorProtoex.BalanceMessage { return try send(value: value, listener: listener) }
        if objType == ChronoxorProtoex.AccountMessage.self, let value = obj as? ChronoxorProtoex.AccountMessage { return try send(value: value, listener: listener) }

        // Try to send using imported senders
        var result: Int = 0
        result = try ProtoSender.send(obj: obj, listener: listener)
        if result > 0 {
            return result
            }

        return 0
    }

    public func send(value: ChronoxorProtoex.OrderMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProtoex.OrderMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try OrderMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.OrderMessage serialization failed!")
        assert(OrderMessageModel.verify(), "ChronoxorProtoex.OrderMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }

    public func send(value: ChronoxorProtoex.BalanceMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProtoex.BalanceMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try BalanceMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.BalanceMessage serialization failed!")
        assert(BalanceMessageModel.verify(), "ChronoxorProtoex.BalanceMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }

    public func send(value: ChronoxorProtoex.AccountMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProtoex.AccountMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try AccountMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProtoex.AccountMessage serialization failed!")
        assert(AccountMessageModel.verify(), "ChronoxorProtoex.AccountMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }
}
