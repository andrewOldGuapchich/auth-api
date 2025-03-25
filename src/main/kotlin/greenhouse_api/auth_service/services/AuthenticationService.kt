package greenhouse_api.auth_service.services

import greenhouse_api.auth_service.entities.dto.client.AuthRequest
import org.springframework.http.ResponseEntity

interface AuthenticationService {
    //fun registerClientAndTokenGenerate(registerRequest: RegisterRequest): ResponseEntity<*>
    fun authentication(authRequest: AuthRequest): ResponseEntity<*>
}