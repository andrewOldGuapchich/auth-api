package greenhouse_api.greenhouse_log

data class LogData (
    var sourceApp: String?,
    var taskId: String?,
    var message: String?,
    var messagePayload: String,
    var messageType: MessageType
)

enum class MessageType {
    INFO,
    WARN,
    ERROR
}