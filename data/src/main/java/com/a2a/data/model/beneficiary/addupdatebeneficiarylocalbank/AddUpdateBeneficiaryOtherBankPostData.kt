package com.a2a.data.model.beneficiary.addupdatebeneficiarylocalbank
import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AddUpdateBeneficiaryOtherBankPostData(
    @SerializedName("Body")
    var body: Body = Body()
):Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("Beneficiary")
        var beneficiary: Beneficiary = Beneficiary(),
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ):Parcelable {
        @Parcelize
        data class Beneficiary(
            @SerializedName("ADesc")
            var aDesc: String = "",
            @SerializedName("BankName")
            var bankName: String = "",
            @SerializedName("BenType")
            var benType: String = "",
            @SerializedName("ClientAccNo")
            var clientAccNo: String = "",
            @SerializedName("ClientName")
            var clientName: String = "",
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
            @SerializedName("TName")
            var tName: String = "",
            @SerializedName("Type")
            var type: String = "",
            @SerializedName("ID")
            var id: String = "",
            @SerializedName("Trusted")
            var trusted: Boolean = true,
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("Swift")
            var swift: String = "",
        ):Parcelable


    }
}