import com.a2a.data.datasource.MemoryCache
import com.a2a.data.model.BaseResponse
import com.a2a.data.model.login.LoginResponseData
import com.a2a.network.model.CustProfile
import com.a2a.data.model.lookup.LookUpResponse

object MemoryCacheImpl : MemoryCache {
    val memoryDataSource: MemoryDataSource = MemoryDataSource()
    override fun setLoginResponse(loginResponseData: LoginResponseData?) {
        memoryDataSource.cacheInMemory(loginResponseData)
    }

    override fun getLoginResponse(): LoginResponseData? {
        return memoryDataSource.getLoginResponse()
    }

    override fun setCustProfile(custProfile: CustProfile?) {
        memoryDataSource.cacheInMemory(custProfile)
    }

    override fun getCustProfile(): CustProfile? {
        return memoryDataSource.getCustProfile()
    }


    override fun setOtpRequest(request: Any) {
        return memoryDataSource.cacheRequest(request)
    }

    override fun getOtpRequest(): Any {
        return memoryDataSource.getOtpRequest()

    }

    override fun setOtpResponse(response: BaseResponse) {
        memoryDataSource.cacheResponse(response)
    }

    override fun getOtpResponse(): BaseResponse {
        return memoryDataSource.getOtpResponse()
    }

    override fun setLookUps(lookUpResponse: LookUpResponse) {
        memoryDataSource.cacheInMemoryLookUps(lookUpResponse)
    }

    override fun getLookUps(): LookUpResponse {
        return memoryDataSource.getListOfLookUps() ?: LookUpResponse()
    }

    override fun setDeviceId(deviceId: String) {
        memoryDataSource.cacheInMemory(deviceId)
    }

    override fun getDeviceId(): String {
        return memoryDataSource.getDeviceId()
    }

    override fun setIpAddress(ipAddress: String) {
        memoryDataSource.cacheInMemoryIpAddress(ipAddress)
    }

    override fun getIpAddress(): String {
        return memoryDataSource.getIpAddress()
    }

    override fun setStreetAddressEN(streetAddressEn: String) {
        memoryDataSource.cacheInMemoryStreetAddressEn(streetAddressEn)
    }

    override fun getStreetAddressEN(): String {
        return memoryDataSource.getStreetAddressEN()
    }
}