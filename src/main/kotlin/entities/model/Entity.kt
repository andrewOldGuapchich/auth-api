package entities.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "client")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "amnd_date")
    val amndDate: LocalDateTime? = LocalDateTime.now(),
    @Column(name = "amnd_state", length = 10)
    @Enumerated(EnumType.STRING)
    val amndState: AmndState = AmndState.WAITING,
    @OneToOne
    @JoinColumn(name = "prev_id", referencedColumnName = "id", nullable = true)
    val prevClient: Client? = null,
    @Column(name = "message_payload")
    val messagePayload: String = "",
    @Column(name = "login", unique = true)
    val login: String = "",
    @Column(name = "email_address", unique = true)
    val emailAddress: String = "",
    @Column(name = "action", nullable = false)
    @Enumerated(EnumType.STRING)
    val action: ClientAction = ClientAction.CREATE,
    @OneToMany(mappedBy = "client", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var credentials: List<Credential> = mutableListOf(),
    @OneToMany(mappedBy = "client", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val verificationData: List<VerificationData> = mutableListOf()
) {
    fun getActiveCredential(): Credential? = credentials.find {
        it.amndState == AmndState.ACTIVE
    }

    fun getActiveVerificationData(): VerificationData? = verificationData.find {
        it.amndState == AmndState.ACTIVE
    }
}

@Entity
@Table(name="credential")
data class Credential(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "amnd_date")
    val amndDate: LocalDateTime? = LocalDateTime.now(),
    @Column(name = "amnd_state", length = 10)
    @Enumerated(value = EnumType.STRING)
    val amndState: AmndState = AmndState.ACTIVE,
    @OneToOne
    @JoinColumn(name = "prev_id", referencedColumnName = "id", nullable = true)
    val prevCredential: Credential? = null,
    @Column(name = "password_hash", nullable = false)
    val passwordHash: String = "",
    @ManyToOne(cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "client_id", nullable = false, referencedColumnName = "id")
    val client: Client? = null
)

@Entity
@Table(name = "data_verify")
data class VerificationData(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "amnd_state", length = 10)
    @Enumerated(EnumType.STRING)
    val amndState: AmndState = AmndState.ACTIVE,
    @Column(name = "verify_code")
    val verifyCode: String = "",
    @Column(name = "create_date")
    val createDate: LocalDateTime? = LocalDateTime.now(),
    @Column(name = "client_email")
    val clientEmail: String = "",
    @Column(name = "expire_date")
    val expireDate: LocalDateTime? = LocalDateTime.now(),
    @ManyToOne(cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "client_id", nullable = false, referencedColumnName = "id")
    val client: Client? = null
)

enum class ClientAction {
    CREATE,
    UPDATE,
    DELETE
}

enum class AmndState {
    ACTIVE,
    CLOSED,
    INACTIVE,
    WAITING,
}