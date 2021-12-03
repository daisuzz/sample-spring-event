package com.daisuzz.samplespringevent

import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class SampleService(val applicationEventPublisher: ApplicationEventPublisher) {

    fun getResource(): String {

        applicationEventPublisher.publishEvent(GetEvent())

        return "Received!!"
    }
}
