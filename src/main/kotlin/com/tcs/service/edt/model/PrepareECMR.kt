package com.tcs.service.edt.model

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import javax.persistence.Id


data class PrepareECMR(
        @Id
        val shipment_id: String
)