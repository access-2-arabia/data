package com.a2a.data.model.cliq.sendMoney


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class SendMoneyResponse(
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
        @Parcelize
        data class Body(
            @SerializedName("Amount")
            var amount: Double = 0.0,
            @SerializedName("CdtrAcct")
            var cdtrAcct: String = "",
            @SerializedName("CdtrAlias")
            var cdtrAlias: String = "",
            @SerializedName("CdtrIsIndvl")
            var cdtrIsIndvl: Boolean = false,
            @SerializedName("CdtrMCC")
            var cdtrMCC: String = "",
            @SerializedName("CdtrName")
            var cdtrName: String = "",
            @SerializedName("CdtrPstlAdr")
            var cdtrPstlAdr: String = "",
            @SerializedName("CdtrRecordID")
            var cdtrRecordID: String = "",
            @SerializedName("CrdtAccIsIBan")
            var crdtAccIsIBan: Boolean = false,
            @SerializedName("CtgyPurp")
            var ctgyPurp: String = "",
            @SerializedName("Curr")
            var curr: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("DbtrAccIsIBan")
            var dbtrAccIsIBan: Boolean = false,
            @SerializedName("DbtrAcct")
            var dbtrAcct: String = "",
            @SerializedName("DbtrAlias")
            var dbtrAlias: String = "",
            @SerializedName("DbtrBic")
            var dbtrBic: String = "",
            @SerializedName("DbtrIsIndvl")
            var dbtrIsIndvl: Boolean = false,
            @SerializedName("DbtrMCC")
            var dbtrMCC: String = "",
            @SerializedName("DbtrName")
            var dbtrName: String = "",
            @SerializedName("DbtrPstlAdr")
            var dbtrPstlAdr: String = "",
            @SerializedName("DbtrRecordID")
            var dbtrRecordID: String = "",
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("ErrorDesc")
            var errorDesc: String = "",
            @SerializedName("FwdgAgt")
            var fwdgAgt: String = "",
            @SerializedName("id")
            var id: String = "",
            @SerializedName("InstrInf")
            var instrInf: String = "",
            @SerializedName("MsgId")
            var msgId: String = "",
            @SerializedName("OrgMsgType")
            var orgMsgType: String = "",
            @SerializedName("OrgnlCreDtTm")
            var orgnlCreDtTm: String = "",
            @SerializedName("OrgnlEndToEndId")
            var orgnlEndToEndId: String = "",
            @SerializedName("OrgnlInstrId")
            var orgnlInstrId: String = "",
            @SerializedName("OrgnlMsgId")
            var orgnlMsgId: String = "",
            @SerializedName("OrgnlPmtInfId")
            var orgnlPmtInfId: String = "",
            @SerializedName("PayRefNo")
            var payRefNo: String = "",
            @SerializedName("ProcessFlag")
            var processFlag: Int = 0,
            @SerializedName("RTPStatus")
            var rTPStatus: Boolean = false,
            @SerializedName("RejectAddInfo")
            var rejectAddInfo: String = "",
            @SerializedName("RejectDescription")
            var rejectDescription: String = "",
            @SerializedName("RejectReason")
            var rejectReason: String = "",
            @SerializedName("RgltryRptg")
            var rgltryRptg: String = "",
            @SerializedName("RmtInf")
            var rmtInf: String = "",
            @SerializedName("SenderName")
            var senderName: String = "",
            @SerializedName("SenderPstlAdr")
            var senderPstlAdr: String = "",
            @SerializedName("SvcLvl")
            var svcLvl: String = ""
        ) : Parcelable

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