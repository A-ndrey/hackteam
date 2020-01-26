package dev.andrey.hackteam.models

import java.time.LocalDate
import javax.persistence.*

@Entity
data class User(
        @Id
        val id: String,

        @Column(nullable = false)
        val name: String,

        val email: String? = null,

        val phone: String? = null,

        @Column(nullable = false)
        val birthday: LocalDate,

        @Column(nullable = false)
        val gender: String,

        @OneToOne
        @JoinColumn(name = "location_id", referencedColumnName = "id")
        val location: Location,

        @Column(nullable = false)
        val photo: String,

        val about: String? = "",

        @OneToMany(
                mappedBy = "user",
                cascade = [CascadeType.ALL],
                orphanRemoval = true
        )
        val skills: List<UserSkill>
)