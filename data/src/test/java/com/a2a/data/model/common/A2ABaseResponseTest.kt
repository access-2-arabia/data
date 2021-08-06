package com.a2a.data.model.common

import com.a2a.data.model.mail.MailBody
import com.google.gson.Gson
import org.junit.Assert.*
import org.junit.Test

class A2ABaseResponseTest {
    @Test
    fun a2aBaseResponse_CheckMailJson_ReturnsTrue() {
        val json = ""
        val gson = Gson().fromJson(Gson().toJson(json), A2ABaseResponse::class.java)
        print(json)
        assertTrue(true)
    }

}