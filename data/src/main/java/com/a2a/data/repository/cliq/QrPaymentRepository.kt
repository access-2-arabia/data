package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.alias.Account
import com.a2a.data.model.cliq.qrPayment.QRCodeModel
import com.a2a.data.model.cliq.sendMoney.CliQSendMoneyPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class QrPaymentRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> sendMoneyQR(
        lastStepNumber: Int,
        accountNumber: Account,
        qrModel: QRCodeModel
    ): Resource<T> {
        val body = CliQSendMoneyPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            qRLocation = qrModel.location.toString()
            qRBillNumber = qrModel.additionalData?.billNumber ?: ""
            qRCodeRefID = qrModel.additionalData?.referenceLabel ?: ""
            qRMerchantCity = qrModel.merchantCity
            qRLoyaltyNumber = qrModel.additionalData?.loyaltyNumber ?: ""
            qRMerchantID = qrModel.merchantAccountInformation.merchantID ?: ""
            qRStoreLabel = qrModel.additionalData?.storeLabel ?: ""
            QRAddLangTemp = qrModel.additionalLanguage ?: ""
            qRCustomerLabel = qrModel.additionalData?.customerLabel ?: ""
            qRValue = qrModel.qrValue ?: ""
            qRDateandTime = qrModel.dateAndTime.date.toString()
            qRMobileNumber = qrModel.additionalData?.mobileNumber.toString()
            qRCountryCode = qrModel.countryCode ?: ""
            qRTerminalLabel = qrModel.additionalData?.terminalLabel ?: ""
            qRValueofConvenience = ""
            qRVOFCFixed = qrModel.qrVOFCFixed ?: ""
            qRVOFC = qrModel.qrVOFC ?: ""
            qRVerificationCode = qrModel.verificationCode.pinOrOtp
            QRTaxId = ""
            cdtrName = qrModel.merchantName ?: ""
            cdtrAlias = accountNumber.iBAN
            cdtrValue = ""
            cdtrBic = qrModel.merchantAccountInformation.BICCode ?: ""
            cdtrAcct = accountNumber.iBAN
            cdtrPstlAdr = qrModel.merchantCity ?: ""
            ctgyPurp = qrModel.additionalData?.purposeOfTransaction.toString()
            amt = qrModel.transactionAmount ?: ""
            amount = qrModel.transactionAmount ?: ""
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
            cdtrMCC = qrModel.merchantCategoryCode
            custProfile = currentCustProfile
            qrOptionalTip = if (qrModel.isOptionalTip == true) {
                qrModel.tip
            } else {
                ""
            }
            qrPercentageValue =
                if (qrModel.isPercentageTip == true) {
                    qrModel.tip
                } else {
                    ""
                }
            qrPstCd = qrModel.postalAddress
            BicCode = qrModel.merchantAccountInformation.BICCode
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

