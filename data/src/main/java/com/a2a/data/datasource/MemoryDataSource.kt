import com.a2a.data.model.BaseResponse
import com.a2a.data.model.CustProfile
import com.a2a.data.model.lookup.LookUpResponse

class MemoryDataSource {
    private var custProfile: CustProfile? = null
    private var deviceId: String = ""
     private var request: Any = Any()
    private var response: BaseResponse = BaseResponse()
    private var lookUps: LookUpResponse? = null


    fun getCustProfile() = custProfile
    fun getDeviceId() = deviceId
    fun getListOfLookUps() = lookUps
    fun getOtpRequest() = request
    fun getOtpResponse() = response
    fun cacheInMemory(custProfile: CustProfile?) {
        this.custProfile = custProfile
    }


    fun cacheInMemory(deviceId: String) {
        this.deviceId = deviceId
    }

    fun cacheRequest(request: Any) {
        this.request = request
    }

    fun cacheResponse(response: BaseResponse) {
        this.response = response
    }


    fun cacheInMemoryLookUps(lookUps: LookUpResponse?) {
        this.lookUps = lookUps


    }


}