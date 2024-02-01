package com.aayushi.learning.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [BeerEntity::class],version = 1)
abstract class BeerDatabase:RoomDatabase() {

    abstract val beerDao: BeerDao

    companion object {
        const val DATABASE_NAME = "beer_database"
    }
}