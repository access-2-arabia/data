package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
class A2ARequest<T  >(
    @SerializedName("Body")
    var body: T? = null,
    @SerializedName("Footer")
    var footer: Footer = Footer(),
    var srvID:String ="",
    var serviceID:String ="",
    @SerializedName("Footer")
    var hedar: Header = Header(srvID =srvID ,serviceID = serviceID),
):Parcelable