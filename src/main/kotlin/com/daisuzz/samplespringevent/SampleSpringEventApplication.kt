package com.daisuzz.samplespringevent

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class SampleSpringEventApplication

fun main(args: Array<String>) {
    runApplication<SampleSpringEventApplication>(*args)
}
