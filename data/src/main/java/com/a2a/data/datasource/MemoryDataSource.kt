import com.a2a.data.model.common.BaseLookup
import com.a2a.data.model.common.BaseResponse
import com.a2a.data.model.common.CustProfile

class MemoryDataSource {
    private var custProfile: CustProfile? = null
    private var deviceId: String = ""
    private var sessionId: String = ""
    private var request: Any = Any()
    private var ipAddress: String = ""
    private var response: BaseResponse = BaseResponse()
    private var lookUps: BaseLookup? = null


    fun getCustProfile() = custProfile

    fun getSessionID() = sessionId
    fun getListOfLookUps() = lookUps
    fun getDeviceId() = deviceId
    fun getOtpRequest() = request
    fun getOtpResponse() = response
    fun getIpAddress() = ipAddress
    fun cacheInMemory(custProfile: CustProfile?) {
        this.custProfile = custProfile
    }


    fun cacheSessionIdInMemory(sessionId: String) {
        this.sessionId = sessionId
    }

    fun cacheIpAddressInMemory(ipAddress: String) {
        this.ipAddress = ipAddress
    }
    fun cacheDeviceIdInMemory(deviceId: String) {
        this.deviceId = deviceId
    }

    fun cacheRequest(request: Any) {
        this.request = request
    }

    fun cacheResponse(response: BaseResponse) {
        this.response = response
    }


    fun cacheInMemoryLookUps(lookUps: BaseLookup?) {
        this.lookUps = lookUps
    }


}