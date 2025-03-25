package greenhouse_api.auth_service.services

import greenhouse_api.auth_service.entities.builder.ClientBuilder
import greenhouse_api.auth_service.entities.dto.client.AuthRequest
import greenhouse_api.auth_service.entities.dto.client.ClientActionRequest
import greenhouse_api.auth_service.entities.dto.client.RegisterRequest
import greenhouse_api.auth_service.entities.dto.client.UpdateRequest
import greenhouse_api.auth_service.entities.model.Client
import greenhouse_api.utills.AuthResponseMessageCode
import greenhouse_api.utills.ClientActionMessageCode
import greenhouse_api.utills.RegisterResponseMessageCode
import greenhouse_api.utills.UpdateResponseMessageCode

interface ClientServiceL2 {
    fun registerNewClient(registerRequest: RegisterRequest): RegisterResponseMessageCode
    fun updateClientPassword(updateRequest: UpdateRequest): UpdateResponseMessageCode
    fun clientAction(clientActionRequest: ClientActionRequest): ClientActionMessageCode
    fun findClientByLogin(authRequest: AuthRequest): AuthResponseMessageCode
    fun createClient(clientBuilder: ClientBuilder): Client
}