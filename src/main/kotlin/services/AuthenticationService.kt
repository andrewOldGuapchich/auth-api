package services

import entities.dto.AuthRequest
import entities.dto.RegisterRequest
import org.springframework.http.ResponseEntity

interface AuthenticationService {
    fun registerClientAndTokenGenerate(registerRequest: RegisterRequest): ResponseEntity<*>
    fun authentication(authRequest: AuthRequest): ResponseEntity<*>
}