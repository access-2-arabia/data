import com.a2a.network.model.BaseResponse
import com.a2a.network.model.CustProfile

class MemoryDataSource {
    private var custProfile: CustProfile? = null
    private var request: Any = Any()
    private var response: BaseResponse = BaseResponse()

    fun getCustProfile() = custProfile
    fun getOtpRequest() = request
    fun getOtpResponse() = response

    fun cacheInMemory(custProfile: CustProfile?) {
        this.custProfile = custProfile
    }

    fun cacheRequest(request: Any) {
        this.request = request
    }

    fun cacheResponse(response: BaseResponse) {
        this.response = response
    }
}