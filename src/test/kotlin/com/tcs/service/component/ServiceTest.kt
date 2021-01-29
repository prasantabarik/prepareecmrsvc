package com.tcs.service.component

import com.tcs.service.constant.URLPath.BASE_URI
import com.tcs.service.model.ASN
import com.tcs.service.model.ECMR
import com.tcs.service.repo.ECMRRepo
import com.tcs.service.service.PrepareJson
import com.tcs.service.utility.Utility
import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull
import org.junit.Assert
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import java.util.stream.Collectors

class ServiceTest() {

//   @Autowired
//   lateinit
//lateinit var ecmrrep : EcmrRepoClass
//
// //   @Autowired
//   var prepJson : PrepareJson = PrepareJson(ecmrrep)
var utility : Utility = Utility
    @Test
    fun utils() {
        var result=  utility.convert(BASE_URI + "10123", ASN())

        Assert.assertTrue(result.isNullOrEmpty())
    }


//    @Test
//    fun prepareJsonTest() {
//
//        val result = Utility.convert(BASE_URI + "106175", ASN())
//        val result1 = prepJson.manipulation(result)
//
//        val postsPerType = result?.stream()
//            ?.collect(
//                Collectors.groupingBy(ASN::departureId,
//                Collectors.groupingBy(ASN::glnshipfrom,
//                    Collectors.groupingBy(ASN::glnshipto,
//                        Collectors.groupingBy(ASN::referencenumberoftrip)))))
//
//        Assert.assertNotNull(postsPerType)
//
//    }
}