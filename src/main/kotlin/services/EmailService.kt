package services

import entities.model.ClientAction

interface EmailService {
    fun sendMail(email: String, text: String) //сделать статусы отправки
    fun generateMessage(clientAction: ClientAction, code: Number): String
}