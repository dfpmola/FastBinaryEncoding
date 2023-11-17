//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.4.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe

// Fast Binary Encoding ChronoxorEnums final receiver
open class FinalReceiver: ChronoxorFbe.ReceiverProtocol {
    // Receiver values accessors

    // Receiver models accessors

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        build(final: true)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        build(with: buffer, final: true)
    }

    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? FinalReceiverListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: FinalReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {

        return false
    }
}
