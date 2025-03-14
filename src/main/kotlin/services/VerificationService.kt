package services

import entities.model.Client
import entities.model.VerificationData

interface VerificationService {
    fun generateVerificationCode(): Number
    fun saveVerificationCode(client: Client): Number //потом переделать
    fun findVerificationCode(client: Client): VerificationData
}