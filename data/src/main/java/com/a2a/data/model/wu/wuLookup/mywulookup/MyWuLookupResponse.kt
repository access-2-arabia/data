package com.a2a.data.model.wu.wuLookup.mywulookup
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyWuLookupResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
): Parcelable {
    @Parcelize
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ):Parcelable {
        @Parcelize
        class Body(
        ):Parcelable

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ):Parcelable
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
        ):Parcelable
    }
    @Parcelize
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ):Parcelable {
        @Parcelize
        data class Body(
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("actual_payout_amount")
            var actualPayoutAmount: Int = 0,
            @SerializedName("addr_line1")
            var addrLine1: String = "",
            @SerializedName("CID")
            var cID: Int = 0,
            @SerializedName("card_changes_count")
            var cardChangesCount: String = "",
            @SerializedName("card_class")
            var cardClass: String = "",
            @SerializedName("card_replaced_count")
            var cardReplacedCount: String = "",
            @SerializedName("CdAddress_validation")
            var cdAddressValidation: Boolean = false,
            @SerializedName("city")
            var city: String = "",
            @SerializedName("contact_phone")
            var contactPhone: String = "",
            @SerializedName("conversion_fee")
            var conversionFee: Double = 0.0,
            @SerializedName("country_iso_code")
            var countryIsoCode: String = "",
            @SerializedName("CustStatus")
            var custStatus: Boolean = false,
            @SerializedName("CustType")
            var custType: Int = 0,
            @SerializedName("date_of_birth_mmddyyyy")
            var dateOfBirthMmddyyyy: String = "",
            @SerializedName("delete_code")
            var deleteCode: String = "",
            @SerializedName("dup")
            var dup: String = "",
            @SerializedName("email")
            var email: String = "",
            @SerializedName("enrollment_source")
            var enrollmentSource: String = "",
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
            @SerializedName("expiration_date")
            var expirationDate: String = "",
            @SerializedName("export_date")
            var exportDate: String = "",
            @SerializedName("export_status")
            var exportStatus: String = "",
            @SerializedName("first_use_date")
            var firstUseDate: String = "",
            @SerializedName("flag")
            var flag: String = "",
            @SerializedName("frequency_of_transfers_per_year")
            var frequencyOfTransfersPerYear: String = "",
            @SerializedName("frequency_of_transfers_using_wu")
            var frequencyOfTransfersUsingWu: String = "",
            @SerializedName("id_on_file")
            var idOnFile: String = "",
            @SerializedName("increment_amount_from_min")
            var incrementAmountFromMin: Int = 0,
            @SerializedName("IndFirstName")
            var indFirstName: String = "",
            @SerializedName("IndLastName")
            var indLastName: String = "",
            @SerializedName("interests")
            var interests: String = "",
            @SerializedName("is_address_updated_flag")
            var isAddressUpdatedFlag: String = "",
            @SerializedName("issue_date")
            var issueDate: String = "",
            @SerializedName("last_change_date")
            var lastChangeDate: String = "",
            @SerializedName("last_change_source")
            var lastChangeSource: String = "",
            @SerializedName("last_modification_time")
            var lastModificationTime: String = "",
            @SerializedName("last_use_date")
            var lastUseDate: String = "",
            @SerializedName("level_code")
            var levelCode: String = "",
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("marketing_code")
            var marketingCode: String = "",
            @SerializedName("max_number_receivers_allowed")
            var maxNumberReceiversAllowed: String = "",
            @SerializedName("maximum_redemption")
            var maximumRedemption: Int = 0,
            @SerializedName("minimum_redemption")
            var minimumRedemption: Int = 0,
            @SerializedName("MobFlag")
            var mobFlag: Boolean = false,
            @SerializedName("mobile_phone_number")
            var mobilePhoneNumber: String = "",
            @SerializedName("MyWu_Number")
            var myWuNumber: String = "",
            @SerializedName("name_altkey")
            var nameAltkey: String = "",
            @SerializedName("national_number")
            var nationalNumber: String = "",
            @SerializedName("number_matches")
            var numberMatches: Int = 0,
            @SerializedName("original_card_type")
            var originalCardType: String = "",
            @SerializedName("pc_source")
            var pcSource: String = "",
            @SerializedName("pin_verification_time")
            var pinVerificationTime: String = "",
            @SerializedName("Points")
            var points: Int = 0,
            @SerializedName("postal_code")
            var postalCode: String = "",
            @SerializedName("preferred_language")
            var preferredLanguage: String = "",
            @SerializedName("preferred_mode_to_receive_info")
            var preferredModeToReceiveInfo: String = "",
            @SerializedName("PrmCode")
            var prmCode: String = "",
            @SerializedName("reason_1_for_transfer")
            var reason1ForTransfer: String = "",
            @SerializedName("reason_2_for_transfer")
            var reason2ForTransfer: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("RepID")
            var repID: Int = 0,
            @SerializedName("returned_mail_status")
            var returnedMailStatus: String = "",
            @SerializedName("reward_value_pin_disc")
            var rewardValuePinDisc: Int = 0,
            @SerializedName("second_exchange_fee")
            var secondExchangeFee: Double = 0.0,
            @SerializedName("sender_gender")
            var senderGender: String = "",
            @SerializedName("StatCode")
            var statCode: Int = 0,
            @SerializedName("State")
            var state: String = "",
            @SerializedName("suppress_flag")
            var suppressFlag: String = "",
            @SerializedName("tax_rate")
            var taxRate: Double = 0.0,
            @SerializedName("total_points_earned")
            var totalPointsEarned: String = "",
            @SerializedName("unv_buffer")
            var unvBuffer: String = "",
            @SerializedName("update")
            var update: String = ""
        ):Parcelable

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ):Parcelable
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
        ):Parcelable {
            @Parcelize
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            ):Parcelable
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
    ):Parcelable
}