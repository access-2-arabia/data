package com.a2a.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CustProfileModel(
    @SerializedName("AName")
    var aName: String = "",
    @SerializedName("ANameShort")
    var aNameShort: String = "",
    @SerializedName("Address1")
    var address1: String = "",
    @SerializedName("Address2")
    var address2: String = "",
    @SerializedName("AddressCity")
    var addressCity: String = "",
    @SerializedName("AddressCountry")
    var addressCountry: String = "",
    @SerializedName("BirthDate")
    var birthDate: String = "",
    @SerializedName("Branch")
    var branch: String = "",
    @SerializedName("BuildingNo")
    var buildingNo: String = "",
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
    @SerializedName("detPrivateNationality")
    var detPrivateNationality: String = "",
    @SerializedName("DocNo")
    var docNo: String = "",
    @SerializedName("DocNo1")
    var docNo1: String = "",
    @SerializedName("DocValidDate")
    var docValidDate: String = "",
    @SerializedName("EMail")
    var eMail: String = "",
    @SerializedName("EName")
    var eName: String = "",
    @SerializedName("ENameShort")
    var eNameShort: String = "",
    @SerializedName("Gender")
    var gender: String = "",
    @SerializedName("ISOCode")
    var iSOCode: String = "",
    @SerializedName("ISOCode2")
    var iSOCode2: String = "",
    @SerializedName("LWPT")
    var lWPT: Boolean = false,
    @SerializedName("LWTD")
    var lWTD: Boolean = false,
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
    @SerializedName("placeOfBirth")
    var placeOfBirth: String = "",
    @SerializedName("RID")
    var rID: Int = 0,
    @SerializedName("RepID")
    var repID: Int = 0,
    @SerializedName("TermsAndCondition")
    var termsAndCondition: Int = 0,
    @SerializedName("CustStatus")
    var custStatus: Boolean = false
):Parcelable
