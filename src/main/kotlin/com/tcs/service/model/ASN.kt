package com.tcs.service.model

import java.util.*
import javax.persistence.*


data class ASN(
        var departureId:String = "",
        var glnshipfrom:String = "",
        var glnshipto:String = "",
        var referencenumberoftrip:String = "",
        var finishedloadingdatetime: String = "",
        var containertypegtinprimarycontai:String = "",
        var shipunitsscc:String = "",
        var refnumberpointofdestination:String = "",
        var totalloadweight:Int = 0,
        var uomweight:String = "",
        var numberofprimarycontainers:Int = 0,
        var containertypegtin:String = "",
        var numberofcontainers:Int = 0

)


