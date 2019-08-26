// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

import ChronoxorFbe
import Foundation
import ChronoxorProto

// Fast Binary Encoding ChronoxorTest final sender
open class FinalSender : ChronoxorFbe.SenderProtocol { 
    // Imported senders
    let ProtoSender: ChronoxorProto.FinalSender

    // Sender models accessors
    private let StructSimpleModel: StructSimpleFinalModel
    private let StructOptionalModel: StructOptionalFinalModel
    private let StructNestedModel: StructNestedFinalModel
    private let StructBytesModel: StructBytesFinalModel
    private let StructArrayModel: StructArrayFinalModel
    private let StructVectorModel: StructVectorFinalModel
    private let StructListModel: StructListFinalModel
    private let StructSetModel: StructSetFinalModel
    private let StructMapModel: StructMapFinalModel
    private let StructHashModel: StructHashFinalModel
    private let StructHashExModel: StructHashExFinalModel
    private let StructEmptyModel: StructEmptyFinalModel

    public var buffer: Buffer = Buffer()
    public var logging: Bool = false
    public var final: Bool = false

    public init() {
        ProtoSender = ChronoxorProto.FinalSender(buffer: buffer)
        StructSimpleModel = ChronoxorTest.StructSimpleFinalModel(buffer: buffer)
        StructOptionalModel = ChronoxorTest.StructOptionalFinalModel(buffer: buffer)
        StructNestedModel = ChronoxorTest.StructNestedFinalModel(buffer: buffer)
        StructBytesModel = ChronoxorTest.StructBytesFinalModel(buffer: buffer)
        StructArrayModel = ChronoxorTest.StructArrayFinalModel(buffer: buffer)
        StructVectorModel = ChronoxorTest.StructVectorFinalModel(buffer: buffer)
        StructListModel = ChronoxorTest.StructListFinalModel(buffer: buffer)
        StructSetModel = ChronoxorTest.StructSetFinalModel(buffer: buffer)
        StructMapModel = ChronoxorTest.StructMapFinalModel(buffer: buffer)
        StructHashModel = ChronoxorTest.StructHashFinalModel(buffer: buffer)
        StructHashExModel = ChronoxorTest.StructHashExFinalModel(buffer: buffer)
        StructEmptyModel = ChronoxorTest.StructEmptyFinalModel(buffer: buffer)
        build(with: true)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        ProtoSender = ChronoxorProto.FinalSender(buffer: buffer)
        StructSimpleModel = ChronoxorTest.StructSimpleFinalModel(buffer: buffer)
        StructOptionalModel = ChronoxorTest.StructOptionalFinalModel(buffer: buffer)
        StructNestedModel = ChronoxorTest.StructNestedFinalModel(buffer: buffer)
        StructBytesModel = ChronoxorTest.StructBytesFinalModel(buffer: buffer)
        StructArrayModel = ChronoxorTest.StructArrayFinalModel(buffer: buffer)
        StructVectorModel = ChronoxorTest.StructVectorFinalModel(buffer: buffer)
        StructListModel = ChronoxorTest.StructListFinalModel(buffer: buffer)
        StructSetModel = ChronoxorTest.StructSetFinalModel(buffer: buffer)
        StructMapModel = ChronoxorTest.StructMapFinalModel(buffer: buffer)
        StructHashModel = ChronoxorTest.StructHashFinalModel(buffer: buffer)
        StructHashExModel = ChronoxorTest.StructHashExFinalModel(buffer: buffer)
        StructEmptyModel = ChronoxorTest.StructEmptyFinalModel(buffer: buffer)
        build(with: buffer, final: true)
    }

    public func send(obj: Any) throws -> Int {
        return try send(obj: obj, listener: self as! ChronoxorFbe.LogListener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.LogListener) throws -> Int {
        switch obj {
            case is ChronoxorTest.StructSimple: return try send(value: obj as! ChronoxorTest.StructSimple, listener: listener)
            case is ChronoxorTest.StructOptional: return try send(value: obj as! ChronoxorTest.StructOptional, listener: listener)
            case is ChronoxorTest.StructNested: return try send(value: obj as! ChronoxorTest.StructNested, listener: listener)
            case is ChronoxorTest.StructBytes: return try send(value: obj as! ChronoxorTest.StructBytes, listener: listener)
            case is ChronoxorTest.StructArray: return try send(value: obj as! ChronoxorTest.StructArray, listener: listener)
            case is ChronoxorTest.StructVector: return try send(value: obj as! ChronoxorTest.StructVector, listener: listener)
            case is ChronoxorTest.StructList: return try send(value: obj as! ChronoxorTest.StructList, listener: listener)
            case is ChronoxorTest.StructSet: return try send(value: obj as! ChronoxorTest.StructSet, listener: listener)
            case is ChronoxorTest.StructMap: return try send(value: obj as! ChronoxorTest.StructMap, listener: listener)
            case is ChronoxorTest.StructHash: return try send(value: obj as! ChronoxorTest.StructHash, listener: listener)
            case is ChronoxorTest.StructHashEx: return try send(value: obj as! ChronoxorTest.StructHashEx, listener: listener)
            case is ChronoxorTest.StructEmpty: return try send(value: obj as! ChronoxorTest.StructEmpty, listener: listener)
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

    public func send(value: ChronoxorTest.StructSimple) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructSimple, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructSimpleModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructSimple serialization failed!")
        assert(StructSimpleModel.verify(), "ChronoxorTest.StructSimple validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructOptional) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructOptional, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructOptionalModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructOptional serialization failed!")
        assert(StructOptionalModel.verify(), "ChronoxorTest.StructOptional validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructNested) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructNested, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructNestedModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructNested serialization failed!")
        assert(StructNestedModel.verify(), "ChronoxorTest.StructNested validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructBytes) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructBytes, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructBytesModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructBytes serialization failed!")
        assert(StructBytesModel.verify(), "ChronoxorTest.StructBytes validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructArray) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructArray, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructArrayModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructArray serialization failed!")
        assert(StructArrayModel.verify(), "ChronoxorTest.StructArray validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructVector) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructVector, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructVectorModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructVector serialization failed!")
        assert(StructVectorModel.verify(), "ChronoxorTest.StructVector validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructList) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructList, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructListModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructList serialization failed!")
        assert(StructListModel.verify(), "ChronoxorTest.StructList validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructSet) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructSet, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructSetModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructSet serialization failed!")
        assert(StructSetModel.verify(), "ChronoxorTest.StructSet validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructMap) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructMap, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructMapModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructMap serialization failed!")
        assert(StructMapModel.verify(), "ChronoxorTest.StructMap validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructHash) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructHash, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructHashModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructHash serialization failed!")
        assert(StructHashModel.verify(), "ChronoxorTest.StructHash validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructHashEx) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructHashEx, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructHashExModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructHashEx serialization failed!")
        assert(StructHashExModel.verify(), "ChronoxorTest.StructHashEx validation failed!")

        // Log the value
        if logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: ChronoxorTest.StructEmpty) throws -> Int {
        return try send(value: value, listener: self as! ChronoxorFbe.LogListener)
    }
    public func send(value: ChronoxorTest.StructEmpty, listener: ChronoxorFbe.LogListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructEmptyModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorTest.StructEmpty serialization failed!")
        assert(StructEmptyModel.verify(), "ChronoxorTest.StructEmpty validation failed!")

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
