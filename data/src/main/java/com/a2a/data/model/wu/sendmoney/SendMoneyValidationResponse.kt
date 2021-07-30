package com.a2a.data.model.wu.sendmoney

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SendMoneyValidationResponse(
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
    ) :Parcelable{
        @Parcelize
        data class Body(
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("ack_flag")
            var ackFlag: String = "",
            @SerializedName("actual_payout_amount")
            var actualPayoutAmount: Int = 0,
            @SerializedName("addr_line1")
            var addrLine1: String = "",
            @SerializedName("BankAccNo")
            var bankAccNo: String = "",
            @SerializedName("BankName")
            var bankName: String = "",
            @SerializedName("BankPINVerTime")
            var bankPINVerTime: String = "",
            @SerializedName("base_charges")
            var baseCharges: String = "",
            @SerializedName("CID")
            var cID: Int = 0,
            @SerializedName("CdAddress_validation")
            var cdAddressValidation: Boolean = false,
            @SerializedName("CdDate_of_birth")
            var cdDateOfBirth: String = "",
            @SerializedName("charges")
            var charges: String = "",
            @SerializedName("city")
            var city: String = "",
            @SerializedName("code")
            var code: String = "",
            @SerializedName("ConnectorId")
            var connectorId: String = "",
            @SerializedName("conversion_fee")
            var conversionFee: Double = 0.0,
            @SerializedName("country")
            var country: String = "",
            @SerializedName("country_code_name")
            var countryCodeName: String = "",
            @SerializedName("country_iso_code")
            var countryIsoCode: String = "",
            @SerializedName("county_tax")
            var countyTax: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("CustMnemonic")
            var custMnemonic: String = "",
            @SerializedName("CustStatus")
            var custStatus: Boolean = false,
            @SerializedName("CustType")
            var custType: Int = 0,
            @SerializedName("date_of_birth")
            var dateOfBirth: String = "",
            @SerializedName("delivery_charges")
            var deliveryCharges: String = "",
            @SerializedName("DeviceId")
            var deviceId: String = "",
            @SerializedName("DeviceType")
            var deviceType: String = "",
            @SerializedName("Dstcountry_iso_code")
            var dstcountryIsoCode: String = "",
            @SerializedName("Dstcurrency_iso_code")
            var dstcurrencyIsoCode: String = "",
            @SerializedName("email")
            var email: String = "",
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
            @SerializedName("external_reference_no")
            var externalReferenceNo: String = "",
            @SerializedName("gross_amount")
            var grossAmount: String = "",
            @SerializedName("ID_Doc")
            var iDDoc: List<IDDoc> = listOf(),
            @SerializedName("IndFirstName")
            var indFirstName: String = "",
            @SerializedName("IndLastName")
            var indLastName: String = "",
            @SerializedName("IndMiddleName")
            var indMiddleName: String = "",
            @SerializedName("ip_address")
            var ipAddress: String = "",
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("MobFlag")
            var mobFlag: Boolean = false,
            @SerializedName("MobileCity_code")
            var mobileCityCode: String = "",
            @SerializedName("MobileNumber")
            var mobileNumber: String = "",
            @SerializedName("municipal_tax")
            var municipalTax: String = "",
            @SerializedName("MyWu_Number")
            var myWuNumber: String = "",
            @SerializedName("name")
            var name: String = "",
            @SerializedName("new_points_earned")
            var newPointsEarned: Int = 0,
            @SerializedName("Orgcountry_iso_code")
            var orgcountryIsoCode: String = "",
            @SerializedName("Orgcurrency_iso_code")
            var orgcurrencyIsoCode: String = "",
            @SerializedName("other_charges")
            var otherCharges: String = "",
            @SerializedName("PartnerId")
            var partnerId: String = "",
            @SerializedName("payment_digest")
            var paymentDigest: String = "",
//            @SerializedName("PersonalMsg")
//            var personalMsg: List<Any> = listOf(),
            @SerializedName("PhoneCountryCode")
            var phoneCountryCode: String = "",
            @SerializedName("PhoneNationalNumber")
            var phoneNationalNumber: String = "",
            @SerializedName("pin_verification_time")
            var pinVerificationTime: String = "",
            @SerializedName("place_of_birth")
            var placeOfBirth: String = "",
            @SerializedName("postal_code")
            var postalCode: String = "",
            @SerializedName("principal_amount")
            var principalAmount: String = "",
            @SerializedName("PrmCode")
            var prmCode: String = "",
            @SerializedName("PrmDescription")
            var prmDescription: String = "",
            @SerializedName("PrmDiscount")
            var prmDiscount: String = "",
            @SerializedName("PrmName")
            var prmName: String = "",
            @SerializedName("Prmmessage")
            var prmmessage: String = "",
            @SerializedName("RFirstName")
            var rFirstName: String = "",
            @SerializedName("RLastName")
            var rLastName: String = "",
            @SerializedName("RMiddleName")
            var rMiddleName: String = "",
            @SerializedName("RVCountry_iso_code")
            var rVCountryIsoCode: String = "",
            @SerializedName("RVcountry_name")
            var rVcountryName: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("RepID")
            var repID: Int = 0,
            @SerializedName("routing_code")
            var routingCode: String = "",
            @SerializedName("second_exchange_fee")
            var secondExchangeFee: Double = 0.0,
            @SerializedName("SessionID")
            var sessionID: String = "",
            @SerializedName("sms_notification_flag")
            var smsNotificationFlag: String = "",
            @SerializedName("SrvID")
            var srvID: String = "",
            @SerializedName("StatCode")
            var statCode: Int = 0,
            @SerializedName("state_tax")
            var stateTax: String = "",
            @SerializedName("SysName")
            var sysName: String = "",
            @SerializedName("SystemId")
            var systemId: String = "",
            @SerializedName("tax_amount")
            var taxAmount: String = "",
            @SerializedName("tax_rate")
            var taxRate: Double = 0.0,
            @SerializedName("temp_transaction_id")
            var tempTransactionId: String = "",
            @SerializedName("template_id")
            var templateId: String = "",
            @SerializedName("transaction_digest")
            var transactionDigest: String = "",
            @SerializedName("transaction_reason")
            var transactionReason: String = "",
            @SerializedName("transaction_type")
            var transactionType: String = "",
            @SerializedName("version")
            var version: String = ""
        ) : Parcelable {
            @Parcelize
            data class IDDoc(
                @SerializedName("country_code")
                var countryCode: String = "",
                @SerializedName("currency_code")
                var currencyCode: String = "",
                @SerializedName("data")
                var `data`: String = "",
                @SerializedName("expiration_date")
                var expirationDate: String = "",
                @SerializedName("id_expires")
                var idExpires: Boolean = false,
                @SerializedName("issue_place")
                var issuePlace: String = "",
                @SerializedName("type")
                var type: String = ""
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