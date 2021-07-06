package com.a2a.data.repository.lookup

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.lookup.LookupPostData2


import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class LookUpRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getLookUp(
        LookUpName: String,
        Test2 :String,
        Test3 :String,
        Test4:String,
        Test5:String,
    ): Resource<T>? {

        val body = LookupPostData2()
        body.apply {
                    lookUpName = LookUpName
                    locX = "31.9500"
                    locY = "35.9334"
                }
        val postData = A2ARequest(body,srvID = "RTGSTransferList,RTGSAccTypes,Currency,Banks",serviceIDValue = 0)




//        postData.apply {
//            a2ARequest?.apply {
//                header?.apply {
//                    bankCode = Constants.BankCode
//                    regionCode = Constants.RegionCode
//                    srvID = "GetLookUp"
//                    serviceID = 0
//                    methodName = ""
//                    userID = Constants.UserID
//                    password = Constants.Password
//                    channel = Constants.Channel
//                    timeStamp = Date().formatToViewTimeStamp()
//
//                    deviceID = Constants.DeviceID
//                }
//
//                a2ARequest?.body?.apply {
//                    lookUpName = LookUpName
//                    locX = "31.9500"
//                    locY = "35.9333"
//                }
//                a2ARequest?.footer?.apply {
//                    signature = ""
//                }
//            }
//        }
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }

    }

}