package me.jeonguk.example.amqp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExampleAmqpApplication

fun main(args: Array<String>) {
	runApplication<ExampleAmqpApplication>(*args)
}
