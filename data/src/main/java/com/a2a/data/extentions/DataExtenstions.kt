package com.a2a.data.extenstion

import java.text.SimpleDateFormat
import java.util.*

fun Date.formatToViewTimeStamp(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.getDefault())
    return sdf.format(this)
}