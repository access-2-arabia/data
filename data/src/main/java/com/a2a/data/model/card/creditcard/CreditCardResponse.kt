package com.a2a.data.model.card.creditcard
import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CreditCardResponse(
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
            @SerializedName("CardType")
            var cardType: String = "",
            @SerializedName("Cards")
            var cards: List<Card> = listOf(),
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("ErrorEDesc")
            var errorEDesc: String = "",
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("MaskPan")
            var maskPan: String = "",
            @SerializedName("RIMNumber")
            var rIMNumber: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = ""
        ) : Parcelable {
            @Parcelize
            data class Card(
                @SerializedName("AccTransAmt")
                var accTransAmt: Double = 0.0,
                @SerializedName("BankAccNo")
                var bankAccNo: String = "",
                @SerializedName("BounusPoints")
                var bounusPoints: String = "",
                @SerializedName("CardAccCurr")
                var cardAccCurr: String = "",
                @SerializedName("CardAccCurrency")
                var cardAccCurrency: String = "",
                @SerializedName("CardIssueDate")
                var cardIssueDate: String = "",
                @SerializedName("CardNo")
                var cardNo: String = "",
                @SerializedName("CardNumberMasked")
                var cardNumberMasked: String = "",
                @SerializedName("CreditLimit")
                var creditLimit: Double = 0.0,
                @SerializedName("CustIDNo")
                var custIDNo: String = "",
                @SerializedName("ExpiryDate")
                var expiryDate: String = "",
                @SerializedName("HolderName")
                var holderName: String = "",
                @SerializedName("Holders")
                var holders: Holders = Holders(),
                @SerializedName("OpenToBuy")
                var openToBuy: Double = 0.0,
                @SerializedName("PayDueAmt")
                var payDueAmt: Double = 0.0,
                @SerializedName("PayDueDate")
                var payDueDate: String = "",
                @SerializedName("Status")
                var status: String = "",
                @SerializedName("UsedBal")
                var usedBal: Double = 0.0
            ) : Parcelable {
                @Parcelize
                data class Holders(
                    @SerializedName("A2AChannel")
                    var a2AChannel: String = "",
                    @SerializedName("A2APWD")
                    var a2APWD: String = "",
                    @SerializedName("A2AUserID")
                    var a2AUserID: String = "",
                    @SerializedName("CardHolders")
                    var cardHolders: List<CardHolder> = listOf(),
                    @SerializedName("CardNumber")
                    var cardNumber: String = "",
                    @SerializedName("ErrorCode")
                    var errorCode: Int = 0,
                    @SerializedName("ErrorEDesc")
                    var errorEDesc: String = "",
                    @SerializedName("LogID")
                    var logID: Int = 0,
                    @SerializedName("MaskPan")
                    var maskPan: String = "",
                    @SerializedName("Month")
                    var month: String = "",
                    @SerializedName("PostDate")
                    var postDate: String = "",
                    @SerializedName("RegionCode")
                    var regionCode: String = "",
                    @SerializedName("TransDate")
                    var transDate: String = "",
                    @SerializedName("Year")
                    var year: String = ""
                ) : Parcelable {
                    @Parcelize
                    data class CardHolder(
                        @SerializedName("AccTransAmt")
                        var accTransAmt: Double = 0.0,
                        @SerializedName("Amt")
                        var amt: String = "",
                        @SerializedName("BankAccNo")
                        var bankAccNo: String = "",
                        @SerializedName("BranchName")
                        var branchName: String = "",
                        @SerializedName("CardNumber")
                        var cardNumber: String = "",
                        @SerializedName("ClosingBal")
                        var closingBal: Double = 0.0,
                        @SerializedName("Curr")
                        var curr: String = "",
                        @SerializedName("Currency")
                        var currency: String = "",
                        @SerializedName("CustIDNo")
                        var custIDNo: String = "",
                        @SerializedName("CycleDate")
                        var cycleDate: String = "",
                        @SerializedName("DueDate")
                        var dueDate: String = "",
                        @SerializedName("ErrorCode")
                        var errorCode: Int = 0,
                        @SerializedName("LogID")
                        var logID: Int = 0,
                        @SerializedName("MXPAccNo")
                        var mXPAccNo: String = "",
                        @SerializedName("MerNameAndLoc")
                        var merNameAndLoc: String = "",
                        @SerializedName("MinDue")
                        var minDue: String = "",
                        @SerializedName("OpeningBal")
                        var openingBal: Double = 0.0,
                        @SerializedName("PostDate")
                        var postDate: String = "",
                        @SerializedName("ProcessDate")
                        var processDate: String = "",
                        @SerializedName("totalDueAmountLast")
                        var totalDueAmountLast: String = "",
                        @SerializedName("TransDate")
                        var transDate: String = "",
                        @SerializedName("TransType")
                        var transType: String = ""
                    ) : Parcelable
                }
            }
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