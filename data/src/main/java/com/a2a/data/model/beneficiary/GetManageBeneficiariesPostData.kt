package com.a2a.data.model.beneficiary
import com.a2a.data.model.CustProfile
import com.google.gson.annotations.SerializedName


data class GetManageBeneficiariesPostData(
    @SerializedName("Body")
    var body: Body = Body(),
) {
        data class Body(
            @SerializedName("Beneficiary")
            var beneficiary: Beneficiary = Beneficiary(),
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile()
        ) {
            data class Beneficiary(
                @SerializedName("Type")
                var type: String = ""
            )
        }


}