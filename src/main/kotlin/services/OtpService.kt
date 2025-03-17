package services

import entities.model.Client
import entities.model.OtpArchive

interface OtpService {
    fun generateOtp(): Number
    fun saveOtp(value: Map<String, String>): Number //потом переделать
    fun findOtp(condition: String): String?
    fun deleteOtp(condition: String)
}