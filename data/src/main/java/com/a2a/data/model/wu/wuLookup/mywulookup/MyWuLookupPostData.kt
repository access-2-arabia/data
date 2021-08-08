package com.a2a.data.model.wu.wuLookup.mywulookup
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName


data class MyWuLookupPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CID")
        var cID: Int = 0,
        @SerializedName("card_lookup_search_type")
        var cardLookupSearchType: String = "",
        @SerializedName("CustStatus")
        var custStatus: Int = 0,
        @SerializedName("CustType")
        var custType: Int = 0,
        @SerializedName("DeviceId")
        var deviceId: String = "",
        @SerializedName("DeviceType")
        var deviceType: String = "",
        @SerializedName("IndFirstName")
        var indFirstName: String = "",
        @SerializedName("IndLastName")
        var indLastName: String = "",
        @SerializedName("IndMiddleName")
        var indMiddleName: String = "",
        @SerializedName("MobFlag")
        var mobFlag: Boolean = false,
        @SerializedName("MyWu_Number")
        var myWuNumber: String = "",
        @SerializedName("receiver_index_number")
        var receiverIndexNumber: String = "",
        @SerializedName("RepID")
        var repID: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0,
        @SerializedName("wu_card_lookup_context")
        var wuCardLookupContext: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
    )
}