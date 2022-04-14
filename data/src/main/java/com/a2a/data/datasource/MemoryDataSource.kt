import com.a2a.data.model.BaseResponse
import com.a2a.network.model.CustProfile
import com.a2a.data.model.lookup.LookUpResponse

class MemoryDataSource {
    private var custProfile: CustProfile? = null
    private var deviceId: String = ""
    private var ipAddress: String = ""
    private var request: Any = Any()
    private var response: BaseResponse = BaseResponse()
    private var lookUps: LookUpResponse? = null
    private var streetAddressEn: String = ""

    fun getCustProfile() = custProfile
    fun getDeviceId() = deviceId
    fun getIpAddress() = ipAddress
    fun getStreetAddressEN() = streetAddressEn
    fun getListOfLookUps() = lookUps
    fun getOtpRequest() = request
    fun getOtpResponse() = response
    fun cacheInMemory(custProfile: CustProfile?) {
        this.custProfile = custProfile
    }

    fun cacheInMemoryIpAddress(ipAddress: String) {
        this.ipAddress = ipAddress
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


    fun cacheInMemoryStreetAddressEn(streetAddressEn: String) {
        this.streetAddressEn = streetAddressEn
    }


}