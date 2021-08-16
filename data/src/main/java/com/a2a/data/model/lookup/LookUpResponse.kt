package com.a2a.data.model.lookup

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class LookUpResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        data class Body(
            @SerializedName("LookUpName")
            var lookUpName: String = ""
        )

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

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
        )
    }

    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        data class Body(
            @SerializedName("AddPredAcc")
            var addPredAcc: List<AddPredAcc> = listOf(),
            @SerializedName("Branch")
            var branch: List<Branch> = listOf(),
            @SerializedName("Country")
            var country: List<Country> = listOf(),
            @SerializedName("Currency")
            var currency: List<Currency> = listOf(),
            @SerializedName("DeactiveReason")
            var deactiveReason: List<DeactiveReason> = listOf(),
            @SerializedName("Demo")
            var demo: List<Demo> = listOf(),
            @SerializedName("Help")
            var help: List<Help> = listOf(),
            @SerializedName("MarketingBanner")
            var marketingBanner: List<MarketingBanner> = listOf(),
            @SerializedName("RTGSAccTypes")
            var rTGSAccTypes: List<RTGSAccType> = listOf(),
            @SerializedName("RTGSBankList")
            var rTGSBankList: List<RTGSBank> = listOf(),
            @SerializedName("RTGSTransferList")
            var rTGSTransferList: List<RTGSTransfer> = listOf(),
            @SerializedName("RtpRejectReason")
            var rtpRejectReason: List<RtpRejectReason> = listOf(),
            @SerializedName("StopCCardRs")
            var stopCCardRs: List<StopCCardR> = listOf(),
            @SerializedName("StopPCardRs")
            var stopPCardRs: List<StopPCardR> = listOf(),
            @SerializedName("TrxTypes")
            var trxTypes: List<TrxType> = listOf(),
            @SerializedName("ATMs")
            var aTMs: ArrayList<ATM?> = arrayListOf(),
            @SerializedName("MaritalStatus")
            var maritalStatus: ArrayList<AddPredAcc?> = arrayListOf(),
            @SerializedName("eMailCategory")
            var eMailCategory: List<BaseLookUpsModel> = listOf(),
        ) {
            data class ATM(
                @SerializedName("AName")
                var aName: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("EName")
                var eName: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Latitude")
                var latitude: String = "",
                @SerializedName("Longitude")
                var longitude: String = ""
            )

            data class AddPredAcc(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class Branch(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("ALocation")
                var aLocation: String = "",
                @SerializedName("ATitle")
                var aTitle: String = "",
                @SerializedName("BranchCode")
                var branchCode: String = "",
                @SerializedName("Distance")
                var distance: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ELocation")
                var eLocation: String = "",
                @SerializedName("ETitle")
                var eTitle: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Latitude")
                var latitude: String = "",
                @SerializedName("Longitude")
                var longitude: String = "",
                @SerializedName("PhoneNo")
                var phoneNo: String = ""
            )
            @Parcelize
            data class BaseLookUpsModel(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("ID")
                var iD: Int = 0
            ):Parcelable
            @Parcelize
            data class Country(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("Code")
                var code: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Telecom")
                var telecom: String = ""
            ) : Parcelable {
                override fun toString(): String {
                    return eDesc
                }
            }

            data class Currency(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("Code")
                var code: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("ISOCode")
                var iSOCode: String = ""
            )

            data class DeactiveReason(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class Demo(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("ATitle")
                var aTitle: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ETitle")
                var eTitle: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Img")
                var img: String = ""
            )

            data class Help(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AText")
                var aText: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EText")
                var eText: String = "",
                @SerializedName("ID")
                var iD: Int = 0
            )

            data class MarketingBanner(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("ATitle")
                var aTitle: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ETitle")
                var eTitle: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Img")
                var img: String = ""
            )

            data class RTGSAccType(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class RTGSBank(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class RTGSTransfer(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class RtpRejectReason(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            ){
                override fun toString(): String {
                    return eDesc
                }
            }

            data class StopCCardR(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class StopPCardR(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class TrxType(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )
        }

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

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
        ) {
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            )
        }
    }

    data class ErrorMsg(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ErrorCode")
        var errorCode: Int = 0
    )
}
