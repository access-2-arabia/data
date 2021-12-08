package com.a2a.data.model.wu.directtobank
import android.os.Parcelable


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
@Parcelize
data class WuTemplateResponse(
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
        data class Body(
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("DeviceId")
            var deviceId: String = "",
            @SerializedName("DeviceType")
            var deviceType: String = "",
            @SerializedName("LookUpName")
            var lookUpName: String = "",
            @SerializedName("queryfilter1")
            var queryfilter1: String = "",
            @SerializedName("queryfilter2")
            var queryfilter2: String = "",
            @SerializedName("queryfilter3")
            var queryfilter3: String = ""
        ) : Parcelable {
            @Parcelize
            data class CustProfile(
                @SerializedName("CID")
                var cID: String = "",
                @SerializedName("CustID")
                var custID: String = "",
                @SerializedName("CustMnemonic")
                var custMnemonic: String = "",
                @SerializedName("CustStatus")
                var custStatus: String = "",
                @SerializedName("CustType")
                var custType: String = "",
                @SerializedName("RepID")
                var repID: String = ""
            ) : Parcelable
        }

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
            @SerializedName("DeliveryOption")
            var deliveryOption: DeliveryOption = DeliveryOption()
        ) : Parcelable {
            @Parcelize
            data class DeliveryOption(
                @SerializedName("ACCOUNT_NUM")
                var aCCOUNTNUM: String = "",
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
                @SerializedName("DATA_MORE")
                var dATAMORE: String = "",
                @SerializedName("DATA_NUM_RECS")
                var dATANUMRECS: Double = 0.0,
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
                @SerializedName("ip_address")
                var ipAddress: String = "",
                @SerializedName("LogID")
                var logID: Int = 0,
                @SerializedName("MobFlag")
                var mobFlag: Boolean = false,
                @SerializedName("NAME")
                var nAME: String = "",
                @SerializedName("PartnerId")
                var partnerId: String = "",
                @SerializedName("pin_verification_time")
                var pinVerificationTime: String = "",
                @SerializedName("RECORDSET_TYPE")
                var rECORDSETTYPE: RECORDSETTYPE = RECORDSETTYPE(),
                @SerializedName("RegionCode")
                var regionCode: String = "",
                @SerializedName("RepID")
                var repID: Int = 0,
                @SerializedName("second_exchange_fee")
                var secondExchangeFee: Double = 0.0,
                @SerializedName("StatCode")
                var statCode: Int = 0,
                @SerializedName("SysName")
                var sysName: String = "",
                @SerializedName("SystemId")
                var systemId: String = "",
                @SerializedName("tax_rate")
                var taxRate: Double = 0.0,
                @SerializedName("version")
                var version: String = ""
            ) : Parcelable {
                @Parcelize
                data class RECORDSETTYPE(
                    @SerializedName("GETDELIVERYOPTIONTEMPLATE")
                    var gETDELIVERYOPTIONTEMPLATE: List<GETDELIVERYOPTIONTEMPLATE> = listOf()
                ) : Parcelable {
                    @Parcelize
                    data class GETDELIVERYOPTIONTEMPLATE(
                        @SerializedName("CATEGORY")
                        var cATEGORY: String = "",
                        @SerializedName("DESCRIPTION")
                        var dESCRIPTION: String = "",
                        @SerializedName("PRODUCT")
                        var pRODUCT: String = "",
                        @SerializedName("T_INDEX")
                        var tINDEX: String = "",
                        @SerializedName("DESCRIPTION")
                        var getdeliveryoptiontemplateDescription: String = ""
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