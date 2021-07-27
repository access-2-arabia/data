package com.a2a.data.model.efawateercom.myBills


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class BulkInquireResponse(
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
            @SerializedName("Bills")
            var bills: List<Bill> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
            @Parcelize
            data class Bill(
                @SerializedName("A2AChannel")
                var a2AChannel: String = "",
                @SerializedName("A2APWD")
                var a2APWD: String = "",
                @SerializedName("A2AUserID")
                var a2AUserID: String = "",
                @SerializedName("Address")
                var address: String = "",
                @SerializedName("BillNo")
                var billNo: String = "",
                @SerializedName("BillerCode")
                var billerCode: Int = 0,
                @SerializedName("BillingNo")
                var billingNo: String = "",
                @SerializedName("Bills")
                var bills: List<Bill_> = listOf(),
                @SerializedName("CustID")
                var custID: String = "",
                @SerializedName("CustInfoFlag")
                var custInfoFlag: Boolean = false,
                @SerializedName("DateFlag")
                var dateFlag: Boolean = false,
                @SerializedName("eMail")
                var eMail: String = "",
                @SerializedName("EndDt")
                var endDt: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0,
                @SerializedName("ErrorEDesc")
                var errorEDesc: String = "",
                @SerializedName("ID")
                var iD: String = "",
                @SerializedName("IdType")
                var idType: String = "",
                @SerializedName("IncPayments")
                var incPayments: Boolean = false,
                @SerializedName("InqRefNo")
                var inqRefNo: String = "",
                @SerializedName("JOEBPPSNo")
                var jOEBPPSNo: Int = 0,
                @SerializedName("Name")
                var name: String = "",
                @SerializedName("Nation")
                var nation: String = "",
                @SerializedName("Phone")
                var phone: String = "",
                @SerializedName("ServiceType")
                var serviceType: String = "",
                @SerializedName("StartDt")
                var startDt: String = "",
                var isChecked: Boolean,
                var isSelectable: Boolean,
                var billerDescription: String,
                var nickName: String,
                var noDueBill :Boolean = false

            ) : Parcelable {
                @Parcelize
                data class Bill_(
                    @SerializedName("BillNo")
                    var billNo: String = "",
                    @SerializedName("BillStatus")
                    var billStatus: String = "",
                    @SerializedName("DueAmount")
                    var dueAmount: Double = 0.0,
                    @SerializedName("DueDate")
                    var dueDate: String = "",
                    @SerializedName("FeesAmt")
                    var feesAmt: Double = 0.0,
                    @SerializedName("FeesOnBiller")
                    var feesOnBiller: Boolean = false,
                    @SerializedName("HisBills")
                    var hisBills: List<HisBill> = listOf(),
                    @SerializedName("IssueDate")
                    var issueDate: String = "",
                    @SerializedName("AllowPart")
                    var allowPart: Boolean = false,
                    @SerializedName("Lower")
                    var lower: Double = 0.0,
                    @SerializedName("ServiceType")
                    var serviceType: String = "",
                    @SerializedName("Upper")
                    var upper: Double = 0.0,
                    var paidAmount: Double = 0.0,
                ) : Parcelable {
                    @Parcelize
                    data class HisBill(
                        @SerializedName("BankCode")
                        var bankCode: Int = 0,
                        @SerializedName("DueAmount")
                        var dueAmount: Double = 0.0,
                        @SerializedName("JOEBPPSTrx")
                        var jOEBPPSTrx: String = "",
                        @SerializedName("PaidAmt")
                        var paidAmt: Double = 0.0,
                        @SerializedName("PmtStatus")
                        var pmtStatus: String = "",
                        @SerializedName("ProcessDate")
                        var processDate: String = ""
                    ) : Parcelable
                }
            }

            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0
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