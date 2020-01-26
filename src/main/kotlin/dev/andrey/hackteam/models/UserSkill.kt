package dev.andrey.hackteam.models

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class UserSkill(
        @Id
        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        val user: User,

        @Id
        val skill: String
): Serializable