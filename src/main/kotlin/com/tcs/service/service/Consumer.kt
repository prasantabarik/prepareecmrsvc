package com.tcs.service.service

import com.tcs.service.constant.URLPath.BASE_URI
import com.tcs.service.edt.model.PrepareECMR
import com.tcs.service.edt.model.PreECMR
import com.tcs.service.model.ASN
import com.tcs.service.model.PostECMR
import com.tcs.service.utility.Utility
import io.eventuate.tram.events.subscriber.DomainEventEnvelope
import io.eventuate.tram.events.subscriber.DomainEventHandlers
import io.eventuate.tram.events.subscriber.DomainEventHandlersBuilder
import org.apache.logging.log4j.kotlin.logger
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class Consumer {

    @Autowired
    lateinit var producer: Producer

    @Autowired
    lateinit var prepareJson: PrepareJson

    val logger = logger()

    fun domainEventHandlers(): DomainEventHandlers {

        return DomainEventHandlersBuilder
                .forAggregateType(PrepareECMR::class.java.name)
                .onEvent(PreECMR::class.java) { dee: DomainEventEnvelope<PreECMR> -> run {
                    val pre: PreECMR = dee.event
                    println(pre.shipment_id)
                   logger.debug("API Called")

                    val result = Utility.convert(BASE_URI + pre.shipment_id, ASN())
            //        println(result)
                    prepareJson.manipulation(result)

                    logger.debug("Message DB Called")
                    producer.create(PostECMR(pre.shipment_id))
                }

                }.build()
    }
}
