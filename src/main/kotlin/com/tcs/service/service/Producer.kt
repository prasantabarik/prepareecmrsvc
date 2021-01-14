package com.tcs.service.service

import com.tcs.service.events.PostEcmrEvent
import com.tcs.service.model.PostECMR
import io.eventuate.tram.events.common.DomainEvent
import io.eventuate.tram.events.publisher.DomainEventPublisher
import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional
class Producer {

@Autowired
lateinit var  domainEventPublisher: DomainEventPublisher

//fun create(createPostECMR : PostECMR) {
//  var create = repo.save(createPostECMR)
//  publishTodoEvent(createPostECMR, PostEcmrEvent(createPostECMR.MessageId))
//}
//
//    fun publishTodoEvent(PostECMR: PostECMR, vararg domainEvents: DomainEvent) {
//        domainEventPublisher.publish(PostECMR::class.java, PostECMR.MessageId, Arrays.asList(*domainEvents))
//    }

    fun create(post: PostECMR) {
        publishTodoEvent(post, PostEcmrEvent(post.ShipmentId))
    }

    fun publishTodoEvent(PostECMR: PostECMR, vararg domainEvents: DomainEvent) {
        domainEventPublisher.publish(PostECMR::class.java, PostECMR.ShipmentId, Arrays.asList(*domainEvents))
    }

}