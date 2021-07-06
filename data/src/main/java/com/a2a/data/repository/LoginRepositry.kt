package com.a2a.data.repository

import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.login.LoginPostData
import com.a2a.data.model.lookup.LookupPostData2
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class LoginRepositry @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> doLogin(Mpassword: String, MCustMnemonic: String): Resource<T>? {
        val loginPostData = LoginPostData()
        loginPostData.apply {
            body.custProfile.custMnemonic = MCustMnemonic ?: ""
            body.custProfile.pWD = Mpassword ?: ""
        }
        val postData =
            BaseRequestModel(A2ARequest(loginPostData.body, srvID = "Login", serviceIDValue = 3287))


//        val postData = LoginPostData()
//        postData.apply {
//            a2ARequest?.apply {
//                header?.apply {
//                    bankCode = Constants.BankCode
//                    regionCode = Constants.RegionCode
//                    srvID = "Login"
//                    serviceID = 3287
//                    methodName = ""
//                    userID = Constants.UserID
//                    password = Constants.Password
//                    channel = Constants.Channel
//                    timeStamp = Date().formatToViewTimeStamp()
//                    guidID = Constants.GuidID
//                    deviceID = Constants.DeviceID
//                }
//
//                a2ARequest.body.apply {
//                    custProfile.custMnemonic = MCustMnemonic ?: ""
//                    custProfile.pWD = Mpassword ?: ""
//                }
//                a2ARequest?.footer?.apply {
//                    signature = ""
//                }
//            }
//        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }

}