package com.a2a.data.model

import com.google.gson.annotations.SerializedName


data class CustProfile(
    @SerializedName("AName")
    var aName: String?, // بلال محمد عقل
    @SerializedName("ANameShort")
    var aNameShort: String?, // بلال عقل
    @SerializedName("Address1")
    var address1: String?, //  Amman
    @SerializedName("Address2")
    var address2: String?, // 16
    @SerializedName("AddressCity")
    var addressCity: String?, // Jordan
    @SerializedName("AddressCountry")
    var addressCountry: String?,
    @SerializedName("BirthDate")
    var birthDate: String?, // 2020-01-26T14:41:10.383
    @SerializedName("Branch")
    var branch: String?, // JO0092000
    @SerializedName("BuildingNo")
    var buildingNo: String?, // 12
    @SerializedName("CID")
    var cID: Int?, // 3752
    @SerializedName("CustID")
    var custID: String?, // 90855415
    @SerializedName("CustImage")
    var custImage: String?,
    @SerializedName("CustMnemonic")
    var custMnemonic: String?, // 90855415
    @SerializedName("CustType")
    var custType: Int?, // 0
    @SerializedName("detPrivateNationality")
    var detPrivateNationality: String?,
    @SerializedName("DocNo")
    var docNo: String?, // 9132048
    @SerializedName("DocNo1")
    var docNo1: String?, // 9132048
    @SerializedName("DocValidDate")
    var docValidDate: String?, // 2020-01-26T14:41:10.383
    @SerializedName("EMail")
    var eMail: String?, // BELAL.MOHAMMAD@CAB.JO
    @SerializedName("EName")
    var eName: String?, // BELAL  MOHAMMED  AKEEL
    @SerializedName("ENameShort")
    var eNameShort: String?, // BELAL  AKEEL
    @SerializedName("Gender")
    var gender: String?, // MALE
    @SerializedName("ISOCode")
    var iSOCode: String?, // JOR
    @SerializedName("ISOCode2")
    var iSOCode2: String?,
    @SerializedName("LWPT")
    var lWPT: Boolean?, // false
    @SerializedName("LWTD")
    var lWTD: Boolean?, // false
    @SerializedName("Lang")
    var lang: String?, // EN
    @SerializedName("MobileNumber")
    var mobileNumber: String?, // 962772052460
    @SerializedName("MobileNumberMasked")
    var mobileNumberMasked: String?, // 96277xxxxx460
    @SerializedName("Nationality")
    var nationality: String?, // JOR
    @SerializedName("NationalityID")
    var nationalityID: String?, // 9132048
    @SerializedName("placeOfBirth")
    var placeOfBirth: String?,
    @SerializedName("RID")
    var rID: Int?, // 0
    @SerializedName("RepID")
    var repID: Any?, // null
    @SerializedName("TermsAndCondition")
    var termsAndCondition: Int? // 1
)
