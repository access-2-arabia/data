package com.a2a.data.repository.beneficiary

import com.a2a.data.constants.Constants
import com.a2a.data.datasource.MemoryCache
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.beneficiary.GetManageBeneficiariesPostData
import com.a2a.data.model.beneficiary.addbeneficiarylocalbank.AddBeneficiaryLocalBankPostData
import com.a2a.data.model.beneficiary.addbeneficiarylocalbank.AddBeneficiaryLocalBankPostData.Body.Beneficiary
import com.a2a.data.model.beneficiary.addbeneficiarywithincab.AddBeneficiaryWithinCabPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.transfermodel.betwenmyaccount.ValidationBetweenMyAccountPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject
import com.a2a.data.model.beneficiary.addbeneficiarywithincab.AddBeneficiaryWithinCabPostData.Body.Beneficiary as BeneficiaryWithinCab

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
        val addBeneficiariesLocalBank = AddBeneficiaryLocalBankPostData()
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
        val addBeneficiariesWithinCab = AddBeneficiaryWithinCabPostData()
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