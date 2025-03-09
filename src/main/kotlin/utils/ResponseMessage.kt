package utils

enum class AuthResponseMessageCode(private val message: String) {
    SUCCESSFULLY_AUTHENTICATE("The user was successfully authenticated!"),
    PASSWORD_INCORRECT("Incorrect password!"),
    CLIENT_NOT_FOUND("Client not founds!");

    override fun toString(): String {
        return message
    }
}

enum class RegisterResponseMessageCode(private val messageText: String){
    SUCCESSFULLY_CREATE("The user was successfully created!"),
    ALREADY_EXISTS("The user already exists!"),
    PASSWORD_MATCH_ERROR("Passwords don't match!");

    override fun toString(): String {
        return messageText
    }
}

