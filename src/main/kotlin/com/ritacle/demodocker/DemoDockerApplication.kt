package com.ritacle.demodocker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoDockerApplication

fun main(args: Array<String>) {
    runApplication<DemoDockerApplication>(*args)
}
