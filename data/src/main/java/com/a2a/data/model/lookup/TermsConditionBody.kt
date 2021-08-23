package com.a2a.data.model.lookup

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class TermsConditionBody(
    @SerializedName("TermsCondition")
    var termsCondition: List<TermsCondition> = listOf()
) : Parcelable
