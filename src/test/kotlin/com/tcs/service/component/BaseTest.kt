package com.tcs.service.component

import com.tcs.service.edt.model.PreECMR
import com.tcs.service.edt.model.PrepareECMR
import com.tcs.service.events.PostEcmrEvent
import com.tcs.service.model.*

open class BaseTest() {

     public val departureId:String = ""
     public val glnshipfrom:String = ""
     public val glnshipto:String = ""
     public val referencenumberoftrip:String = ""
     public val finishedloadingdatetime: String = ""
     public val containertypegtinprimarycontai:String = ""
     public val shipunitsscc:String = ""
     public val refnumberpointofdestination:String = ""
     public val totalloadweight:Int = 0
     public val uomweight:String = ""
     public val numberofprimarycontainers:Int = 0
     public val containertypegtin:String = ""
     public val numberofcontainers:Int = 0

     public val id: String = ""
     public val shipmentId: String = ""
     public val messageNo: String = ""
     public val messageCreationDateTime: String = ""
     public val testIndicator: String? = ""
     public val glnShipFrom: String = ""
     public val glnShipTo: String = ""
     public val referenceNumberOfTrip: String = ""
     public val yearOfTrip: String = ""
     public val finishedLoadingDateTime: String = ""
     public val freightDocumentId: String? = ""
     public val arcCode: String? = ""
     public val arcCodeNeeded: Boolean = false
     public val statusFlag: String = "Not Created"
     public val orderInShipment: MutableList<OrderInShipment>? = mutableListOf()
     public val model: ASN = ASN()
     public val model1: ECMR = ECMR()
     public val model2: OrderInShipment = OrderInShipment()
     public val model3: ShipUnit = ShipUnit()
     public val model4: ContainerInShipItems = ContainerInShipItems()
     public val model5 : PostEcmrEvent = PostEcmrEvent()
     public val model6 : PreECMR = PreECMR()
     public val model7: PrepareECMR = PrepareECMR()
     public val model8 : PostECMR = PostECMR("message")

     public val referenceNumberPointOfDeparture: String = ""
     public val shipUnit: MutableList<ShipUnit>? = mutableListOf()

     public val containerTypeGtinPrimaryContainer: String = ""
     public val shipUnitSscc: String = ""
     public val numberOfPrimaryContainers: Int = 0
     public val totalLoadWeight: Int = 0
     public val containerInShipItems: MutableList<ContainerInShipItems> = mutableListOf()

     public val containerTypeGtin: String = ""
     public val numberOfContainers: Int = 0

     public val responseCode: String = ""
     public val responseDescription: String = ""
     public val response: Any? = ""

     public val shipment_id: String = ""

 }