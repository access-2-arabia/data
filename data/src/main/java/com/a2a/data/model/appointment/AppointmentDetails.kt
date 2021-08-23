package com.a2a.data.model.appointment


import com.google.gson.annotations.SerializedName

class AppointmentDetails : ArrayList<AppointmentDetails.AppointmentDetailsItem>(){
    data class AppointmentDetailsItem(
        @SerializedName("ActivationCode")
        var activationCode: String = "",
        @SerializedName("AppDate")
        var appDate: String = "",
        @SerializedName("AppTime")
        var appTime: String = "",
        @SerializedName("AppointmentTimeIndex")
        var appointmentTimeIndex: String = "",
        @SerializedName("BankName")
        var bankName: String = "",
        @SerializedName("BranchID")
        var branchID: String = "",
        @SerializedName("BranchName")
        var branchName: String = "",
        @SerializedName("Language")
        var language: String = "",
        @SerializedName("NoOfCustomers")
        var noOfCustomers: String = "",
        @SerializedName("PreChar")
        var preChar: String = "",
        @SerializedName("ServiceID")
        var serviceID: String = "",
        @SerializedName("ServiceName")
        var serviceName: String = "",
        @SerializedName("TicketID")
        var ticketID: String = "",
        @SerializedName("TicketImage")
        var ticketImage: String = "",
        @SerializedName("TicketNumber")
        var ticketNumber: String = ""
    )
}