package com.a2a.data.model.beneficiary.addupdatebeneficiarywu

import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName


data class AddUpdateBeneficiaryWUPostData(
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
            @SerializedName("BCountry")
            var bCountry: String = "",
            @SerializedName("Email")
            var email: String = "",
            @SerializedName("FName")
            var fName: String = "",
            @SerializedName("LName")
            var lName: String = "",
            @SerializedName("Nationality")
            var nationality: String = "",
            @SerializedName("PhoneNumber")
            var phoneNumber: String = "",
            @SerializedName("MName")
            var mName: String = "",
            @SerializedName("TName")
            var tName: String = "",
            @SerializedName("Type")
            var type: String = "",
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("ID")
            var ID: String = ""
            )
    }
}