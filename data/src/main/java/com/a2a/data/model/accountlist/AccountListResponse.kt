package com.a2a.data.model.accountlist

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AccountListResponse(
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
        class Body(
        ) : Parcelable

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
            @SerializedName("Accounts")
            var accounts: ArrayList<Account> = ArrayList(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) : Parcelable {
            @Parcelize
            data class Account(
                @SerializedName("AAccountType")
                var aAccountType: String = "",
                @SerializedName("ACurrency")
                var aCurrency: String = "",
                @SerializedName("AccFullADec")
                var accFullADec: String = "",
                @SerializedName("AccFullADescCurr")
                var accFullADescCurr: String = "",
                @SerializedName("AccFullEDec")
                var accFullEDec: String = "",
                @SerializedName("AccFullEDescCurr")
                var accFullEDescCurr: String = "",
                @SerializedName("AccGroupID")
                var accGroupID: String = "",
                @SerializedName("AccountNumber")
                var accountNumber: String = "",
                @SerializedName("AccountType")
                var accountType: String = "",
                @SerializedName("AvailableBalance")
                var availableBalance: String = "",
                @SerializedName("AvailableBalanceCurr")
                var availableBalanceCurr: String = "",
                @SerializedName("AvailableBalanceFC")
                var availableBalanceFC: String = "",
                @SerializedName("Branch")
                var branch: String = "",
                @SerializedName("BranchCode")
                var branchCode: String = "",
                @SerializedName("CurrencyCode")
                var currencyCode: String = "",
                @SerializedName("CurrencyISOCode")
                var currencyISOCode: String = "",
                @SerializedName("CurrentBalance")
                var currentBalance: String = "",
                @SerializedName("CurrentBalanceCurr")
                var currentBalanceCurr: String = "",
                @SerializedName("CurrentBalanceFC")
                var currentBalanceFC: String = "",
                @SerializedName("EAccountType")
                var eAccountType: String = "",
                @SerializedName("ECurrency")
                var eCurrency: String = "",
                @SerializedName("Enabled")
                var enabled: String = "",
                @SerializedName("IBAN")
                var iBAN: String = "",
                @SerializedName("InterestRate")
                var interestRate: Double = 0.0,
                @SerializedName("MaturityDate")
                var maturityDate: String = "",
                @SerializedName("NickName")
                var nickName: String = "",
                @SerializedName("StartDate")
                var startDate: String = "",
                @SerializedName("Type")
                var type: String = "",
                @SerializedName("Description")
                var description: String = "",
                @SerializedName("AccFullNickname")
                var accFullNickName: String ="",

                var isChecked: Boolean = false
            ) : Parcelable {
                override fun toString(): String {
                    return nickName
                }
            }

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