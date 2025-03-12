package entities.model

import jakarta.persistence.*
import utils.ClientAction
import java.time.LocalDateTime

@Entity
@Table(name = "client")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "amnd_date")
    val amndDate: LocalDateTime? = LocalDateTime.now(),
    @Column(name = "amnd_state", length = 1)
    val amndState: String = "A",
    @Column(name = "prev_id")
    var prevId: Long? = null,
    @Column(name = "message_payload")
    val messagePayload: String = "",
    @Column(name = "login", unique = true)
    val login: String = "",
    @Column(name = "email_address", unique = true)
    val emailAddress: String = "",
    @Column(name = "action", nullable = false)
    @Enumerated(EnumType.STRING)
    val action: ClientAction = ClientAction.CREATE,
    @OneToOne(mappedBy = "client", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var credential: Credential? = null
)

@Entity
@Table(name="credential")
data class Credential(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "amnd_date")
    val amndDate: LocalDateTime? = LocalDateTime.now(),
    @Column(name = "amnd_state", length = 1)
    val amndState: String = "A",
    @Column(name = "prev_id")
    val prevId: Long? = null,
    @Column(name = "password_hash", nullable = false)
    val passwordHash: String = "",
    @ManyToOne(cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "client_id", nullable = false, referencedColumnName = "id")
    val client: Client? = null
)

@Entity
@Table(name = "data_verify")
data class DataVerify(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
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