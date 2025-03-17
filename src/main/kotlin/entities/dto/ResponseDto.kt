package entities.dto

import java.time.LocalDateTime

data class RegisterResponse (
    val login: String,
    val token: String?,
    override val message: Any,
    override val status: Number,
    override val messageTimestamp: LocalDateTime? = LocalDateTime.now()
) : Response(message, status, messageTimestamp)

data class UpdateResponse(
    override val message: Any,
    override val status: Number,
    override val messageTimestamp: LocalDateTime? = LocalDateTime.now()
) : Response(message, status, messageTimestamp)

data class AuthResponse(
    val token: String,
    override val message: Any,
    override val status: Number,
    override val messageTimestamp: LocalDateTime? = LocalDateTime.now()
) : Response(message, status, messageTimestamp)

open class Response(
    open val message: Any,
    open val status: Number,
    open val messageTimestamp: LocalDateTime? = LocalDateTime.now()
)

data class MessagePayload(
    val request: Any,
    val messageTimestamp: LocalDateTime? = LocalDateTime.now()
)