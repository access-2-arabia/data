package com.a2a.data.model.appointment


import com.google.gson.annotations.SerializedName

data class EditAppointmentPostData(
    @SerializedName("AppDate")
    var appDate: String = "",
    @SerializedName("AppTime")
    var appTime: String = "",
    @SerializedName("AppointmentID")
    var appointmentID: String = "",
    @SerializedName("AppointmentTimeIndex")
    var appointmentTimeIndex: String = "",
    @SerializedName("BranchID")
    var branchID: String = "",
    @SerializedName("CustomerName")
    var customerName: String = "",
    @SerializedName("Language")
    var language: String = "",
    @SerializedName("MobileNumber")
    var mobileNumber: String = "",
    @SerializedName("ServiceID")
    var serviceID: String = ""
)