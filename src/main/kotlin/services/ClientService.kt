package services

import entities.dto.*
import utils.AuthResponseMessageCode
import utils.ClientActionMessageCode
import utils.RegisterResponseMessageCode
import utils.UpdateResponseMessageCode

interface ClientService {
    fun registerNewClient(registerRequest: RegisterRequest): RegisterResponseMessageCode
    fun updateClientPassword(updateRequest: UpdateRequest): UpdateResponseMessageCode
    fun clientAction(clientActionRequest: ClientActionRequest): ClientActionMessageCode
    fun findClientByLogin(authRequest: AuthRequest): AuthResponseMessageCode
}