package com.tcs.service.controller

//import com.tcs.service.DAO.ShipS
import com.tcs.service.constant.URLPath
import com.tcs.service.model.ASN
import com.tcs.service.model.PostECMR
import com.tcs.service.model.ServiceResponse
import com.tcs.service.repo.ECMRRepo
import com.tcs.service.service.Producer
import com.tcs.service.utility.Utility
import org.springframework.http.ResponseEntity
//import com.tcs.service.repos.OracleInterface
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class Controller(private val produce: Producer, private val ecmrRepo: ECMRRepo ) {


    @RequestMapping("/post",method = [RequestMethod.POST])
    fun create(@RequestBody createPostECMR: PostECMR) {

//    var create = produce.create(createPostECMR)

    }

    @RequestMapping("/ecmr",method = [RequestMethod.GET])
    fun getAll(): ResponseEntity<ServiceResponse> {
       var result = ecmrRepo.findAll()

        return ResponseEntity.ok(ServiceResponse("200",
                "SUCCESS", result))
    }

    @RequestMapping("/ecmr/{id}",method = [RequestMethod.GET])
    fun getECMRData(@PathVariable id: String) {

        val result = Utility.convert(URLPath.BASE_URI + id, ASN())
        println(result)

    }
}