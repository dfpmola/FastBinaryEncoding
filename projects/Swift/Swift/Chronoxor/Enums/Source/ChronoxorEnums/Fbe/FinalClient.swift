// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

import Foundation
import ChronoxorFbe

// Fast Binary Encoding Enums final client
open class FinalClient : ChronoxorFbe.ClientProtocol {
    // Client sender models accessors
    let EnumsSenderModel: EnumsFinalModel

    // Client receiver values accessors
    private var EnumsReceiverValue: ChronoxorEnums.Enums

    // Client receiver models accessors
    private let EnumsReceiverModel: EnumsFinalModel

    public var sendBuffer: Buffer = Buffer()
    public var receiveBuffer: Buffer = Buffer()
    public var logging: Bool = false
    public var final: Bool = false

    public init() {
        EnumsSenderModel = EnumsFinalModel(buffer: sendBuffer)
        EnumsReceiverValue = ChronoxorEnums.Enums()
        EnumsReceiverModel = EnumsFinalModel()
        build(with: true)
    }

    public init(sendBuffer: ChronoxorFbe.Buffer, receiveBuffer: ChronoxorFbe.Buffer) {
        EnumsSenderModel = EnumsFinalModel(buffer: sendBuffer)
        EnumsReceiverValue = ChronoxorEnums.Enums()
        EnumsReceiverModel = EnumsFinalModel()
        build(with: sendBuffer, receiveBuffer: receiveBuffer, final: true)
    }

    public func send(obj: Any) throws -> Int {
        return try send(obj: obj, listener: self as! ChronoxorFbe.LogListener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.LogListener) throws -> Int {
        switch obj {
            case is ChronoxorEnums.Enums: return try send(value: obj as! ChronoxorEnums.Enums, listener: listener)
            default: break
        }

        return 0
    }

    public func send(value: ChronoxorEnums.Enums) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorEnums.Enums, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try EnumsSenderModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorEnums.Enums serialization failed!")
        assert(EnumsSenderModel.verify(), "ChronoxorEnums.Enums validation failed!")

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
        return onReceiveListener(listener: self as! FinalReceiverListener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: FinalReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case ChronoxorEnums.EnumsFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            EnumsReceiverModel.attach(buffer: buffer, offset: offset)
            assert(EnumsReceiverModel.verify(), "Enums.Enums validation failed!")
            let deserialized = EnumsReceiverModel.deserialize(value: &EnumsReceiverValue)
            assert(deserialized > 0, "Enums.Enums deserialization failed!")

            // Log the value
            if logging {
                let message = EnumsReceiverValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: EnumsReceiverValue)
            return true
        default: break
        }

        return false
    }
}
