package com.a2a.data.constants


class Constants {
    companion object {
        //        const val BASE_ENDPOINT = "A2AProcess"
        const val BASE_ENDPOINT = "A2AProcess"
        const val BankCode = "CAB"
        const val RegionCode = "02"
        const val UserID = "ibank"
        const val Password = "ibank@123"
        const val Channel = "SS"
        const val TimeStamp = "2020-12-17T12:32:37.9247001+02:00"
        const val GuidID = "74402e7c-2d79-4a38-b2f8-396fb34c5c40"
        const val DeviceID = "Mobile"
        const val ConnectorID="CB"
        const val TokenId="0f8378650bed45839fffa9fbcbd72514"




        object BiometricType {
            val fingerPrint = 0
            val pattern = 1
        }
        object Support {
            var isBiometricSupported = false
        }


    }

    enum class RequestType(val type: String) {
        EditAlias("EditAlias"),
        EditAccount("EditAccount"),
        AddAccount("AddAccount"),
        AddAlias("AddAlias")
    }

}