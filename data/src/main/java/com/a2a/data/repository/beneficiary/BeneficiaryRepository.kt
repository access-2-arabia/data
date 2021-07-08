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
            body.custProfile.repID = 0
            body.custProfile.cID = MemoryCacheImpl.getCustProfile()!!.cID
            body.custProfile.custID = MemoryCacheImpl.getCustProfile()!!.custID
            body.custProfile.rID = 0
            body.beneficiary.type = beneficiaryType
        }
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


}