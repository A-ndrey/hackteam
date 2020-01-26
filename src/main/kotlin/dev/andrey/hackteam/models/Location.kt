package dev.andrey.hackteam.models

import javax.persistence.*

@Entity
data class Location(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(nullable = false)
        val country: String,

        @Column(nullable = false)
        val city: String
)