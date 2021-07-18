package com.a2a.data.model.beneficiary.deletebeneficiary

import android.os.Parcelable
import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DeleteBeneficiaryPostData(
    @SerializedName("Body")
    var body: Body = Body()
):Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("Beneficiary")
        var beneficiary: Beneficiary = Beneficiary(),
        @SerializedName("CustProfile")
        var custProfile: CustProfileModel = CustProfileModel(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ):Parcelable {
        @Parcelize
        data class Beneficiary(
            @SerializedName("ID")
            var iD: String = "",
            @SerializedName("Type")
            var type: String = ""
        ):Parcelable
    }
}