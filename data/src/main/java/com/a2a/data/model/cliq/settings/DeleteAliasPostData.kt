package com.a2a.data.model.cliq.settings

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class DeleteAliasPostData(

    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("RequestType")
    var requestType: String = "",
    @SerializedName("UType")
    var uType: String = "",
    @SerializedName("UValue")
    var uValue: String = "",
    @SerializedName("alias")
    var alias: ALo = ALo(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("RecordId")
    var recordId: String = ""
) {
    data class ALo(
        @SerializedName("RecordId")
        var recordId: String = ""
    )
}
