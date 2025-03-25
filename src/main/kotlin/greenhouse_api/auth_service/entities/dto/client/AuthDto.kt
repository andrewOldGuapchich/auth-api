package greenhouse_api.auth_service.entities.dto.client

import greenhouse_api.Response
import java.time.LocalDateTime

data class AuthRequest(
    val login: String,
    val password: String
)

data class AuthResponse(
    val token: String,
    override val message: Any,
    override val status: Number,
    override val messageTimestamp: LocalDateTime? = LocalDateTime.now()
) : Response(message, status, messageTimestamp)