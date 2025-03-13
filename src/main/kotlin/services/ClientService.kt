package services

import entities.dto.*
import utils.AuthResponseMessageCode
import utils.ClientActionMessageCode
import utils.RegisterResponseMessageCode

interface ClientService {
    fun registerNewClient(registerRequest: RegisterRequest): RegisterResponseMessageCode
    fun clientAction(clientActionRequest: ClientActionRequest): ClientActionMessageCode
    fun findClientByLogin(authRequest: AuthRequest): AuthResponseMessageCode
    fun updateClientPassword(updateRequest: UpdateRequest): UpdateResponse
}