package com.a2a.data.model.transfermodel.betwenmyaccount

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class BetweenMyAccountModel(
    var fromAccountNumber: String = "",
    var toAccountNumber: String = "",
    var fromAccountType: String = "",
    var toAccountType: String = "",
    var fromAccountCurrency: String = "",
    var toAccountCurrency: String = "",
    var amount:String=""
) : Parcelable