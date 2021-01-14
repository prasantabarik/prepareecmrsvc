package com.tcs.service.events

import io.eventuate.tram.events.common.DomainEvent
import org.springframework.data.domain.DomainEvents

class PostEcmrEvent : DomainEvent {

//    var MessageId:Int =0
//    var MessageNo:String = ""
    var ShipmentId: String = ""


    constructor() {}
    constructor(message: String) {
        this.ShipmentId = message

    }

//    constructor() {}
//    constructor(message: Int) {
//        this.MessageId = message
//
//    }
}

