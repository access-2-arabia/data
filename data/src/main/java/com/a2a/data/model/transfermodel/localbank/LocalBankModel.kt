package com.a2a.data.model.transfermodel.localbank

import android.os.Parcelable
import com.a2a.data.model.name.NameModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LocalBankModel(
    var accountNumberFromValue: String = "",
    var accountNumberToValue: String = "",
    var currFrom: String = "",
    var currTo: String = "",
    var amountValue: String = "",
    var chargesForType: String = "",
    var benefAccountIban: String = "",
    var transReasonCode: String = "",
    var nameModel: NameModel = NameModel()
):Parcelable



