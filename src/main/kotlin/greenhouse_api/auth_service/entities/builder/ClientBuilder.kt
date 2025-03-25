package greenhouse_api.auth_service.entities.builder

import greenhouse_api.auth_service.entities.model.AmndState
import greenhouse_api.auth_service.entities.model.Client
import greenhouse_api.auth_service.entities.model.ClientAction
import greenhouse_api.auth_service.entities.model.Credential
import java.time.LocalDateTime

typealias ClientBuilder = ClientParams.() -> Unit
typealias CredentialBuilder = CredentialParams.() -> Unit

data class ClientParams(
    var amndDate: LocalDateTime? = LocalDateTime.now(),
    var amndState: AmndState = AmndState.WAITING,
    var prevClient: Client? = null,
    var messagePayload: String = "",
    var login: String = "",
    var emailAddress: String = "",
    var action: ClientAction = ClientAction.CREATE,
    var credentials: CredentialBuilder? = null
)

data class CredentialParams(
    var amndDate: LocalDateTime? = LocalDateTime.now(),
    var amndState: AmndState = AmndState.ACTIVE,
    var prevCredential: Credential? = null,
    var passwordHash: String = "",
)