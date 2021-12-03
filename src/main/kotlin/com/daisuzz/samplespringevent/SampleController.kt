package com.daisuzz.samplespringevent

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class SampleController(val sampleService: SampleService) {

    @GetMapping("sync")
    fun getSyncResource(): String {
        return sampleService.getSyncResource()
    }

    @GetMapping("async")
    fun getAsyncResource(): String {
        return sampleService.getAsyncResource()
    }
}
