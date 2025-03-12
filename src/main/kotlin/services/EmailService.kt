package services

interface EmailService {
    fun sendMail(email: String, subject: String, text: String) //сделать статусы отправки
    fun generateCode(): Number
}