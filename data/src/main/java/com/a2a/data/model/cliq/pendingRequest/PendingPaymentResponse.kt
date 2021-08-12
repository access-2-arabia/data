package com.a2a.data.model.cliq.pendingRequest


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class PendingPaymentResponse(
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
        class Body(
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
            var connectorID: Any = Any(),
            @SerializedName("Device")
            var device: Any = Any(),
            @SerializedName("DeviceID")
            var deviceID: Any = Any(),
            @SerializedName("DeviceToken")
            var deviceToken: Any = Any(),
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
            var sessionID: Any = Any(),
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
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("ErrorDesc")
            var errorDesc: String = "",
            @SerializedName("LastTrxNo")
            var lastTrxNo: Int = 0,
            @SerializedName("PayRefNo")
            var payRefNo: String = "",
            @SerializedName("TrxDetails")
            var trxDetails: List<TrxDetail> = listOf(),
            @SerializedName("TrxDir")
            var trxDir: String = "",
            @SerializedName("TrxStatus")
            var trxStatus: String = ""
        ) {
            @Parcelize
            data class TrxDetail(
                @SerializedName("AddInfo1")
                var addInfo1: String = "",
                @SerializedName("AddInfo2")
                var addInfo2: String = "",
                @SerializedName("AddInfo3")
                var addInfo3: String = "",
                @SerializedName("AddInfo4")
                var addInfo4: String = "",
                @SerializedName("Amount")
                var amount: Double = 0.0,
                @SerializedName("CdtrAcct")
                var cdtrAcct: String = "",
                @SerializedName("CdtrAddr")
                var cdtrAddr: String = "",
                @SerializedName("CdtrAgt")
                var cdtrAgt: String = "",
                @SerializedName("CdtrAlias")
                var cdtrAlias: String = "",
                @SerializedName("CdtrIsIndvl")
                var cdtrIsIndvl: String = "",
                @SerializedName("CdtrMCC")
                var cdtrMCC: String = "",
                @SerializedName("CdtrName")
                var cdtrName: String = "",
                @SerializedName("CdtrRecordID")
                var cdtrRecordID: String = "",
                @SerializedName("CtgyPurp")
                var ctgyPurp: String = "",
                @SerializedName("Curr")
                var curr: String = "",
                @SerializedName("DbtrAcct")
                var dbtrAcct: String = "",
                @SerializedName("DbtrAddr")
                var dbtrAddr: String = "",
                @SerializedName("DbtrAgt")
                var dbtrAgt: String = "",
                @SerializedName("DbtrAlias")
                var dbtrAlias: String = "",
                @SerializedName("DbtrIsIndvl")
                var dbtrIsIndvl: String = "",
                @SerializedName("DbtrMCC")
                var dbtrMCC: String = "",
                @SerializedName("DbtrName")
                var dbtrName: String = "",
                @SerializedName("DbtrRecordID")
                var dbtrRecordID: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0,
                @SerializedName("InstrInfo")
                var instrInfo: String = "",
                @SerializedName("MsgID")
                var msgID: String = "",
                @SerializedName("PayRefNo")
                var payRefNo: String = "",
                @SerializedName("ProcessFlag")
                var processFlag: String = "",
                @SerializedName("RTPDate")
                var rTPDate: String = "",
                @SerializedName("RgltryRptg")
                var rgltryRptg: String = "",
                @SerializedName("RmtInf")
                var rmtInf: String = "",
                @SerializedName("StatusDate")
                var statusDate: String = "",
                @SerializedName("SvcLvl")
                var svcLvl: String = "",
                @SerializedName("TrxDir")
                var trxDir: String = "",
                @SerializedName("TrxReason")
                var trxReason: String = "",
                @SerializedName("TrxStatus")
                var trxStatus: String = "",
                @SerializedName("TrxType")
                var trxType: String = ""
            ):Parcelable
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
            var sessionID: Any = Any(),
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