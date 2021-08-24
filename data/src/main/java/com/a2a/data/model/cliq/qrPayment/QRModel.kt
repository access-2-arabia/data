package com.a2a.data.model.cliq.qrPayment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QRModel(
    var amount: String? = null,
    var loyality: String? = null,
    var name: String? = null,
    var merchentID: String? = null,
    var dateTime: String? = null,
    var date: String? = null,
    var time: String? = null,
    var curr: String? = null,
    var memberID: String? = null,
    var location: String? = null,
    var purpose: String? = null,
    var billnumber: String? = null,
    var mobileNo: String? = null,
    var storeLabel: String? = null,
    var refLable: String? = null,
    var customerLabel: String? = null,
    var termenailLabel: String? = null,
    var countryCode: String? = null,
    var merchentCity: String? = null,
    var mCC: String? = null,
    var fixed: String? = null,
    var bICCODE: String? = null,
    var merchendName: String? = null,
    var value: String? = null,
    var qRVOFC: String? = "",
    var percentage: String? = "",
    var qRVOFCPercentage: String? = ""
) : Parcelable