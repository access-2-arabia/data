package com.a2a.data.repository.transfer

import androidx.annotation.StringDef


@StringDef(
    TransferType.betweenMyAccountEDesc,
    TransferType.betweenMyAccountADesc,
    TransferType.WithinCabEDesc,
    TransferType.WithinCabADesc

)

@Retention(AnnotationRetention.SOURCE)
annotation class TransferType() {
    companion object {
        const val betweenMyAccountEDesc = "Transfer Between My Account"
        const val betweenMyAccountADesc = "تحويل بين حساباتي"
        const val WithinCabEDesc = "Transfer Between My Account"
        const val WithinCabADesc = "Transfer Between Bank Account"
    }
}
