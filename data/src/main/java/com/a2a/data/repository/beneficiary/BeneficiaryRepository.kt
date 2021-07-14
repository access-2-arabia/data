package com.a2a.data.repository.beneficiary

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.beneficiary.GetManageBeneficiariesPostData
import com.a2a.data.model.beneficiary.addupdatebeneficiarylocalbank.AddUpdateBeneficiaryOtherBankPostData
import com.a2a.data.model.beneficiary.addupdatebeneficiarylocalbank.AddUpdateBeneficiaryOtherBankPostData.Body.Beneficiary
import com.a2a.data.model.beneficiary.addupdatebeneficiarywithincab.AddUpdateBeneficiaryWithinBankPostData
import com.a2a.data.model.beneficiary.deletebeneficiary.DeleteBeneficiaryPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject
import com.a2a.data.model.beneficiary.addupdatebeneficiarywithincab.AddUpdateBeneficiaryWithinBankPostData.Body.Beneficiary as BeneficiaryWithinBank
import com.a2a.data.model.beneficiary.deletebeneficiary.DeleteBeneficiaryPostData.Body.Beneficiary as DeleteBeneficary

class BeneficiaryRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getBeneficiary(
        beneficiaryType: String
    ): Resource<T>? {
        val getManageBeneficiaries = GetManageBeneficiariesPostData()
        getManageBeneficiaries.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.beneficiary.type = beneficiaryType
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    getManageBeneficiaries.body,
                    srvID = "MngBenf",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> updateAddBeneficiaryOtherBank(
        updateAddBeneficiaryLocalBankPostData: Beneficiary,
        stepNumber: Int
    ): Resource<T>? {
        val addBeneficiariesLocalBank = AddUpdateBeneficiaryOtherBankPostData()
        addBeneficiariesLocalBank.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.beneficiary = updateAddBeneficiaryLocalBankPostData
            body.stepNumber = stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    addBeneficiariesLocalBank.body,
                    srvID = "MngBenf",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> updateAddBeneficiaryWithInBank(
        updateAddBeneficiaryWithinBankPostData: BeneficiaryWithinBank,
        stepNumber: Int
    ): Resource<T>? {
        val addBeneficiariesWithinCab = AddUpdateBeneficiaryWithinBankPostData()
        addBeneficiariesWithinCab.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.beneficiary = updateAddBeneficiaryWithinBankPostData
            body.stepNumber = stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    addBeneficiariesWithinCab.body,
                    srvID = "MngBenf",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> deleteBeneficiary(
        deleteBeneficiaryPostData: DeleteBeneficary
    ): Resource<T>? {
        val deleteBeneficiary = DeleteBeneficiaryPostData()
        deleteBeneficiary.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.stepNumber = 4
            body.beneficiary.iD = deleteBeneficiaryPostData.iD
            body.beneficiary.type = deleteBeneficiaryPostData.type
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    deleteBeneficiary.body,
                    srvID = "MngBenf",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


}