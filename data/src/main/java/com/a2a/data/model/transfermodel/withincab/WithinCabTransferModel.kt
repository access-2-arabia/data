package com.a2a.data.model.transfermodel.withincab

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class WithinCabTransferModel(
    var fromAccountNumber: String = "",
    var fromAccountType: String = "",
    var fromCurrency: String = "",
    var toBeneficiaryAccount: String = "",
    var toBeneficiaryCurrency: String = "",
    var toBeneficiaryType: String = "",
    var amount: String = "",
    var beneficiaryName: String = "",
    var accountBranch: String? = null
) : Parcelable