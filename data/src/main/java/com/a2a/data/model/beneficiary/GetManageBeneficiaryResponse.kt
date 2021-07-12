package com.a2a.data.model.beneficiary
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GetManageBeneficiaryResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
):Parcelable {
    @Parcelize
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) :Parcelable{
        @Parcelize
        class Body(
        ):Parcelable

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ):Parcelable

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
        ):Parcelable
    }

    @Parcelize
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ):Parcelable {
        @Parcelize
        data class Body(
            @SerializedName("Beneficiary")
            var beneficiary: List<Beneficiary> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ):Parcelable {
            @Parcelize
            data class Beneficiary(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AccNo")
                var accNo: String = "",
                @SerializedName("AdminFlag")
                var adminFlag: Boolean = false,
                @SerializedName("Attr")
                var attr: String = "",
                @SerializedName("Branch")
                var branch: String = "",
                @SerializedName("Curr")
                var curr: String = "",
                @SerializedName("CustID")
                var custID: Int = 0,
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("Enabled")
                var enabled: Boolean = false,
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Lang")
                var lang: String = "",
                @SerializedName("LastTransferAmount")
                var lastTransferAmount: String = "",
                @SerializedName("LastTransferDate")
                var lastTransferDate: String = "",
                @SerializedName("NickName")
                var nickName: String = "",
                @SerializedName("RegionCode")
                var regionCode: String = "",
                @SerializedName("SeqNo")
                var seqNo: String = "",
                @SerializedName("Shortcut")
                var shortcut: String = "",
                @SerializedName("Status")
                var status: Int = 0,
                @SerializedName("TblCust")
                var tblCust: String = "",
                @SerializedName("TblLUBranch")
                var tblLUBranch: String = "",
                @SerializedName("TblLUCurrency")
                var tblLUCurrency: String = "",
                @SerializedName("Trusted")
                var trusted: Boolean = false,
                @SerializedName("Type")
                var type: String = ""
            ):Parcelable

            @Parcelize
            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0
            ):Parcelable
        }
        
        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ):Parcelable
         
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
        ):Parcelable {
            
            @Parcelize
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            ):Parcelable
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
    ):Parcelable
}