package com.daisuzz.samplespringevent

import org.springframework.context.ApplicationEventPublisher
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
@Async
class AsyncApplicationEventPublisher(private val applicationEventPublisher: ApplicationEventPublisher) {

    fun fire(event: SampleApplicationEvent) {
        applicationEventPublisher.publishEvent(event)
    }
}
