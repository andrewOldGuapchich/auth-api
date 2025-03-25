package greenhouse_api.auth_service.services

import greenhouse_api.auth_service.entities.dto.client.ClientActionRequest
import greenhouse_api.auth_service.entities.dto.client.RegisterRequest
import org.springframework.http.ResponseEntity

interface ClientServiceL1 {
    fun registerClient(registerRequest: RegisterRequest): ResponseEntity<*>
    fun clientAction(clientActionRequest: ClientActionRequest): ResponseEntity<*>
}