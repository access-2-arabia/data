package com.a2a.data.model.cliq.qrPayment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QRCodeModel(
    var additionalData: AdditionalData? = AdditionalData(),
    var merchantAccountInformation: MerchantAccountInformation = MerchantAccountInformation(),
    var merchantCategoryCode: String = "",
    var transactionCurrency: String = "",
    var transactionAmount: String = "",
    var tip: String = "",
    var valueOfConvenienceFixe: String = "",
    var valueOfPercentageConvenience: String = "",
    var countryCode: String = "",
    var merchantName: String = "",
    var merchantCity: String = "",
    var postalAddress: String = "",
    var additionalLanguage: String = "",
    var location: Location = Location(),
    var dateAndTime: DateAndTime = DateAndTime(),
    var verificationCode: VerificationCode = VerificationCode(),
    var isOptionalTip: Boolean? = false,
    var isFixedTip: Boolean? = false,
    var isPercentageTip: Boolean? = false,
    var haveTip: Boolean? = false,
    var cyclingRedundancyCheck: String? = "",
    var qrVOFCFixed: String? = "",
    var qrVOFC: String? = null,
    var qrValue: String? = "",
    var CdtrMCC: String? =  ""

) : Parcelable {
    @Parcelize
    data class Location(
        var GUID: String = "",
        var location: String = ""
    ) : Parcelable

    @Parcelize
    data class DateAndTime(
        var GUID: String = "",
        var date: String = ""
    ) : Parcelable

    @Parcelize
    data class VerificationCode(
        var pinOrOtp: String = ""
    ) : Parcelable
}