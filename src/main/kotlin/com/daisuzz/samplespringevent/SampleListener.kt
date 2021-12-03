package com.daisuzz.samplespringevent

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class SampleListener {

    @EventListener
    fun handleOnGetResource(getEvent: GetEvent) {
        println("${getEvent.message} : ${getEvent.createdAt}")
    }
}
