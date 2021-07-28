package com.a2a.data.model.wu.sendmoney

import android.os.Parcelable
import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

 
data class SendMoneyValidationPostData(
    @SerializedName("Body")
    var body: Body = Body()
)   {
     
    data class Body(
        @SerializedName("Address")
        var address: Address = Address(),
        @SerializedName("BankAccount")
        var bankAccount: BankAccount = BankAccount(),
        @SerializedName("code")
        var code: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfileModel = CustProfileModel(),
        @SerializedName("Destination")
        var destination: Destination = Destination(),
        @SerializedName("DeviceId")
        var deviceId: String = "",
        @SerializedName("DeviceType")
        var deviceType: String = "",
        @SerializedName("external_reference_no")
        var externalReferenceNo: String = "",
        @SerializedName("MyWu_Number")
        var myWuNumber: String = "",
        @SerializedName("name")
        var name: String = "",
        @SerializedName("Origination")
        var origination: Origination = Origination(),
        @SerializedName("PersonalMsg")
        var personalMsg: String = "",
        @SerializedName("Receiver")
        var `receiver`: Receiver = Receiver(),
        @SerializedName("transaction_reason")
        var transactionReason: String = "",
        @SerializedName("transaction_type")
        var transactionType: String = ""
    )   {
         
        data class Address(
            @SerializedName("addr_line1")
            var addrLine1: String = "",
            @SerializedName("addr_line2")
            var addrLine2: String = "",
            @SerializedName("country_code_name")
            var countryCodeName: String = "",
            @SerializedName("country_iso_code")
            var countryIsoCode: String = ""
        )  

         
        data class BankAccount(
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("AccountType")
            var accountType: String = "",
            @SerializedName("BankName")
            var bankName: String = "",
            @SerializedName("BranchCode")
            var branchCode: String = ""
        )  

         
        data class Destination(
            @SerializedName("Dstcountry_iso_code")
            var dstcountryIsoCode: String = "",
            @SerializedName("Dstcurrency_iso_code")
            var dstcurrencyIsoCode: String = "",
            @SerializedName("expected_payout_amount")
            var expectedPayoutAmount: String = ""
        )  

         
        data class Origination(
            @SerializedName("gross_amount")
            var grossAmount: String = "",
            @SerializedName("principal_amount")
            var principalAmount: String = ""
        )  

         
        data class Receiver(
            @SerializedName("answer")
            var answer: String = "",
            @SerializedName("MobileNumber")
            var mobileNumber: String = "",
            @SerializedName("PhoneCountryCode")
            var phoneCountryCode: String = "",
            @SerializedName("PrmCode")
            var prmCode: String = "",
            @SerializedName("question")
            var question: String = "",
            @SerializedName("RFirstName")
            var rFirstName: String = "",
            @SerializedName("RLastName")
            var rLastName: String = "",
            @SerializedName("RMiddleName")
            var rMiddleName: String = "",
            @SerializedName("RVCountry_iso_code")
            var rVCountryIsoCode: String = "",
            @SerializedName("RVaddr_line1")
            var rVaddrLine1: String = "",
            @SerializedName("RVcountry_name")
            var rVcountryName: String = ""
        )  
    }
}