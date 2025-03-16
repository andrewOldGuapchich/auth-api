package services

import entities.model.Client
import entities.model.OtpArchive

interface OtpService {
    fun generateOtp(): Number
    fun saveOtp(client: Client): Number //потом переделать
    fun findOtp(client: Client): OtpArchive
}