// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

import Foundation
import ChronoxorFbe

// Fast Binary Encoding Proto client
open class Client : ChronoxorFbe.ClientProtocol {
    // Client sender models accessors
    let OrderSenderModel: OrderModel
    let BalanceSenderModel: BalanceModel
    let AccountSenderModel: AccountModel

    // Client receiver values accessors
    private var OrderReceiverValue: ChronoxorProto.Order
    private var BalanceReceiverValue: ChronoxorProto.Balance
    private var AccountReceiverValue: ChronoxorProto.Account

    // Client receiver models accessors
    private let OrderReceiverModel: OrderModel
    private let BalanceReceiverModel: BalanceModel
    private let AccountReceiverModel: AccountModel

    public var sendBuffer: Buffer = Buffer()
    public var receiveBuffer: Buffer = Buffer()
    public var logging: Bool = false
    public var final: Bool = false

    public init() {
        OrderSenderModel = OrderModel(buffer: sendBuffer)
        OrderReceiverValue = ChronoxorProto.Order()
        OrderReceiverModel = OrderModel()
        BalanceSenderModel = BalanceModel(buffer: sendBuffer)
        BalanceReceiverValue = ChronoxorProto.Balance()
        BalanceReceiverModel = BalanceModel()
        AccountSenderModel = AccountModel(buffer: sendBuffer)
        AccountReceiverValue = ChronoxorProto.Account()
        AccountReceiverModel = AccountModel()
        build(with: false)
    }

    public init(sendBuffer: ChronoxorFbe.Buffer, receiveBuffer: ChronoxorFbe.Buffer) {
        OrderSenderModel = OrderModel(buffer: sendBuffer)
        OrderReceiverValue = ChronoxorProto.Order()
        OrderReceiverModel = OrderModel()
        BalanceSenderModel = BalanceModel(buffer: sendBuffer)
        BalanceReceiverValue = ChronoxorProto.Balance()
        BalanceReceiverModel = BalanceModel()
        AccountSenderModel = AccountModel(buffer: sendBuffer)
        AccountReceiverValue = ChronoxorProto.Account()
        AccountReceiverModel = AccountModel()
        build(with: sendBuffer, receiveBuffer: receiveBuffer, final: false)
    }

    public func send(obj: Any) throws -> Int {
        return try send(obj: obj, listener: self as! ChronoxorFbe.LogListener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.LogListener) throws -> Int {
        switch obj {
            case is ChronoxorProto.Order: return try send(value: obj as! ChronoxorProto.Order, listener: listener)
            case is ChronoxorProto.Balance: return try send(value: obj as! ChronoxorProto.Balance, listener: listener)
            case is ChronoxorProto.Account: return try send(value: obj as! ChronoxorProto.Account, listener: listener)
            default: break
        }

        return 0
    }

    public func send(value: ChronoxorProto.Order) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProto.Order, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try OrderSenderModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.Order serialization failed!")
        assert(OrderSenderModel.verify(), "ChronoxorProto.Order validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorProto.Balance) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProto.Balance, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try BalanceSenderModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.Balance serialization failed!")
        assert(BalanceSenderModel.verify(), "ChronoxorProto.Balance validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorProto.Account) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorProto.Account, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try AccountSenderModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.Account serialization failed!")
        assert(AccountSenderModel.verify(), "ChronoxorProto.Account validation failed!")

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
    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        return onReceiveListener(listener: self as! ReceiverListener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: ReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case ChronoxorProto.OrderModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            OrderReceiverModel.attach(buffer: buffer, offset: offset)
            assert(OrderReceiverModel.verify(), "Proto.Order validation failed!")
            let deserialized = OrderReceiverModel.deserialize(value: &OrderReceiverValue)
            assert(deserialized > 0, "Proto.Order deserialization failed!")

            // Log the value
            if logging {
                let message = OrderReceiverValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: OrderReceiverValue)
            return true
        case ChronoxorProto.BalanceModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            BalanceReceiverModel.attach(buffer: buffer, offset: offset)
            assert(BalanceReceiverModel.verify(), "Proto.Balance validation failed!")
            let deserialized = BalanceReceiverModel.deserialize(value: &BalanceReceiverValue)
            assert(deserialized > 0, "Proto.Balance deserialization failed!")

            // Log the value
            if logging {
                let message = BalanceReceiverValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: BalanceReceiverValue)
            return true
        case ChronoxorProto.AccountModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            AccountReceiverModel.attach(buffer: buffer, offset: offset)
            assert(AccountReceiverModel.verify(), "Proto.Account validation failed!")
            let deserialized = AccountReceiverModel.deserialize(value: &AccountReceiverValue)
            assert(deserialized > 0, "Proto.Account deserialization failed!")

            // Log the value
            if logging {
                let message = AccountReceiverValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: AccountReceiverValue)
            return true
        default: break
        }

        return false
    }
}
