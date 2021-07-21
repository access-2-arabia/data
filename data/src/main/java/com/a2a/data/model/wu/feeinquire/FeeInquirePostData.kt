package com.a2a.data.model.wu.feeinquire

import com.google.gson.annotations.SerializedName

data class FeeInquirePostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("CID")
        var cID: Int = 0,
        @SerializedName("CustStatus")
        var custStatus: String = "",
        @SerializedName("CustType")
        var custType: Int = 0,
        @SerializedName("DeviceId")
        var deviceId: String = "",
        @SerializedName("DeviceType")
        var deviceType: String = "",
        @SerializedName("Dstcountry_iso_code")
        var dstcountryIsoCode: String = "",
        @SerializedName("Dstcurrency_iso_code")
        var dstcurrencyIsoCode: String = "",
        @SerializedName("expected_payout_amount")
        var expectedPayoutAmount: Double = 0.0,
        @SerializedName("MobFlag")
        var mobFlag: Boolean = false,
        @SerializedName("MyWu_Number")
        var myWuNumber: String = "",
        @SerializedName("Orgcountry_iso_code")
        var orgcountryIsoCode: String = "",
        @SerializedName("Orgcurrency_iso_code")
        var orgcurrencyIsoCode: String = "",
        @SerializedName("principal_amount")
        var principalAmount: Double = 0.0,
        @SerializedName("PrmCode")
        var prmCode: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = "",
        @SerializedName("RepID")
        var repID: String = "",
        @SerializedName("transaction_type")
        var transactionType: String = ""
    )
}