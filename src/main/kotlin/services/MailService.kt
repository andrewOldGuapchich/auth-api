package services

interface MailService {
    fun sendMail(email: String, subject: String, text: String) //сделать статусы отправки
    fun generateCode(): Number
}