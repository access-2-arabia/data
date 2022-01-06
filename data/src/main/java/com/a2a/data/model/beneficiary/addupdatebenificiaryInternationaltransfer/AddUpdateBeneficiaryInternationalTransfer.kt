package com.a2a.data.model.beneficiary.addupdatebenificiaryInternationaltransfer
import android.os.Parcelable

import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class AddUpdateBeneficiaryInternationalTransfer(
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
            @SerializedName("BankName")
            var bankName: String = "",
            @SerializedName("BenType")
            var benType: String = "",
            @SerializedName("ClientName")
            var clientName: String = "",
            @SerializedName("Country")
            var country: String = "",
            @SerializedName("EDesc")
            var eDesc: String = "",
            @SerializedName("FName")
            var fName: String = "",
            @SerializedName("IBAN")
            var iBAN: String = "",
            @SerializedName("LName")
            var lName: String = "",
            @SerializedName("SName")
            var sName: String = "",
            @SerializedName("Swift")
            var swift: Swift = Swift(),
            @SerializedName("TName")
            var tName: String = "",
            @SerializedName("Type")
            var type: String = ""
        ) : Parcelable {
            @Parcelize
            data class Swift(
                @SerializedName("Beneficiary")
                var beneficiary: String = "",
                @SerializedName("Intermediary")
                var intermediary: String = ""
            ) : Parcelable
        }

        @Parcelize
        data class CustProfile(
            @SerializedName("CID")
            var cID: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("RepID")
            var repID: String = ""
        ) : Parcelable
    }
}