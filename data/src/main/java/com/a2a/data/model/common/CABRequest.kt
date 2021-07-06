package com.a2a.data.model.common

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class CABRequest(
    var a2ARequest: A2ARequest<*> = A2ARequest(null,srvID = "",serviceID = "")

) : Parcelable



