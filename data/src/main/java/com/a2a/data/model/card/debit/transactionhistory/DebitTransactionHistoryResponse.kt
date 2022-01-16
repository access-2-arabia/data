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
            @SerializedName("AmountDue")
            var amountDue: Double = 0.0,
            @SerializedName("CardBalance")
            var cardBalance: Double = 0.0,
            @SerializedName("CardNumber")
            var cardNumber: String = "",
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
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
            @SerializedName("Trans")
            var trans: List<Tran> = listOf(),
            @SerializedName("TrxAmount")
            var trxAmount: Double = 0.0
        ) : Parcelable {
            @Parcelize
            data class ResultSet(
                @SerializedName("ARN")
                var aRN: String = "",
                @SerializedName("Amt")
                var amt: Double = 0.0,
                @SerializedName("BillingAmt")
                var billingAmt: Double = 0.0,
                @SerializedName("BillingCurr")
                var billingCurr: String = "",
                @SerializedName("Curr")
                var curr: String = "",
                @SerializedName("MerCity")
                var merCity: String = "",
                @SerializedName("MerCountry")
                var merCountry: String = "",
                @SerializedName("MerName")
                var merName: String = "",
                @SerializedName("TransCode")
                var transCode: String = "",
                @SerializedName("TransDate")
                var transDate: String = "",
                @SerializedName("TransRef")
                var transRef: String = "",
                @SerializedName("TransSigne")
                var transSigne: String = ""
            ) : Parcelable

            @Parcelize
            data class Tran(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("ActivMerType")
                var activMerType: String = "",
                @SerializedName("Amt")
                var amt: Double = 0.0,
                @SerializedName("Arn")
                var arn: String = "",
                @SerializedName("AuthIdentResp")
                var authIdentResp: String = "",
                @SerializedName("AuthRefNo")
                var authRefNo: String = "",
                @SerializedName("BankAccNo")
                var bankAccNo: String = "",
                @SerializedName("BillingAmt")
                var billingAmt: Double = 0.0,
                @SerializedName("BillingCED")
                var billingCED: Int = 0,
                @SerializedName("BillingCurr")
                var billingCurr: String = "",
                @SerializedName("CED")
                var cED: Int = 0,
                @SerializedName("CardAcceptorNameLoc")
                var cardAcceptorNameLoc: String = "",
                @SerializedName("CardHolderAcc")
                var cardHolderAcc: String = "",
                @SerializedName("CardNumber")
                var cardNumber: String = "",
                @SerializedName("City")
                var city: String = "",
                @SerializedName("Code")
                var code: String = "",
                @SerializedName("Country")
                var country: String = "",
                @SerializedName("Curr")
                var curr: String = "",
                @SerializedName("Date")
                var date: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("MXPAccNo")
                var mXPAccNo: String = "",
                @SerializedName("MerNameAndLoc")
                var merNameAndLoc: String = "",
                @SerializedName("MerchantnameName")
                var merchantnameName: String = "",
                @SerializedName("Name")
                var name: String = "",
                @SerializedName("PostDate")
                var postDate: String = "",
                @SerializedName("Refrence")
                var refrence: String = "",
                @SerializedName("Sign")
                var sign: String = "",
                @SerializedName("TranDate")
                var tranDate: String = "",
                @SerializedName("TransDate")
                var transDate: String = "",
                @SerializedName("TransInAccCurr")
                var transInAccCurr: String = "",
                @SerializedName("TransType")
                var transType: String = ""
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