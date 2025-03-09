package services

import entities.dto.AuthRequest
import entities.dto.RegisterRequest
import utils.AuthResponseMessageCode
import utils.RegisterResponseMessageCode

interface ClientService {
    fun registerNewClient(request: RegisterRequest): RegisterResponseMessageCode
    fun findClientByLogin(authRequest: AuthRequest): AuthResponseMessageCode
}