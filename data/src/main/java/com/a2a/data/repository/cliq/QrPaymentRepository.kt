package com.a2a.data.repository.cliq

import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.alias.Account
import com.a2a.data.model.cliq.qrPayment.QRModel
import com.a2a.data.model.cliq.sendMoney.CliQSendMoneyPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject

class QrPaymentRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> sendMoneyQR(
        lastStepNumber: Int,
        accountNumber: Account,
        qrModel: QRModel
    ): Resource<T> {

        val body = CliQSendMoneyPostData()

        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            qRLocation = qrModel.location ?: ""
            qRBillNumber = qrModel.billnumber ?: ""
            qRCodeRefID = qrModel.refLable ?: ""
            qRMerchantCity = qrModel.merchentCity ?: ""
            qRLoyaltyNumber = qrModel.loyality ?: ""
            qRMerchantID = qrModel.merchentID ?: ""
            qRStoreLabel = qrModel.storeLabel ?: ""
            QRAddLangTemp = qrModel.storeLabel ?: ""
            qRCustomerLabel = qrModel.customerLabel ?: ""
            qRValue = qrModel.value ?: ""
            qRDateandTime = qrModel.dateTime ?: ""
            qRMobileNumber = qrModel.mobileNo ?: ""
            qRCountryCode = qrModel.countryCode ?: ""
            qRTerminalLabel = qrModel.termenailLabel ?: ""
            qRValueofConvenience = ""
            qRVOFCFixed = qrModel.fixed ?: ""
            qRVOFC = qrModel.qRVOFC ?: ""
            qRVerificationCode = ""
            QRTaxId = ""

            cdtrName = qrModel.name ?: ""
            cdtrAlias = ""
            cdtrValue = ""
            cdtrBic = qrModel.bICCODE ?: ""
            cdtrAcct = ""
            cdtrPstlAdr = qrModel.merchentCity ?: ""
            ctgyPurp = "21120"
            amt = qrModel.amount ?: ""
            amount = qrModel.amount ?: ""
            cdtrRecordID = ""
            dbtrRecordID = AppCash.cliQRecordId ?: ""
            dbtrAcct = accountNumber.accountNumber
            qRFlag = "true"
            curr = "JOD"
            stepNumber = lastStepNumber
            dbtrName = MemoryCacheImpl.getCustProfile()?.eName ?: ""
            fees = 0
            dbtrPstlAdr = MemoryCacheImpl.getCustProfile()?.address1 ?: ""
            currFrom = "JOD"
            dbtrIsIndvl = "true"
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            currCodeTo = "JOD"
            cdtrMCC = qrModel.mCC ?: ""

            custProfile = currentCustProfile
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ICLIQPay"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}

