package com.a2a.data.model.beneficiary
import android.os.Parcelable



import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class GetManageIMTBeneficiaryResponse(
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
        @Parcelize
        class Body : Parcelable

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
            @SerializedName("BeneficiaryInternational")
            var beneficiaryInternational: List<BeneficiaryInternational> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) : Parcelable {
            @Parcelize
            data class BeneficiaryInternational(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("Address")
                var address: String = "",
                @SerializedName("AdminFlag")
                var adminFlag: Boolean = false,
                @SerializedName("Attr")
                var attr: String = "",
                @SerializedName("BankCode")
                var bankCode: String = "",
                @SerializedName("BankName")
                var bankName: String = "",
                @SerializedName("BenName")
                var benName: String = "",
                @SerializedName("BenName2")
                var benName2: String = "",
                @SerializedName("BenName3")
                var benName3: String = "",
                @SerializedName("BenName4")
                var benName4: String = "",
                @SerializedName("BenType")
                var benType: String = "",
                @SerializedName("BenefBankSwift")
                var benefBankSwift: String = "",
                @SerializedName("Branch")
                var branch: String = "",
                @SerializedName("City")
                var city: String = "",
                @SerializedName("ClientAccNo")
                var clientAccNo: String = "",
                @SerializedName("ClientName")
                var clientName: String = "",
                @SerializedName("Country")
                var country: String = "",
                @SerializedName("CustID")
                var custID: Int = 0,
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("Enabled")
                var enabled: Boolean = false,
                @SerializedName("FName")
                var fName: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("InterBankSwift")
                var interBankSwift: String = "",
                @SerializedName("LName")
                var lName: String = "",
                @SerializedName("RegionCode")
                var regionCode: String = "",
                @SerializedName("SName")
                var sName: String = "",
                @SerializedName("TName")
                var tName: String = ""
            ) : Parcelable

            @Parcelize
            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0
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