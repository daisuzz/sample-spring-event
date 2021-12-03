package com.daisuzz.samplespringevent

import java.time.LocalDateTime

data class GetEvent(
    val message: String = "Get Resource",
    val createdAt: LocalDateTime = LocalDateTime.now(),
)
