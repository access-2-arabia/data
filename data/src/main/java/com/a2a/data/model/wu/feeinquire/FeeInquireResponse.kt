package com.a2a.data.model.wu.feeinquire

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FeeInquireResponse(
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
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("actual_payout_amount")
            var actualPayoutAmount: Int = 0,
            @SerializedName("CID")
            var cID: Int = 0,
            @SerializedName("CdAddress_validation")
            var cdAddressValidation: Boolean = false,
            @SerializedName("ConnectorId")
            var connectorId: String = "",
            @SerializedName("conversion_fee")
            var conversionFee: Double = 0.0,
            @SerializedName("CustStatus")
            var custStatus: Boolean = false,
            @SerializedName("CustType")
            var custType: Int = 0,
            @SerializedName("DeviceId")
            var deviceId: String = "",
            @SerializedName("DeviceType")
            var deviceType: String = "",
            @SerializedName("ErrorADesc")
            var errorADesc: String = "",
            @SerializedName("ErrorCode")
            var errorCode: String = "",
            @SerializedName("ErrorEDesc")
            var errorEDesc: String = "",
            @SerializedName("exchange_fee")
            var exchangeFee: Double = 0.0,
            @SerializedName("exchange_rate")
            var exchangeRate: Double = 0.0,
            @SerializedName("external_reference_no")
            var externalReferenceNo: String = "",
            @SerializedName("ExternalReferenceNumber")
            var externalReferenceNumber: String = "",
            @SerializedName("ip_address")
            var ipAddress: String = "",
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("MobFlag")
            var mobFlag: Boolean = false,
            @SerializedName("notification_preference")
            var notificationPreference: String = "",
            @SerializedName("PartnerId")
            var partnerId: String = "",
            @SerializedName("pin_verification_time")
            var pinVerificationTime: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("RepID")
            var repID: Int = 0,
            @SerializedName("second_exchange_fee")
            var secondExchangeFee: Double = 0.0,
            @SerializedName("ServiceOption")
            var serviceOption: List<ServiceOption> = listOf(),
            @SerializedName("StatCode")
            var statCode: Int = 0,
            @SerializedName("SysName")
            var sysName: String = "",
            @SerializedName("SystemId")
            var systemId: String = "",
            @SerializedName("tax_rate")
            var taxRate: Double = 0.0,
            @SerializedName("test_question_flag")
            var testQuestionFlag: String = "",
            @SerializedName("version")
            var version: String = ""
        ) : Parcelable {
            @Parcelize
            data class ServiceOption(
                @SerializedName("AccountNumber")
                var accountNumber: String = "",
                @SerializedName("actual_payout_amount")
                var actualPayoutAmount: Int = 0,
                @SerializedName("CID")
                var cID: Int = 0,
                @SerializedName("CdAddress_validation")
                var cdAddressValidation: Boolean = false,
                @SerializedName("charges")
                var charges: String = "",
                @SerializedName("conversion_fee")
                var conversionFee: Double = 0.0,
                @SerializedName("CustStatus")
                var custStatus: Boolean = false,
                @SerializedName("CustType")
                var custType: Int = 0,
                @SerializedName("Dstcountry_iso_code")
                var dstcountryIsoCode: String = "",
                @SerializedName("Dstcurrency_iso_code")
                var dstcurrencyIsoCode: String = "",
                @SerializedName("ErrorADesc")
                var errorADesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: String = "",
                @SerializedName("ErrorEDesc")
                var errorEDesc: String = "",
                @SerializedName("exchange_fee")
                var exchangeFee: Double = 0.0,
                @SerializedName("exchange_rate")
                var exchangeRate: Double = 0.0,
                @SerializedName("expected_payout_amount")
                var expectedPayoutAmount: String = "",
                @SerializedName("gross_amount")
                var grossAmount: String = "",
                @SerializedName("LogID")
                var logID: Int = 0,
                @SerializedName("MobFlag")
                var mobFlag: Boolean = false,
                @SerializedName("Orgcountry_iso_code")
                var orgcountryIsoCode: String = "",
                @SerializedName("Orgcurrency_iso_code")
                var orgcurrencyIsoCode: String = "",
                @SerializedName("payment_digest")
                var paymentDigest: String = "",
                @SerializedName("pin_verification_time")
                var pinVerificationTime: String = "",
                @SerializedName("principal_amount")
                var principalAmount: String = "",
                @SerializedName("PrmDiscount")
                var prmDiscount: String = "",
                @SerializedName("Prmmessage")
                var prmmessage: String = "",
                @SerializedName("Product_Code")
                var productCode: String = "",
                @SerializedName("Product_Name")
                var productName: String = "",
                @SerializedName("Product_routing_code")
                var productRoutingCode: String = "",
                @SerializedName("Product_Type")
                var productType: String = "",
                @SerializedName("RegionCode")
                var regionCode: String = "",
                @SerializedName("RepID")
                var repID: Int = 0,
                @SerializedName("second_exchange_fee")
                var secondExchangeFee: Double = 0.0,
                @SerializedName("StatCode")
                var statCode: Int = 0,
                @SerializedName("tax_amount")
                var taxAmount: String = "",
                @SerializedName("tax_rate")
                var taxRate: Double = 0.0,
                @SerializedName("transaction_type")
                var transactionType: String = ""
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