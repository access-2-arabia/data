package com.a2a.data.model.card.debit.transactionhistory

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DebitTransactionHistoryResponse(
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
            @SerializedName("CardNumber")
            var cardNumber: String = "",
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("ErrorEDesc")
            var errorEDesc: String = "",
            @SerializedName("GetAuthr")
            var getAuthr: String = "",
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("MaskPan")
            var maskPan: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("TransCount")
            var transCount: String = "",
            @SerializedName("ResultSet")
            var transactions: List<ResultSet> = listOf()
        ) : Parcelable {
            @Parcelize
            data class ResultSet(
                @SerializedName("EmbossedName")
                var EmbossedName: String = "",
                @SerializedName("CardProgram")
                var CardProgram: String = "",
                @SerializedName("StatusDate")
                var StatusDate: String = "",
                @SerializedName("ExpiryDate")
                var ExpiryDate: String = "",
                @SerializedName("BranchName")
                var BranchName: String = "",
                @SerializedName("MobileNo")
                var MobileNo: String = "",
                @SerializedName("ErrorCode")
                var ErrorCode: String = "",
                @SerializedName("CardNo")
                var CardNo: String = "",
                @SerializedName("CardNumber")
                var CardNumber: String = "",
                @SerializedName("CardBalance")
                var CardBalance: String = "",
                @SerializedName("AmountDue")
                var AmountDue: String = "",
                @SerializedName("FeeAmount")
                var FeeAmount: String = "",
                @SerializedName("Disputed")
                var Disputed: String = "",
                @SerializedName("TotalFees")
                var TotalFees: String = "",
                @SerializedName("TrxAmount")
                var TrxAmount: String = "",
                @SerializedName("cardType")
                var cardType: String = "",
                @SerializedName("CardNumberMasked")
                var CardNumberMasked: String = ""
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