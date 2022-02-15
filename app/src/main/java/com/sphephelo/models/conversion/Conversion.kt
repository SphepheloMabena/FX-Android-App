package com.sphephelo.models.conversion

data class Conversion(
    val from: String,
    val price: Double,
    val timestamp: Int,
    val to: String,
    val total: Double
)