package com.a2a.data.repository.wu

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.AccountListResponse
import com.a2a.data.model.accountlist.AccountListResponse.A2AResponse.Body.Account
import com.a2a.data.model.beneficiary.GetManageBeneficiariesPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.common.Header
import com.a2a.data.model.wu.feeinquire.FeeInquirePostData
import com.a2a.data.model.wu.feeinquire.FeeInquireResponse
import com.a2a.data.model.wu.sendmoney.SendMoneyValidationPostData
import com.a2a.data.model.wu.wuLookup.buildingnumber.UpdateBuildingNumberPostData
import com.a2a.data.model.wu.wuLookup.country.CountryPostData
import com.a2a.data.model.wu.wuLookup.currency.CurrencyPostData
import com.a2a.data.model.wu.wuLookup.deliveryservices.DeliveryServicesPostData
import com.a2a.data.model.wu.wuLookup.mexicocity.MexicoCityPostData
import com.a2a.data.model.wu.wuLookup.mexicostate.MexicoStatePostData
import com.a2a.data.model.wu.wuLookup.mywulookup.MyWuLookupPostData
import com.a2a.data.model.wu.wuLookup.purposetransaction.PurposeTransactionPostData
import com.a2a.data.model.wu.wuLookup.usstate.UsStatePostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class WuRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getWuCountries(
    ): Resource<T>? {
        val countryPostData = CountryPostData()
        countryPostData.apply {
            body.lookUpName = "DestinationCountries"
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.deviceType = "Online"
            body.deviceId = "Online"
            body.queryfilter1 = "en"
            body.queryfilter2 = "JO JOD"
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    countryPostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getWuCurrency(
        countryIsoCode: String
    ): Resource<T>? {
        val currencyPostData = CurrencyPostData()
        currencyPostData.apply {
            body.lookUpName = "CountriesCurrencies"
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.deviceType = "Online"
            body.deviceId = "Online"
            body.queryfilter1 = "en"
            body.queryfilter2 = "JO JOD"
            body.queryfilter3 = countryIsoCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    currencyPostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getMexicoState(

    ): Resource<T>? {
        val mexicoStatePostData = MexicoStatePostData()
        mexicoStatePostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.deviceType = "Online"
            body.deviceType = "Online"
            body.queryfilter1 = "en"
            body.lookUpName = "MexicoState"
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    mexicoStatePostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getMexicoCity(
        stateValue: String
    ): Resource<T>? {
        val mexicoCityPostData = MexicoCityPostData()
        mexicoCityPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.state = stateValue
            body.deviceType = "Online"
            body.deviceType = "Online"
            body.queryfilter1 = "en"
            body.lookUpName = "MexicoCity"
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    mexicoCityPostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getUsState(): Resource<T>? {
        val usStatePostData = UsStatePostData()
        usStatePostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.deviceType = "Online"
            body.deviceType = "Online"
            body.queryfilter1 = "en"
            body.queryfilter2 = "US"
            body.lookUpName = "StateList"
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    usStatePostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getMyWuLookup(myWuNumberValue: String): Resource<T>? {
        val myWuLookupPostData = MyWuLookupPostData()
        myWuLookupPostData.apply {
            body.stepNumber = 2
            body.myWuNumber = myWuNumberValue
            body.receiverIndexNumber = "000"
            body.wuCardLookupContext = ""
            body.cardLookupSearchType = "S"
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    myWuLookupPostData.body,
                    srvID = "WUSend",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getFeeInquire(
        feeInquire: FeeInquirePostData,
        account: Account,
        principalAmountValue: String,
        expectedPayoutAmountValue: String
    ): Resource<T>? {
        val feeInquirePostData = FeeInquirePostData()
        feeInquirePostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.regionCode = "02"
            body.accountNumber = account.accountNumber
            body.custStatus = true.toString()
            body.mobFlag = false
            body.deviceId = "Online"
            body.deviceType = "Mobile"
            body.orgcountryIsoCode = "JO"
            body.orgcurrencyIsoCode = "JOD"
            body.principalAmount = principalAmountValue
            body.expectedPayoutAmount = expectedPayoutAmountValue
            body.dstcurrencyIsoCode = feeInquire.body.dstcurrencyIsoCode
            body.dstcountryIsoCode = feeInquire.body.dstcountryIsoCode
            body.transactionType = feeInquire.body.transactionType
            if (!body.prmCode.isNullOrEmpty()) {
                body.prmCode = feeInquire.body.prmCode
            }
            if (!feeInquire.body.myWuNumber.isNullOrEmpty()) {
                body.myWuNumber = feeInquire.body.myWuNumber
            }
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    feeInquirePostData.body,
                    srvID = "WUFeeInq",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getBuildingNumber(): Resource<T>? {
        val updateBuildingNumberPostData = UpdateBuildingNumberPostData()
        updateBuildingNumberPostData.apply {
            body.stepNumber = 3
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    updateBuildingNumberPostData.body,
                    srvID = "WUSend",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> getPurposeTransaction(): Resource<T>? {
        val purposeTransactionPostData = PurposeTransactionPostData()
        purposeTransactionPostData.apply {
            body.lookUpName = "PurposeTransactions"
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.deviceId = "Online"
            body.deviceType = "Online"
            body.queryfilter1 = "en"
            body.queryfilter2 = "JO JOD"
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    purposeTransactionPostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getWuDeliveryServices(
        queryfilter3Value: String,
        queryfilter4Value: String
    ): Resource<T>? {
        val deliveryServicesPostData = DeliveryServicesPostData()
        deliveryServicesPostData.apply {
            body.lookUpName = "DeliveryServices"
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.deviceId = "Online"
            body.deviceType = "Online"
            body.queryfilter1 = "en"
            body.queryfilter2 = "JO JOD"
            if (!queryfilter3Value.isNullOrEmpty()) {
                body.queryfilter3 = queryfilter3Value
            }
            if (!queryfilter4Value.isNullOrEmpty()) {
                body.queryfilter4 = queryfilter4Value
            }
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    deliveryServicesPostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> sendMoneyValidation(
        sendMoneyValidationValue: SendMoneyValidationPostData
    ): Resource<T>? {
        val sendMoneyValidationPostData = SendMoneyValidationPostData()
        sendMoneyValidationPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.address = sendMoneyValidationValue.body.address
            body.bankAccount = sendMoneyValidationValue.body.bankAccount
            body.destination = sendMoneyValidationValue.body.destination
            body.origination = sendMoneyValidationValue.body.origination
            body.receiver = sendMoneyValidationValue.body.receiver
            body.externalReferenceNo = sendMoneyValidationValue.body.externalReferenceNo
            body.transactionType = sendMoneyValidationValue.body.transactionType
            body.transactionReason = sendMoneyValidationValue.body.transactionReason
            body.myWuNumber = sendMoneyValidationValue.body.myWuNumber
            body.name = sendMoneyValidationValue.body.name
            body.code = sendMoneyValidationValue.body.code
            body.personalMsg = sendMoneyValidationValue.body.personalMsg
            body.deviceType = sendMoneyValidationValue.body.deviceType
            body.deviceId = sendMoneyValidationValue.body.deviceId

            val postData =
                BaseRequestModel(
                    A2ARequest(
                        sendMoneyValidationPostData.body,
                        srvID = "WUSend",
                        serviceIDValue = 0
                    )
                )
            return safeApiCall(postData)
            {
                remoteDataSource.baseRequest(postData)
            }
        }

    }


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
}