package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatCliqDate
import com.a2a.data.model.cliq.createProfile.AliasTypePostData
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.cliq.createProfile.CliQRegistrationPostData
import com.a2a.data.model.cliq.createProfile.FundsAccountPostData
import com.a2a.data.model.cliq.createProfile.ReactivateAccountPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import com.google.gson.Gson
import java.util.*
import javax.inject.Inject

class CliQRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getCustomer(): Resource<T> {

        val body = GetCustomerPostData()

        body.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            uValue = MemoryCacheImpl.getCustProfile()?.nationalityID ?: ""
            uType = "NID"
            requestType = "GetCust"

        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ICLIQ"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> reactivateAccount(): Resource<T> {

        val body = ReactivateAccountPostData()

        body.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            requestType = "CustActivate"
            recordId = AppCash.cliQRecordId.toString()
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ICLIQ"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getAliasTypes(): Resource<T> {

        val body = AliasTypePostData()

        body.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            lookUpName = "AliasType"
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "GetLookUp"
            )
        )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getFundsAccounts(): Resource<T> {

        val body = FundsAccountPostData()

        body.apply {
            srvID = "ICLIQPay"
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "AccBal"
            )
        )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> register(
        iban: String,
        aliasType: String,
        bic: String,
        value: String,
        isDefault: Boolean
    ): Resource<T> {

        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        val body = CliQRegistrationPostData()
        val custReg = CliQRegistrationPostData.CustReg()

        custReg.apply {
            custID = currentCustProfile.custID
            uType = "NID"
            uValue = currentCustProfile.docNo
            resident = true
            name = currentCustProfile.eName
            surname = currentCustProfile.eName
            nickName = currentCustProfile.custMnemonic
            gender = if (currentCustProfile.gender == "Male")
                "MALE"
            else
                "FEMA"

            birthDate = currentCustProfile.birthDate
            placeOfBirth = "JO"
            mobile = currentCustProfile.mobileNumber
            email = currentCustProfile.eMail
            addressCity = currentCustProfile.addressCity ?: ""
            addressCountry = currentCustProfile.addressCountry ?: ""
            addressSPR = currentCustProfile.address2
            address = currentCustProfile.address2
            docValidDate = currentCustProfile.docValidDate ?: ""
            detCustomerType = currentCustProfile.docNo
            detPrivateNationality = "JO"
            uValue = currentCustProfile.nationalityID
        }

        body.apply {

            this.custReg = custReg
            custProfile = currentCustProfile
            branchCode = currentCustProfile.branch

            account.apply {
                acciban = iban
                this.bic = bic
                openingDate = formatCliqDate(Date())
                closingDate = "2032-01-01"
                currency = "JOD"
                type = "DFLT"
                this.isDefault = isDefault
                custID = currentCustProfile.custID
            }

            alias.alias.apply {
                type = aliasType
                this.value = value.toUpperCase()
                startDate = formatCliqDate(Date())
                status = "active"
            }
            alias.cust.recordId = AppCash.cliQRecordId.toString()
        }


        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ICLIQReg"
            )
        )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }

    }

}

