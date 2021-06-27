import com.a2a.data.datasource.MemoryCache
import com.a2a.data.model.common.BaseLookup
import com.a2a.data.model.common.BaseResponse
import com.a2a.data.model.common.CustProfile

object MemoryCacheImpl : MemoryCache {
    val memoryDataSource: MemoryDataSource = MemoryDataSource()

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

    override fun setLookUps(lookUpResponse: BaseLookup) {
        memoryDataSource.cacheInMemoryLookUps(lookUpResponse)
    }

    override fun getLookUps(): BaseLookup {
        return memoryDataSource.getListOfLookUps() ?: BaseLookup()
    }

    override fun setDeviceId(deviceId: String) {
        memoryDataSource.cacheInMemory(deviceId)
    }

    override fun setSessionID(sessionId: String) {
        memoryDataSource.cacheSessionIdInMemory(sessionId)
    }

    override fun getSessionID(): String {
        return memoryDataSource.getSessionID()

    }

    override fun setIpAddress(ipAddress: String) {
        memoryDataSource.cacheSessionIdInMemory(ipAddress)
    }

    override fun getIpAddress(): String {
        return memoryDataSource.getIpAddress()
    }

    override fun getDeviceId(): String {
        return memoryDataSource.getDeviceId()
    }


}