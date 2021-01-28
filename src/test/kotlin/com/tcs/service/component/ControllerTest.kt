package com.tcs.service.component

import com.tcs.service.constant.URLPath.POST_PUT_DELETE_URI
import com.tcs.service.constant.URLPath.POST_RESPONSE_JSON_PATH
import com.tcs.service.constant.URLPath.PUT_RESPONSE_JSON_PATH
import com.tcs.service.constant.URLPath.SAMPLE_STORE_RESPONSE_JSON_PATH
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.put
import java.io.File

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class, MockitoExtension::class)
class ControllerTest : BaseTest() {

    @Autowired
    lateinit var mockMvc: MockMvc



    /**
     * Preparing Mock Stub For service class
     **/
    @BeforeEach
    fun setup() {

//        whenever(service.getById(id = dataId)).thenAnswer { getModel() }
//        whenever(service.getById(id = dataId)).thenAnswer { getModel() }

    }

    /**
     * Test Method  for Controller Get Endpoint
     * Service call is mocked
     **/
//
//    @Test
//    fun `get function`(){
//        val expected = File(URLPath.GET_RESPONSE_JSON_PATH).readText(Charsets.UTF_8)
//        val result: MvcResult =
//            mockMvc.get("/api/ecmr")
//            {
//                contentType = MediaType.APPLICATION_JSON
//            }.andExpect { status { isOk } }.andReturn()
//
//        // JSONAssert.assertEquals(expected, result.response.contentAsString, false )
//        JSONAssert.assertEquals(expected, result.res, false )
//    }

    @Test
    fun `verify get by id`() {
        val expected = File(SAMPLE_STORE_RESPONSE_JSON_PATH).readText(Charsets.UTF_8)
        val result: MvcResult =
            mockMvc.get("/api/getdata/{shipId}", "106175")
            {
                contentType = MediaType.APPLICATION_JSON
            }.andExpect { status { isOk } }.andReturn()
        println(result)
        JSONAssert.assertEquals(expected, result.response.contentAsString, false)
    }

    @Test
    fun `should respond with put msg`(){
        var expected =File( PUT_RESPONSE_JSON_PATH).readText(Charsets.UTF_8)

        var result: MvcResult =

            mockMvc.put("/api" + POST_PUT_DELETE_URI)
            {
                contentType = MediaType.APPLICATION_JSON

                content = File(POST_RESPONSE_JSON_PATH).readText(Charsets.UTF_8)
            }.andExpect { status { isOk } }.andReturn()


        JSONAssert.assertEquals(expected, result.response.contentAsString, false )
    }

}