package com.example.courses.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val topicName: Int,
    val associatedTopic: Int,
    @DrawableRes val course: Int,
)
