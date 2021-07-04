package com.a2a.data.repository.accounts

import MemoryCacheImpl
import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.accountlist.AccountListPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class AccountsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getAccountsList(): Resource<T>? {
        val postData = AccountListPostData()
        postData.apply {
            a2ARequest?.apply {
                header?.apply {
                    bankCode = Constants.BankCode
                    regionCode = Constants.RegionCode
                    srvID = "DashBoard"
                    serviceID = 0
                    methodName = ""
                    userID = Constants.UserID
                    password = Constants.Password
                    channel = Constants.Channel
                    timeStamp = Date().formatToViewTimeStamp()
                    guidID = Constants.GuidID
                    deviceID = MemoryCacheImpl.getDeviceId()
                    deviceToken = Constants.TokenId
                    device = "Android"
                }

                a2ARequest?.body?.apply {
                    custProfile.repID = MemoryCacheImpl.getCustProfile()!!.repID
                    custProfile.custMnemonic = MemoryCacheImpl.getCustProfile()!!.custMnemonic
                    custProfile.address1 = MemoryCacheImpl.getCustProfile()!!.address1
                    custProfile.address2 = MemoryCacheImpl.getCustProfile()!!.address1
                    custProfile.addressCity = MemoryCacheImpl.getCustProfile()!!.addressCity
                    custProfile.addressCountry = MemoryCacheImpl.getCustProfile()!!.addressCountry
                    custProfile.aName = MemoryCacheImpl.getCustProfile()!!.aName
                    custProfile.aNameShort = MemoryCacheImpl.getCustProfile()!!.aNameShort
                    custProfile.birthDate = MemoryCacheImpl.getCustProfile()!!.birthDate
                    custProfile.branch = MemoryCacheImpl.getCustProfile()!!.branch
                    branchCode = MemoryCacheImpl.getCustProfile()!!.branch
                    custProfile.cID = MemoryCacheImpl.getCustProfile()!!.cID
                    custProfile.custID = MemoryCacheImpl.getCustProfile()!!.custID
                    custProfile.custImage = MemoryCacheImpl.getCustProfile()!!.custImage
                    custProfile.custMnemonic = MemoryCacheImpl.getCustProfile()!!.custMnemonic
                    custProfile.custType = MemoryCacheImpl.getCustProfile()!!.custType
                    custProfile.docNo = MemoryCacheImpl.getCustProfile()!!.docNo
                    custProfile.docNo1 = MemoryCacheImpl.getCustProfile()!!.docNo1
                    custProfile.docValidDate = MemoryCacheImpl.getCustProfile()!!.docValidDate
                    custProfile.eMail = MemoryCacheImpl.getCustProfile()!!.eMail
                    custProfile.eName = MemoryCacheImpl.getCustProfile()!!.eName
                    custProfile.eNameShort = MemoryCacheImpl.getCustProfile()!!.eNameShort
                    custProfile.gender = MemoryCacheImpl.getCustProfile()!!.gender
                    custProfile.iSOCode = MemoryCacheImpl.getCustProfile()!!.iSOCode
                    custProfile.iSOCode2 = MemoryCacheImpl.getCustProfile()!!.iSOCode2
                    custProfile.lang = MemoryCacheImpl.getCustProfile()!!.lang
                    custProfile.lWPT = MemoryCacheImpl.getCustProfile()!!.lWPT
                    custProfile.lWTD = MemoryCacheImpl.getCustProfile()!!.lWTD
                    custProfile.mobileNumber = MemoryCacheImpl.getCustProfile()!!.mobileNumber
                    custProfile.mobileNumberMasked =
                        MemoryCacheImpl.getCustProfile()!!.mobileNumberMasked
                    custProfile.nationality = MemoryCacheImpl.getCustProfile()!!.nationality
                    custProfile.nationalityID = MemoryCacheImpl.getCustProfile()!!.nationalityID
                    custProfile.placeOfBirth = MemoryCacheImpl.getCustProfile()!!.placeOfBirth
                    custProfile.termsAndCondition =
                        MemoryCacheImpl.getCustProfile()!!.termsAndCondition
                    branchCode = MemoryCacheImpl.getCustProfile()!!.branch

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