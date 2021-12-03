package com.daisuzz.samplespringevent

import org.springframework.stereotype.Service

@Service
class SampleService(
    val syncApplicationEventPublisher: SyncApplicationEventPublisher,
    val asyncApplicationEventPublisher: AsyncApplicationEventPublisher
) {

    fun getSyncResource(): String {
        syncApplicationEventPublisher.fire(GetEvent())
        return "Received!!"
    }

    fun getAsyncResource(): String {
        asyncApplicationEventPublisher.fire(GetEvent())
        return "Received!!"
    }
}
