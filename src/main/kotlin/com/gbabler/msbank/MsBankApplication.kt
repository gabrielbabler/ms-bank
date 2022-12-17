package com.gbabler.msbank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsBankApplication

fun main(args: Array<String>) {
	runApplication<MsBankApplication>(*args)
}
