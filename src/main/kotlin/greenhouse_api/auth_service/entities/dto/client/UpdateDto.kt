package greenhouse_api.auth_service.entities.dto.client

import greenhouse_api.Response
import java.time.LocalDateTime

data class UpdateRequest(
    val login: String,
    val email: String,
    val oldPassword: String,
    val newPassword: String,
    val confirmNewPassword: String
)

data class UpdateResponse(
    override val message: Any,
    override val status: Number,
    override val messageTimestamp: LocalDateTime? = LocalDateTime.now()
) : Response(message, status, messageTimestamp)