package com.a2a.data.model.cliq.beneficiary

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class DeleteBeneficiaryPostData(

    @SerializedName("Beneficiary")
    var beneficiary: Beneficiary = Beneficiary(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: String = ""
) {
    data class Beneficiary(
        @SerializedName("ID")
        var iD: String = "",
        @SerializedName("Type")
        var type: String = ""
    )

}
