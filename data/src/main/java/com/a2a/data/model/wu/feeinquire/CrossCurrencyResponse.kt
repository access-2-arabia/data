package com.a2a.data.model.wu.feeinquire

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CrossCurrencyResponse(
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
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("AccountNumberFrom")
            var accountNumberFrom: String = "",
            @SerializedName("AllAmt")
            var allAmt: Double = 0.0,
            @SerializedName("AmountFrom")
            var amountFrom: Double = 0.0,
            @SerializedName("AmountTo")
            var amountTo: Double = 0.0,
            @SerializedName("AmtCr")
            var amtCr: Double = 0.0,
            @SerializedName("AmtDb")
            var amtDb: Double = 0.0,
            @SerializedName("AmtTo")
            var amtTo: Double = 0.0,
            @SerializedName("AmtToConvert")
            var amtToConvert: Double = 0.0,
            @SerializedName("BankRef")
            var bankRef: String = "",
            @SerializedName("BillStatus")
            var billStatus: Int = 0,
            @SerializedName("BranchCode")
            var branchCode: String = "",
            @SerializedName("CXR_RATE")
            var cXRRATE: Double = 0.0,
            @SerializedName("CalculatedAmount")
            var calculatedAmount: Double = 0.0,
            @SerializedName("CanDate")
            var canDate: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ChannelID")
            var channelID: Int = 0,
            @SerializedName("ComissionAmt")
            var comissionAmt: String = "",
            @SerializedName("Commission")
            var commission: String = "",
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
            @SerializedName("DateTrans")
            var dateTrans: String = "",
            @SerializedName("EndDate")
            var endDate: String = "",
            @SerializedName("Error")
            var error: String = "",
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("ErrorEDesc")
            var errorEDesc: String = "",
            @SerializedName("ExchangeRate")
            var exchangeRate: Double = 0.0,
            @SerializedName("FromCurrency")
            var fromCurrency: String = "",
            @SerializedName("LocalAmtCr")
            var localAmtCr: Double = 0.0,
            @SerializedName("LocalAmtCredit")
            var localAmtCredit: Double = 0.0,
            @SerializedName("LocalAmtDb")
            var localAmtDb: Double = 0.0,
            @SerializedName("LocalAmtdebit")
            var localAmtdebit: Double = 0.0,
            @SerializedName("LocalChargeAmt")
            var localChargeAmt: Double = 0.0,
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("NextPaymentDate")
            var nextPaymentDate: String = "",
            @SerializedName("PortalID")
            var portalID: String = "",
            @SerializedName("Rate")
            var rate: Double = 0.0,
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ReqChannelCore")
            var reqChannelCore: String = "",
            @SerializedName("ResCode")
            var resCode: Int = 0,
            @SerializedName("Target_AMT")
            var targetAMT: Double = 0.0,
            @SerializedName("ToCurrency")
            var toCurrency: String = "",
            @SerializedName("TotalCr")
            var totalCr: Double = 0.0,
            @SerializedName("TotalDr")
            var totalDr: Double = 0.0,
            @SerializedName("TreasuryRate")
            var treasuryRate: Double = 0.0
        ) : Parcelable

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