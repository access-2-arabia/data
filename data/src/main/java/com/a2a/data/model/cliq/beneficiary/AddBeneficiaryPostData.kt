package com.a2a.data.model.cliq.beneficiary

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class AddBeneficiaryPostData(
    @SerializedName("Beneficiary")
    var beneficiary: Beneficiary = Beneficiary(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: String = ""
) {
    data class Beneficiary(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("Address")
        var address: String = "",
        @SerializedName("AdminFlag")
        var adminFlag: String = "",
        @SerializedName("AliasType")
        var aliasType: String = "",
        @SerializedName("BankCode")
        var bankCode: String = "",
        @SerializedName("City")
        var city: String = "",
        @SerializedName("ClientAccNo")
        var clientAccNo: String = "",
        @SerializedName("ClientName")
        var clientName: String = "",
        @SerializedName("Country")
        var country: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ISCliq")
        var iSCliq: Boolean = false,
        @SerializedName("Swift")
        var swift: String = "",
        @SerializedName("Trusted")
        var trusted: String = "",
        @SerializedName("Type")
        var type: String = ""
    )
}

