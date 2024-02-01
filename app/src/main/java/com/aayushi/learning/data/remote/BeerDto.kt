package com.aayushi.learning.data.remote

data class BeerDto(
    val id:Int,
    val name:String,
    val tagline:String,
    val description:String,
    val image_url:String,
    val first_brewed:String?,
)