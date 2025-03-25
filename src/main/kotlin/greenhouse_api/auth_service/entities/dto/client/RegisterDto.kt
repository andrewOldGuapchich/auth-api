package greenhouse_api.auth_service.entities.dto.client

import greenhouse_api.Response
import greenhouse_api.auth_service.entities.model.ClientAction
import java.time.LocalDateTime

data class RegisterRequest(
    val login: String,
    val email: String,
    val password: String,
    val passwordConfirm: String
)

data class RegisterResponse (
    val login: String,
    val token: String?,
    override val message: Any,
    override val status: Number,
    override val messageTimestamp: LocalDateTime? = LocalDateTime.now()
) : Response(message, status, messageTimestamp)

data class ClientActionRequest(
    val login: String,
    val verifyCode: String,
    val action: ClientAction
)

