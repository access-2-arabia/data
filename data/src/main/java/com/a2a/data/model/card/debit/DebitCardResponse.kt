package com.a2a.data.model.card.debit
import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DebitCardResponse(
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
            @SerializedName("A2AChannel")
            var a2AChannel: String = "",
            @SerializedName("A2APWD")
            var a2APWD: String = "",
            @SerializedName("A2AUserID")
            var a2AUserID: String = "",
            @SerializedName("AmountDue")
            var amountDue: Double = 0.0,
            @SerializedName("CardBalance")
            var cardBalance: Double = 0.0,
            @SerializedName("CustomerId")
            var customerId: String = "",
            @SerializedName("Disputed")
            var disputed: Boolean = false,
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("FeeAmount")
            var feeAmount: Double = 0.0,
            @SerializedName("NoOfRecords")
            var noOfRecords: Double = 0.0,
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ResultSet")
            var resultSet: List<ResultSet> = listOf(),
            @SerializedName("TotalFees")
            var totalFees: Double = 0.0,
            @SerializedName("TrxAmount")
            var trxAmount: Double = 0.0,
            @SerializedName("VirtualCardLimit")
            var virtualCardLimit: VirtualCardLimit = VirtualCardLimit()
        ) : Parcelable {
            @Parcelize
            data class ResultSet(
                @SerializedName("AmountDue")
                var amountDue: Double = 0.0,
                @SerializedName("BranchName")
                var branchName: String = "",
                @SerializedName("CardBalance")
                var cardBalance: Double = 0.0,
                @SerializedName("CardNo")
                var cardNo: String = "",
                @SerializedName("CardNumber")
                var cardNumber: String = "",
                @SerializedName("CardNumberMasked")
                var cardNumberMasked: String = "",
                @SerializedName("CardProgram")
                var cardProgram: String = "",
                @SerializedName("CardType")
                var cardType: String = "",
                @SerializedName("Disputed")
                var disputed: Boolean = false,
                @SerializedName("EmbossedName")
                var embossedName: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0,
                @SerializedName("ExpiryDate")
                var expiryDate: String = "",
                @SerializedName("FeeAmount")
                var feeAmount: Double = 0.0,
                @SerializedName("MobileNo")
                var mobileNo: String = "",
                @SerializedName("Status")
                var status: String = "",
                @SerializedName("StatusDate")
                var statusDate: String = "",
                @SerializedName("TotalFees")
                var totalFees: Double = 0.0,
                @SerializedName("TrxAmount")
                var trxAmount: Double = 0.0
            ) : Parcelable

            @Parcelize
            data class VirtualCardLimit(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("ParamID")
                var paramID: String = ""
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