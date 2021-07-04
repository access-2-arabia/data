package com.a2a.data.repository.beneficiary

import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.beneficiary.GetManageBeneficiariesPostData
import com.a2a.data.model.transfermodel.betwenmyaccount.ValidationBetweenMyAccountPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class BeneficiaryRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getBeneficiary(
        beneficiaryType: String
    ): Resource<T>? {
        val postData = GetManageBeneficiariesPostData()
        postData.apply {
            a2ARequest?.apply {
                header?.apply {
                    bankCode = Constants.BankCode
                    regionCode = Constants.RegionCode
                    srvID = "MngBenf"
                    serviceID = 0
                    methodName = ""
                    userID = Constants.UserID
                    password = Constants.Password
                    channel = Constants.Channel
                    timeStamp = Date().formatToViewTimeStamp()
                    deviceID = Constants.DeviceID
                }

                a2ARequest?.body?.apply {
                    custProfile.repID = "0"
                    custProfile.cID = MemoryCacheImpl.getCustProfile()!!.cID.toString()
                    custProfile.custID = MemoryCacheImpl.getCustProfile()!!.custID
                    custProfile.rID = "0"
                    beneficiary.type = beneficiaryType
                }
                a2ARequest?.footer?.apply {
                    signature = ""
                }
            }
        }
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }
    }


}