package com.a2a.data.model.cliq.beneficiary

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BeneficiaryIn(
    @SerializedName("ADesc")
    var aDesc: String = "",
    @SerializedName("Address")
    var address: String = "",
    @SerializedName("AdminFlag")
    var adminFlag: Boolean = false,
    @SerializedName("AliasType")
    var aliasType: String = "",
    @SerializedName("Attr")
    var attr: String = "",
    @SerializedName("BankCode")
    var bankCode: String = "",
    @SerializedName("BankName")
    var bankName: String = "",
    @SerializedName("Branch")
    var branch: String = "",
    @SerializedName("City")
    var city: String = "",
    @SerializedName("ClientAccNo")
    var clientAccNo: String = "",
    @SerializedName("ClientName")
    var clientName: String = "",
    @SerializedName("Country")
    var country: String = "",
    @SerializedName("CustID")
    var custID: Int = 0,
    @SerializedName("EDesc")
    var eDesc: String = "",
    @SerializedName("Enabled")
    var enabled: Boolean = false,
    @SerializedName("IBAN")
    var iBAN: String = "",
    @SerializedName("ID")
    var iD: Int = 0,
    @SerializedName("ISCliq")
    var iSCliq: Boolean = false,
    @SerializedName("RegionCode")
    var regionCode: String = "",
    @SerializedName("Swift")
    var swift: String = "",
    @SerializedName("TblCust")
    var tblCust: String = "",
    @SerializedName("Trusted")
    var trusted: Boolean = false
) : Parcelable {
    override fun toString(): String {
        return clientName
    }
}