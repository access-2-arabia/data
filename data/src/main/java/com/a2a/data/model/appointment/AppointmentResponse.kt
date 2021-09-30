package com.a2a.data.model.appointment


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AppointmentResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) : Parcelable {
    @Parcelize
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) : Parcelable {
        class Body

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ) : Parcelable

        @Parcelize
        data class Header(
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ConnectorID")
            var connectorID: String = "",
            @SerializedName("Device")
            var device: String = "",
            @SerializedName("DeviceID")
            var deviceID: String = "",
            @SerializedName("DeviceToken")
            var deviceToken: String = "",
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("MethodName")
            var methodName: String = "",
            @SerializedName("Password")
            var password: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ServiceID")
            var serviceID: Int = 0,
            @SerializedName("SessionID")
            var sessionID: String = "",
            @SerializedName("SrvID")
            var srvID: String = "",
            @SerializedName("TimeStamp")
            var timeStamp: String = "",
            @SerializedName("UserID")
            var userID: String = ""
        ) : Parcelable
    }

    @Parcelize
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) : Parcelable {
        @Parcelize
        data class Body(
            @SerializedName("BranchID")
            var branchID: Int = 0,
            @SerializedName("CID")
            var cID: Int = 0,
            @SerializedName("CustStatus")
            var custStatus: Boolean = false,
            @SerializedName("CustType")
            var custType: Int = 0,
            @SerializedName("Details")
            var details: List<Detail> = listOf(),
            @SerializedName("ErrorADesc")
            var errorADesc: String = "",
            @SerializedName("ErrorCode")
            var errorCode: String = "",
            @SerializedName("ErrorEDesc")
            var errorEDesc: String = "",
            @SerializedName("MobFlag")
            var mobFlag: Boolean = false,
            @SerializedName("MobileNumber")
            var mobileNumber: String = "",
            @SerializedName("RepID")
            var repID: Int = 0
        ) : Parcelable {
            @Parcelize
            data class Detail(
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
            ) : Parcelable
        }

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ) : Parcelable

        @Parcelize
        data class Header(
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("Result")
            var result: Result = Result(),
            @SerializedName("SessionID")
            var sessionID: String = "",
            @SerializedName("SrvID")
            var srvID: Int = 0,
            @SerializedName("TimeStamp")
            var timeStamp: String = ""
        ) : Parcelable {
            @Parcelize
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            ) : Parcelable
        }
    }

    @Parcelize
    data class ErrorMsg(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ErrorCode")
        var errorCode: Int = 0
    ) : Parcelable
}