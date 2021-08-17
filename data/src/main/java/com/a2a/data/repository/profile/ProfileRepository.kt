package com.a2a.data.repository.profile


import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.profile.UpdateProfile
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> updateProfile(buildingNumber: String, streetName: String , zipCode:String): Resource<T> {
        val body = UpdateProfile()
        body.custProfile.buildingNo = buildingNumber
        body.custProfile.postZip = zipCode
        body.custProfile.streetAddress = streetName
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "CustProf"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

}