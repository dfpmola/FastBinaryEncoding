//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.12.0.0
//------------------------------------------------------------------------------

import Foundation

public protocol LogListener {
    // Enable/Disable logging
    var logging: Bool { get set }
}

// Fast Binary Encoding log listener
public protocol ReceiveLogListener: LogListener {

    // Receive log message handler
    func onReceiveLog(message: String)
}

public extension ReceiveLogListener {
    func onReceiveLog(message: String) {}
}

public protocol SenderListener: LogListener {
    // Send message handler
    func onSend(buffer: Data, offset: Int, size: Int) throws -> Int

    // Send log message handler
    func onSendLog(message: String)
}

public extension SenderListener {
    func onSend(buffer: Data, offset: Int, size: Int) throws -> Int { return 0 }
    func onSendLog(message: String) {}
}
