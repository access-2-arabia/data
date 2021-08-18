package com.a2a.data.model.appointment


import com.google.gson.annotations.SerializedName

data class CancelAppointmentPostData(
    @SerializedName("AppointmentID")
    var appointmentID: String = ""
)