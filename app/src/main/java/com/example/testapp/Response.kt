package com.example.testapp

import java.util.*
data class Characters(
    val results: List<Item>
)

data class Item(
    val id: Long?,
    val name: String?,
    val status: String?,
    val species: String?,
    val type: String?,
    val gender: String?,
    val origin: Origin?,
    val location: Location?,
    val image: String?,
    val url: String?,
    val created: String?,
)
data class Origin(
    val name: String?,
    val url: String?,
)
data class Location(
    val name: String?,
    val url: String?,
)