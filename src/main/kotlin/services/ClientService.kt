package services

import entities.dto.AuthRequest
import entities.dto.RegisterRequest
import entities.dto.UpdateRequest
import utils.ActivationClientResponseCode
import utils.AuthResponseMessageCode
import utils.RegisterResponseMessageCode

interface ClientService {
    fun registerNewClient(request: RegisterRequest): Any
    fun activationClient(): ActivationClientResponseCode
    fun findClientByLogin(authRequest: AuthRequest): AuthResponseMessageCode
    fun updateClientPassword(updateRequest: UpdateRequest): Any
}