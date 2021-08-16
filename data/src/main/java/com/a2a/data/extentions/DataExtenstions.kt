package com.a2a.data.extentions

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

fun Date.formatToViewTimeStamp(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.ENGLISH)
    return sdf.format(this)
}


fun String.formatToServerDateDefaults(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
    return sdf.format(this)
}


fun Date.formatToViewDateStamp(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
    return sdf.format(this)
}

fun Date.formatToViewDateStampSlash(): String {
    val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
    return sdf.format(this)
}

fun formatCliqDate(date: Date?): String {
    val dateFormat: DateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
    return dateFormat.format(date)
}

fun formatCliqTime(date: Date?): String {
    val dateFormat: DateFormat = SimpleDateFormat("HH:mm:ss", Locale.ENGLISH)
    return dateFormat.format(date)
}


