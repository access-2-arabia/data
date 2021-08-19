package com.a2a.data.repository.appointment

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.appointment.*
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class AppointmentRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getCountries(countryID: String): Resource<T> {
        val body = CountryPostData()
        body.countryID = countryID
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "QCountry"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
    suspend fun <T> getCities(countryId: String, cityId: String): Resource<T> {
        val body = CityPostData()
        body.countryID = countryId
        body.cityID = cityId
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "QCities"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getRegions(countryId: String, regionId: String): Resource<T> {
        val body = RegionPostData()
        body.countryID = countryId
        body.regionID = regionId
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "QRegions"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getBranches(countryId: String, regionId: String): Resource<T> {
        val body = RegionPostData()
        body.countryID = countryId
        body.regionID = regionId
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "QBBranch"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getBranchServices(branchId: String, mobileNumber: String): Resource<T> {
        val body = ServicesPostData()
        body.apply {
            branchID = branchId
            this.mobileNumber = mobileNumber
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "QSBranch"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getAvailableDates(branchId: String): Resource<T> {
        val body = AvailableDatesPostData()
        body.branchID
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "QADatesnBh"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> reserveAppointment(reserveAppointment: ReserveAppointment): Resource<T> {

        val postData = BaseRequestModel(
            A2ARequest(
                reserveAppointment,
                srvID = "QReserveTt"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> editAppointment(editAppointment: EditAppointmentPostData): Resource<T> {

        val postData = BaseRequestModel(
            A2ARequest(
                editAppointment,
                srvID = "QModifyApp"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getCustomerAppointment(branchId: String, mobileNumber: String): Resource<T> {
        val body = ServicesPostData()
        body.apply {
            branchID = branchId
            this.mobileNumber = mobileNumber
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "QCustApp"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getCancelAppointment(appointmentID: String): Resource<T> {

        val body = CancelAppointmentPostData()
        body.appointmentID = appointmentID
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "QCancelApp"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

}