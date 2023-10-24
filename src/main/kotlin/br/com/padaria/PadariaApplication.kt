package br.com.padaria

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PadariaApplication

fun main(args: Array<String>) {
	runApplication<PadariaApplication>(*args)
}
