package com.a2a.data.model.mail

import com.google.gson.Gson
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class MailResponseTest {

    @Test
    fun mailResponse_CheckMailJson_ReturnsString() {
        val json = "{\"A2AResponse\": {" +
                "        \"Header\": {" +
                "            \"RegionCode\": \"\"," +
                "            \"SrvID\": 0," +
                "            \"GuidID\": \"562984e8-4970-4bb3-9da2-6d33acb8dc6a\"," +
                "            \"TimeStamp\": \"2021-08-06T19:40:36.1011793+03:00\"," +
                "            \"Result\": {" +
                "                \"ErrorCode\": 0," +
                "                \"EDesc\": \"\"," +
                "                \"ADesc\": \"\"" +
                "            }," +
                "            \"SessionID\": \"21062021052689\"" +
                "        }," +
                "        \"Body\": {" +
                "            \"Inbox\": [" +
                "                {" +
                "                    \"ID\": 3," +
                "                    \"Text\": \"Test InBox\"," +
                "                    \"Subject\": \"Test Inbox\"," +
                "                    \"MailDate\": \"2021-06-02T00:00:00\"," +
                "                    \"ReadFlag\": false" +
                "                }" +
                "            ]," +
                "            \"Outbox\": [" +
                "                {" +
                "                    \"ID\": 5," +
                "                    \"Text\": \"Test 1\"," +
                "                    \"Subject\": \"Mail Test \"," +
                "                    \"MailDate\": \"2021-08-04T18:12:26.743\"," +
                "                    \"ReadFlag\": true" +
                "                }," +
                "                {" +
                "                    \"ID\": 1," +
                "                    \"Text\": \"Test 1\"," +
                "                    \"Subject\": \"Mail Test \"," +
                "                    \"MailDate\": \"2021-06-22T10:27:39.357\"," +
                "                    \"ReadFlag\": true" +
                "                }" +
                "            ]," +
                "            \"Trash\": [" +
                "                {" +
                "                    \"ID\": 4," +
                "                    \"Text\": \"Test InBox\"," +
                "                    \"Subject\": \"Test Trash\"," +
                "                    \"MailDate\": \"2021-06-02T00:00:00\"," +
                "                    \"ReadFlag\": true" +
                "                }" +
                "            ]" +
                "        }," +
                "        \"Footer\": {" +
                "            \"Signature\": \"0af89a03c0d7a5861a9dbf4d9600b7fd2738b1ef3748e69e7416129008bd4e8daf47118c011f05cac0df7d09c191911d285d81d76e40c6669581975755cbc1c6\"" +
                "        }" +
                "    }," +
                "    \"ErrorMsg\": {" +
                "        \"ErrorCode\": 0," +
                "        \"EDesc\": \"\"," +
                "        \"ADesc\": \"\"" +
                "    }" +
                "}"
        try {
            val gson = Gson().fromJson(Gson().toJson(json), MailResponse::class.java)
            assertTrue(gson != null)
        } catch (e: Exception) {
            print(e.message)
            assertFalse(false)
        }
    }
}