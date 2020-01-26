package dev.andrey.hackteam.models

import java.io.Serializable
import javax.persistence.*

@Entity
data class UserSec(
        @Id
        @OneToOne
        @JoinColumn(name = "user_id", referencedColumnName = "id")
        val user: User,

        @Column(nullable = false)
        val password: String
): Serializable