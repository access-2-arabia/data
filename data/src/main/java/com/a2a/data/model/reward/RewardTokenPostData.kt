package com.a2a.data.model.reward


import MemoryCacheImpl
import com.google.gson.annotations.SerializedName

data class RewardTokenPostData(
    @SerializedName("AFName")
    var aFName: String = MemoryCacheImpl.getCustProfile()?.aFName ?: "",
    @SerializedName("ALName")
    var aLName: String = MemoryCacheImpl.getCustProfile()?.aLName ?: "",
    @SerializedName("AMName")
    var aMName: String = MemoryCacheImpl.getCustProfile()?.aMName ?: "",
    @SerializedName("AName")
    var aName: String = MemoryCacheImpl.getCustProfile()?.aName ?: "",
    @SerializedName("ANameShort")
    var aNameShort: String = MemoryCacheImpl.getCustProfile()?.aNameShort ?: "",
    @SerializedName("Address1")
    var address1: String = MemoryCacheImpl.getCustProfile()?.address1 ?: "",
    @SerializedName("Address2")
    var address2: String = MemoryCacheImpl.getCustProfile()?.address2 ?: "",
    @SerializedName("AddressCity")
    var addressCity: String = MemoryCacheImpl.getCustProfile()?.addressCity ?: "",
    @SerializedName("AddressCountry")
    var addressCountry: String = MemoryCacheImpl.getCustProfile()?.addressCountry ?: "",
    @SerializedName("BirthDate")
    var birthDate: String = MemoryCacheImpl.getCustProfile()?.birthDate ?: "",
    @SerializedName("Branch")
    var branch: String = MemoryCacheImpl.getCustProfile()?.branch ?: "",
    @SerializedName("CID")
    var cID: Int = MemoryCacheImpl.getCustProfile()?.cID ?: 0,
    @SerializedName("CustID")
    var custID: String = MemoryCacheImpl.getCustProfile()?.custID ?: "",
    @SerializedName("CustMnemonic")
    var custMnemonic: String = MemoryCacheImpl.getCustProfile()?.custMnemonic ?: "",
    @SerializedName("CustStatus")
    var custStatus: String = MemoryCacheImpl.getCustProfile()?.custStatus ?: "",
    @SerializedName("CustType")
    var custType: Int = MemoryCacheImpl.getCustProfile()?.custType ?: 0,
    @SerializedName("DocDesc")
    var docDesc: String = MemoryCacheImpl.getCustProfile()?.docDesc ?: "",
    @SerializedName("DocNo")
    var docNo: String = MemoryCacheImpl.getCustProfile()?.docNo ?: "",
    @SerializedName("DocNo1")
    var docNo1: String = MemoryCacheImpl.getCustProfile()?.docNo1 ?: "",
    @SerializedName("DocValidDate")
    var docValidDate: String = MemoryCacheImpl.getCustProfile()?.docValidDate ?: "",
    @SerializedName("EFName")
    var eFName: String = MemoryCacheImpl.getCustProfile()?.eFName ?: "",
    @SerializedName("ELName")
    var eLName: String = MemoryCacheImpl.getCustProfile()?.eLName ?: "",
    @SerializedName("EMName")
    var eMName: String = MemoryCacheImpl.getCustProfile()?.eMName ?: "",
    @SerializedName("EMail")
    var eMail: String = MemoryCacheImpl.getCustProfile()?.eMail ?: "",
    @SerializedName("EName")
    var eName: String = MemoryCacheImpl.getCustProfile()?.eName ?: "",
    @SerializedName("ENameShort")
    var eNameShort: String = MemoryCacheImpl.getCustProfile()?.eNameShort ?: "",
    @SerializedName("Gender")
    var gender: String = MemoryCacheImpl.getCustProfile()?.gender ?: "",
    @SerializedName("ISOCode")
    var iSOCode: String = MemoryCacheImpl.getCustProfile()?.iSOCode ?: "",
    @SerializedName("ISOCode2")
    var iSOCode2: String = MemoryCacheImpl.getCustProfile()?.iSOCode2 ?: "",
    @SerializedName("LWPT")
    var lWPT: Boolean = MemoryCacheImpl.getCustProfile()?.lWPT ?: false,
    @SerializedName("LWTD")
    var lWTD: Boolean = MemoryCacheImpl.getCustProfile()?.lWTD ?: false,
    @SerializedName("Lang")
    var lang: String = MemoryCacheImpl.getCustProfile()?.lang ?: "",
    @SerializedName("MaritalStatus")
    var maritalStatus: String = MemoryCacheImpl.getCustProfile()?.maritalStatus ?: "",
    @SerializedName("MobileNumber")
    var mobileNumber: String = MemoryCacheImpl.getCustProfile()?.mobileNumber ?: "",
    @SerializedName("MobileNumberMasked")
    var mobileNumberMasked: String = MemoryCacheImpl.getCustProfile()?.mobileNumberMasked ?: "",
    @SerializedName("Nationality")
    var nationality: String = MemoryCacheImpl.getCustProfile()?.nationality ?: "",
    @SerializedName("NationalityID")
    var nationalityID: String = MemoryCacheImpl.getCustProfile()?.nationalityID ?: "",
    @SerializedName("placeOfBirth")
    var placeOfBirth: String = MemoryCacheImpl.getCustProfile()?.placeOfBirth ?: "",
    @SerializedName("RID")
    var rID: Int = MemoryCacheImpl.getCustProfile()?.rID ?: 0,
    @SerializedName("RepID")
    var repID: String = MemoryCacheImpl.getCustProfile()?.repID ?: "",
    @SerializedName("StreetAddress")
    var streetAddress: String = MemoryCacheImpl.getCustProfile()?.streetAddress ?: "",
    @SerializedName("TermsAndCondition")
    var termsAndCondition: Int = MemoryCacheImpl.getCustProfile()?.termsAndCondition ?: 0,
)

