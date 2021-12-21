package com.a2a.data.model.dammanpay

import android.os.Parcelable
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.wu.wuLookup.country.CountryPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import javax.inject.Inject

@Parcelize
data class InquireResponse(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("StepNumber")
        var stepNumber: Int = 0,
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("PAY_NO")
        var payNo: String = "",
        @SerializedName("serviceType")
        var serviceType: Int = 0
    ) : Parcelable
}
