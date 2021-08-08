package com.a2a.data.model.beneficiary.addupdatebeneficiarywithincab

import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AddUpdateBeneficiaryWithinBankPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("Beneficiary")
        var beneficiary: Beneficiary = Beneficiary(),
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ) : Parcelable {
        @Parcelize
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
            var type: String = "",
            @SerializedName("ID")
            var id: String = ""
        ) : Parcelable
    }
}