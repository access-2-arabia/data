package com.a2a.data.extentions

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

fun Date.formatToViewTimeStamp(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.getDefault())
    return sdf.format(this)
}


fun String.formatToServerDateDefaults(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return sdf.format(this)
}


fun Date.formatToViewDateStamp(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return sdf.format(this)
}

fun Date.formatToViewDateStampSlash(): String {
    val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    return sdf.format(this)
}

fun formatCliqDate(date: Date?): String {
    val dateFormat: DateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)
    return dateFormat.format(date)
}

fun formatCliqTime(date: Date?): String {
    val dateFormat: DateFormat = SimpleDateFormat("HH:mm:ss", Locale.US)
    return dateFormat.format(date)
}


