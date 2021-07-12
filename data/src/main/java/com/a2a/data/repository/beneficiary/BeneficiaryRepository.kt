package com.a2a.data.repository.beneficiary

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.beneficiary.GetManageBeneficiariesPostData
import com.a2a.data.model.beneficiary.addupdatebeneficiarylocalbank.AddUpdateBeneficiaryLocalBankPostData
import com.a2a.data.model.beneficiary.addupdatebeneficiarylocalbank.AddUpdateBeneficiaryLocalBankPostData.Body.Beneficiary
import com.a2a.data.model.beneficiary.addupdatebeneficiarywithincab.AddUpdateBeneficiaryWithinCabPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject
import com.a2a.data.model.beneficiary.addupdatebeneficiarywithincab.AddUpdateBeneficiaryWithinCabPostData.Body.Beneficiary as BeneficiaryWithinCab

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


    suspend fun <T> addBeneficiaryLocalBank(
        addBeneficiaryLocalBankPostData: Beneficiary
    ): Resource<T>? {
        val addBeneficiariesLocalBank = AddUpdateBeneficiaryLocalBankPostData()
        addBeneficiariesLocalBank.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.stepNumber = 2
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

    suspend fun <T> addBeneficiaryWithInBank(
        addBeneficiaryWithinCabPostData: BeneficiaryWithinCab
    ): Resource<T>? {
        val addBeneficiariesWithinCab = AddUpdateBeneficiaryWithinCabPostData()
        addBeneficiariesWithinCab.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.stepNumber = 2
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


}