package  com.a2a.data.model.cliq.sendMoney


import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.a2a.network.model.OTPResponse
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class CliQSendMoneyResponse(
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

            @SerializedName("bic")
            var bic: String = "",
            @SerializedName("Authenticate")
            var authenticate: CliQRequestMoneyResponse.A2ARequest.Body.Authenticate =
                CliQRequestMoneyResponse.A2ARequest.Body.Authenticate(),

            @SerializedName("OTP")
            var oTP: CliQRequestMoneyResponse.A2ARequest.Body.OTP =
                CliQRequestMoneyResponse.A2ARequest.Body.OTP(),

            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: CliQRequestMoneyResponse.A2ARequest.Body.ServiceConfiguration =
                CliQRequestMoneyResponse.A2ARequest.Body.ServiceConfiguration()
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
            @SerializedName("Authenticate")
            var authenticate: OTPResponse.A2AResponse.Body.Authenticate = OTPResponse.A2AResponse.Body.Authenticate(),
            @SerializedName("OTP")
            var oTP: OTPResponse.A2AResponse.Body.OTP = OTPResponse.A2AResponse.Body.OTP(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: OTPResponse.A2AResponse.Body.ServiceConfiguration = OTPResponse.A2AResponse.Body.ServiceConfiguration(),
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("Acciban")
            var acciban: String = "",
            @SerializedName("Address")
            var address: String = "",
            @SerializedName("AddressCity")
            var addressCity: String = "",
            @SerializedName("AddressCountry")
            var addressCountry: String = "",
            @SerializedName("AddressSPR")
            var addressSPR: String = "",
            @SerializedName("bic")
            var bic: String = "",
            @SerializedName("currency")
            var currency: String = "",
            @SerializedName("detARarFName")
            var detARarFName: String = "",
            @SerializedName("detARarLName")
            var detARarLName: String = "",
            @SerializedName("detARarSName")
            var detARarSName: String = "",
            @SerializedName("detARarTName")
            var detARarTName: String = "",
            @SerializedName("detCustomerType")
            var detCustomerType: String = "",
            @SerializedName("detEngenSName")
            var detEngenSName: String = "",
            @SerializedName("detEngenTName")
            var detEngenTName: String = "",
            @SerializedName("Name")
            var name: String = "",
            @SerializedName("NickName")
            var nickName: String = "",
            @SerializedName("Surname")
            var surname: String = "",
            @SerializedName("type")
            var type: String = "",

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