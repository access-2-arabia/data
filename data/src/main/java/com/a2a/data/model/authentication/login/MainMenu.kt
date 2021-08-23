package com.a2a.data.model.authentication.login

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MainMenu(
    @SerializedName("AGroupDesc")
    var aGroupDesc: String = "",
    @SerializedName("ATitle")
    var aTitle: String = "",
    @SerializedName("EGroupDesc")
    var eGroupDesc: String = "",
    @SerializedName("ETitle")
    var eTitle: String = "",
    @SerializedName("GroupADesc")
    var groupADesc: String = "",
    @SerializedName("GroupEDesc")
    var groupEDesc: String = "",
    @SerializedName("GroupID")
    var groupID: Int = 0,
    @SerializedName("ID")
    var iD: Int = 0,
    @SerializedName("Icon")
    var icon: String = "",
    @SerializedName("MenuFlag")
    var menuFlag: Boolean = false,
    @SerializedName("SubMenu")
    var subMenu: List<SubMenu> = listOf()
) : Parcelable {
    @Parcelize
    data class SubMenu(
        @SerializedName("AGroupDesc")
        var aGroupDesc: String = "",
        @SerializedName("ATitle")
        var aTitle: String = "",
        @SerializedName("EGroupDesc")
        var eGroupDesc: String = "",
        @SerializedName("ETitle")
        var eTitle: String = "",
        @SerializedName("Enabled")
        var enabled: Boolean = false,
        @SerializedName("GroupADesc")
        var groupADesc: String = "",
        @SerializedName("GroupEDesc")
        var groupEDesc: String = "",
        @SerializedName("GroupID")
        var groupID: Int = 0,
        @SerializedName("ID")
        var iD: Int = 0,
        @SerializedName("Icon")
        var icon: String = "",
        @SerializedName("MenuFlag")
        var menuFlag: Boolean = false,
        @SerializedName("SortIndex")
        var sortIndex: Int = 0,
        @SerializedName("URL")
        var uRL: String = ""
    ) : Parcelable
}