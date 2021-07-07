package com.a2a.data.model.name

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NameModel(
    var benefName: String = "",
    var firstName: String = "",
    var secondName: String = "",
    var thirdName: String = "",
    var lastName: String = ""
) : Parcelable
