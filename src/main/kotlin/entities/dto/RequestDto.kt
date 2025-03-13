package entities.dto

import utils.ClientAction

data class RegisterRequest(
    val login: String,
    val email: String,
    val password: String,
    val passwordConfirm: String
)

data class UpdateRequest(
    val login: String,
    val oldPassword: String,
    val newPassword: String,
    val confirmNewPassword: String
)

data class ClientActionRequest(
    val login: String,
    val verifyCode: String,
    val action: ClientAction
)

data class AuthRequest(
    val login: String,
    val password: String
)