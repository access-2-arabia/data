import com.a2a.data.datasource.MemoryCache
import com.a2a.data.model.common.BaseLookup
import com.a2a.network.model.BaseResponse
import com.a2a.network.model.CustProfile

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
}