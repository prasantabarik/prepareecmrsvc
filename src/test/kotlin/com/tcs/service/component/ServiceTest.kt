package com.tcs.service.component

import com.tcs.service.constant.URLPath.BASE_URI
import com.tcs.service.model.ASN
import com.tcs.service.service.PrepareJson
import com.tcs.service.utility.Utility
import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull
import org.junit.Assert
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import java.util.stream.Collectors

class ServiceTest(private val prepJson : PrepareJson) {

//    @Autowired
//    lateinit var




    @Test
    fun prepareJsonTest() {

        val result = Utility.convert(BASE_URI + "106175", ASN())
        val result1 = prepJson.manipulation(result)

        val postsPerType = result?.stream()
            ?.collect(
                Collectors.groupingBy(ASN::departureId,
                Collectors.groupingBy(ASN::glnshipfrom,
                    Collectors.groupingBy(ASN::glnshipto,
                        Collectors.groupingBy(ASN::referencenumberoftrip)))))

        Assert.assertNotNull(postsPerType)

    }
}