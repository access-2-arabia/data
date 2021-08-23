package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.beneficiary.AddBeneficiaryPostData
import com.a2a.data.model.cliq.beneficiary.DeleteBeneficiaryPostData
import com.a2a.data.model.cliq.beneficiary.GetBeneficiaryPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject

class CilQBeneficiaryRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getBeneficiary(): Resource<T> {

        val getBeneficiaryPostData = GetBeneficiaryPostData()

        getBeneficiaryPostData.apply {
            stepNumber = "1"
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            beneficiary.apply {
                type = "2"
                iSCliq = true
            }
        }
        val postData = BaseRequestModel(
            A2ARequest(
                getBeneficiaryPostData,
                srvID = "MngBenf"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> addNewBeneficiary(newBeneficiary: AddBeneficiaryPostData.Beneficiary): Resource<T> {

        val addBeneficiaryPostData = AddBeneficiaryPostData()

        addBeneficiaryPostData.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            stepNumber = "2"
            beneficiary = newBeneficiary
        }
        val postData = BaseRequestModel(
            A2ARequest(
                addBeneficiaryPostData,
                srvID = "MngBenf"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> deleteBeneficiary(beneficiaryId: String): Resource<T> {

        val deleteBeneficiaryPostData = DeleteBeneficiaryPostData()

        deleteBeneficiaryPostData.apply {
            stepNumber = "4"
            beneficiary.type = "2"
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            beneficiary.iD = beneficiaryId
        }
        val postData = BaseRequestModel(
            A2ARequest(
                deleteBeneficiaryPostData,
                srvID = "MngBenf"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}