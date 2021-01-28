package com.tcs.service.model

data class ShipUnit(
        var containerTypeGtinPrimaryContainer: String = "",
        var shipUnitSscc: String = "",
        var numberOfPrimaryContainers: Int = 0,
        var totalLoadWeight: Int = 0,
        var containerInShipItems: MutableList<ContainerInShipItems> = mutableListOf()
) {
}