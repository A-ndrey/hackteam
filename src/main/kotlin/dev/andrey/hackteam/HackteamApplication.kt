package dev.andrey.hackteam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HackteamApplication

fun main(args: Array<String>) {
    runApplication<HackteamApplication>(*args)
}
