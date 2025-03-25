package greenhouse_api

import java.time.LocalDateTime

data class MessagePayload(
    val request: Any,
    val messageTimestamp: LocalDateTime? = LocalDateTime.now()
)