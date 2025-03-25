package greenhouse_api.utills

enum class RegisterResponseMessageCode(private val messageText: String){
    ALREADY_EXISTS("The user already exists!"),
    PASSWORD_MATCH_ERROR("Passwords don't match!"),
    WAITING_ACTIVATION_CODE("The activation code has been sent!"),
    INTERNAL_ERROR("Server internal error!");

    override fun toString(): String {
        return messageText
    }
}

enum class UpdateResponseMessageCode(private val messageText: String) {
    PASSWORD_MATCH_ERROR("Passwords don't match!"),
    WAITING_VERIFICATION_CODE("The verification code has been sent!"),
    INTERNAL_ERROR("Server internal error!");

    override fun toString(): String {
        return messageText
    }
}

enum class AuthResponseMessageCode(private val message: String) {
    SUCCESSFULLY_AUTHENTICATE("The user was successfully authenticated!"),
    PASSWORD_INCORRECT("Incorrect password!"),
    CLIENT_NOT_FOUND("Client not founds!"),
    INTERNAL_ERROR("Server internal error!");

    override fun toString(): String {
        return message
    }
}
enum class ActivationClientMessageCode(private val messageText: String){
    CODE_MATCH_ERROR("Codes don't match!"),
    CODE_IS_EXPIRED("The code has expired!"),
    ACTIVATION_SUCCESSFULLY("Success!"),
    INTERNAL_ERROR("Server internal error!");

    override fun toString(): String {
        return messageText
    }
}

enum class ClientActionMessageCode(private val messageText: String){
    CODE_MATCH_ERROR("Codes don't match!"),
    CODE_IS_EXPIRED("The code has expired!"),
    CLIENT_NOT_FOUND("Client not found!"),
    SUCCESSFULLY_CREATE("The user was successfully created!"),
    SUCCESSFULLY_UPDATE("The user was successfully updated!"),
    INTERNAL_ERROR("Server internal error!");

    override fun toString(): String {
        return messageText
    }
}