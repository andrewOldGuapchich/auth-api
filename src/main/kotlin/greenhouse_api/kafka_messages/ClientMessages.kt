package greenhouse_api.kafka_messages

import greenhouse_api.auth_service.entities.model.ClientAction

data class ClientNtfActionStreaming(
    val login: String,
    val mail: String,
    val action: ClientAction
)