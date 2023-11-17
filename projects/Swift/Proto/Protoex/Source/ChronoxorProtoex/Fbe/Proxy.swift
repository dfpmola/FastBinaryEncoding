//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding Protoex proxy
open class Proxy: ChronoxorFbe.ReceiverProtocol {
    // Imported proxy
    let ProtoProxy: ChronoxorProto.Proxy?

    // Proxy models accessors
    private let OrderMessageModel: OrderMessageModel
    private let BalanceMessageModel: BalanceMessageModel
    private let AccountMessageModel: AccountMessageModel

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        ProtoProxy = ChronoxorProto.Proxy(buffer: buffer)
        OrderMessageModel = ChronoxorProtoex.OrderMessageModel()
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageModel()
        AccountMessageModel = ChronoxorProtoex.AccountMessageModel()
        build(final: false)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        ProtoProxy = ChronoxorProto.Proxy(buffer: buffer)
        OrderMessageModel = ChronoxorProtoex.OrderMessageModel()
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageModel()
        AccountMessageModel = ChronoxorProtoex.AccountMessageModel()
        build(with: buffer, final: false)
    }

    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? ProxyListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: ProxyListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case ChronoxorProtoex.OrderMessageModel.fbeTypeConst:
            // Attach the FBE stream to the proxy model
            OrderMessageModel.attach(buffer: buffer, offset: offset)
            assert(OrderMessageModel.verify(), "Protoex.OrderMessage validation failed!")

            let fbeBegin = OrderMessageModel.model.getBegin()
            if fbeBegin == 0 {
                return false
            }
            // Call proxy handler
            listener.onProxy(model: OrderMessageModel, type: type, buffer: buffer, offset: offset, size: size)
            OrderMessageModel.model.getEnd(fbeBegin: fbeBegin)
            return true
        case ChronoxorProtoex.BalanceMessageModel.fbeTypeConst:
            // Attach the FBE stream to the proxy model
            BalanceMessageModel.attach(buffer: buffer, offset: offset)
            assert(BalanceMessageModel.verify(), "Protoex.BalanceMessage validation failed!")

            let fbeBegin = BalanceMessageModel.model.getBegin()
            if fbeBegin == 0 {
                return false
            }
            // Call proxy handler
            listener.onProxy(model: BalanceMessageModel, type: type, buffer: buffer, offset: offset, size: size)
            BalanceMessageModel.model.getEnd(fbeBegin: fbeBegin)
            return true
        case ChronoxorProtoex.AccountMessageModel.fbeTypeConst:
            // Attach the FBE stream to the proxy model
            AccountMessageModel.attach(buffer: buffer, offset: offset)
            assert(AccountMessageModel.verify(), "Protoex.AccountMessage validation failed!")

            let fbeBegin = AccountMessageModel.model.getBegin()
            if fbeBegin == 0 {
                return false
            }
            // Call proxy handler
            listener.onProxy(model: AccountMessageModel, type: type, buffer: buffer, offset: offset, size: size)
            AccountMessageModel.model.getEnd(fbeBegin: fbeBegin)
            return true
        default: break
        }

        if let ProtoProxy = ProtoProxy, ProtoProxy.onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size) {
            return true
        }

        return false
    }
}
