package greenhouse_api

import java.time.LocalDateTime

open class Response(
    open val message: Any,
    open val status: Number,
    open val messageTimestamp: LocalDateTime? = LocalDateTime.now()
)
