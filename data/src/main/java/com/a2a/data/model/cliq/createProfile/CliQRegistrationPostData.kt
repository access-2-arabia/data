package com.a2a.data.model.cliq.createProfile


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class CliQRegistrationPostData(
    @SerializedName("Account")
    var account: Account = Account(),
    @SerializedName("Alias")
    var alias: Alias = Alias(),
    @SerializedName("CustReg")
    var custReg: CustReg = CustReg(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
) {
    data class Account(
        @SerializedName("Acciban")
        var acciban: String = "",
        @SerializedName("bic")
        var bic: String = "",
        @SerializedName("closingDate")
        var closingDate: String = "",
        @SerializedName("currency")
        var currency: String = "",
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("openingDate")
        var openingDate: String = "",
        @SerializedName("RecordId")
        var recordId: String = "",
        @SerializedName("type")
        var type: String = "",
        @SerializedName("IsDefault")
        var isDefault: Boolean = true
    )

    data class Alias(
        @SerializedName("alias")
        var alias: Alias = Alias(),
        @SerializedName("Cust")
        var cust: Cust = Cust()
    ) {
        data class Alias(
            @SerializedName("startDate")
            var startDate: String = "",
            @SerializedName("status")
            var status: String = "",
            @SerializedName("type")
            var type: String = "",
            @SerializedName("value")
            var value: String = ""
        )

        data class Cust(
            @SerializedName("RecordId")
            var recordId: String = ""
        )
    }

    data class CustReg(
        @SerializedName("Address")
        var address: String = "",
        @SerializedName("AddressCity")
        var addressCity: String = "",
        @SerializedName("AddressCountry")
        var addressCountry: String = "",
        @SerializedName("AddressSPR")
        var addressSPR: String = "",
        @SerializedName("BirthDate")
        var birthDate: String = "",
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("detCustomerType")
        var detCustomerType: String = "",
        @SerializedName("detPrivateNationality")
        var detPrivateNationality: String = "",
        @SerializedName("DocValidDate")
        var docValidDate: String = "",
        @SerializedName("Email")
        var email: String = "",
        @SerializedName("Gender")
        var gender: String = "",
        @SerializedName("Mobile")
        var mobile: String = "",
        @SerializedName("Name")
        var name: String = "",
        @SerializedName("NickName")
        var nickName: String = "",
        @SerializedName("placeOfBirth")
        var placeOfBirth: String = "",
        @SerializedName("Resident")
        var resident: Boolean = false,
        @SerializedName("Surname")
        var surname: String = "",
        @SerializedName("UType")
        var uType: String = "",
        @SerializedName("UValue")
        var uValue: String = ""
    )
}
