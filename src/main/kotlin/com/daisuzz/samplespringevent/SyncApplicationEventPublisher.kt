package com.daisuzz.samplespringevent

import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class SyncApplicationEventPublisher(private val applicationEventPublisher: ApplicationEventPublisher) {

    fun fire(event: SampleApplicationEvent) {
        applicationEventPublisher.publishEvent(event)
    }
}
