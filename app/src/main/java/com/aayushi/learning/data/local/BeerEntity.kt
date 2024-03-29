package com.aayushi.learning.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "beers",primaryKeys = ["id"])
data class BeerEntity(
    @PrimaryKey
    val id:Int,
    val name:String,
    val tagline:String,
    val description:String,
    val imageUrl:String,
    val firstBrewed:String?,
) {
}