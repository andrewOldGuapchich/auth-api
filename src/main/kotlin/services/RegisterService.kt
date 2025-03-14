package services

import entities.dto.ClientActionRequest
import entities.dto.RegisterRequest
import org.springframework.http.ResponseEntity

interface RegisterService {
    fun registerClient(registerRequest: RegisterRequest): ResponseEntity<*>
    fun clientAction(clientActionRequest: ClientActionRequest): ResponseEntity<*>
}