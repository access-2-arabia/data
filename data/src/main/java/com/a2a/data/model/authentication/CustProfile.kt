package com.a2a.data.model.authentication

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CustProfile(
    @SerializedName("AName")
    var aName: String = "",
    @SerializedName("ANameShort")
    var aNameShort: String = "",
    @SerializedName("Address1")
    var address1: String = "",
    @SerializedName("Address2")
    var address2: String = "",
    @SerializedName("BirthDate")
    var birthDate: String = "",
    @SerializedName("Branch")
    var branch: String = "",
    @SerializedName("CID")
    var cID: Int = 0,
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("CustImage")
    var custImage: String = "",
    @SerializedName("CustMnemonic")
    var custMnemonic: String = "",
    @SerializedName("CustType")
    var custType: Int = 0,
    @SerializedName("DocNo")
    var docNo: String = "",
    @SerializedName("DocNo1")
    var docNo1: String = "",
    @SerializedName("EMail")
    var eMail: String = "",
    @SerializedName("EName")
    var eName: String = "",
    @SerializedName("ENameShort")
    var eNameShort: String = "",
    @SerializedName("ISOCode")
    var iSOCode: String = "",
    @SerializedName("ISOCode2")
    var iSOCode2: String = "",
    @SerializedName("Lang")
    var lang: String = "",
    @SerializedName("MobileNumber")
    var mobileNumber: String = "",
    @SerializedName("MobileNumberMasked")
    var mobileNumberMasked: String = "",
    @SerializedName("Nationality")
    var nationality: String = "",
    @SerializedName("NationalityID")
    var nationalityID: String = "",
    @SerializedName("RID")
    var rID: Int = 0,
    @SerializedName("RepID")
    var repID: String = "",
    @SerializedName("TermsAndCondition")
    var termsAndCondition: String = ""
) : Parcelable