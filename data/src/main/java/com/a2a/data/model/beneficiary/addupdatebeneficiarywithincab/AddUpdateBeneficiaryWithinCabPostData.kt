package com.a2a.data.model.beneficiary.addupdatebeneficiarywithincab

import com.a2a.data.model.CustProfile
import com.google.gson.annotations.SerializedName


data class AddUpdateBeneficiaryWithinCabPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("Beneficiary")
        var beneficiary: Beneficiary = Beneficiary(),
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ) {
        data class Beneficiary(
            @SerializedName("ADesc")
            var aDesc: String = "",
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("Branch")
            var branch: String = "",
            @SerializedName("Currency")
            var currency: String = "",
            @SerializedName("EDesc")
            var eDesc: String = "",
            @SerializedName("Trusted")
            var trusted: String = "",
            @SerializedName("Type")
            var type: String = ""
        )


    }
}