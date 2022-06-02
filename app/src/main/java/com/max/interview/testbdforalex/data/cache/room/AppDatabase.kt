package com.max.interview.testbdforalex.data.cache.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [UserEntity::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}

val MIGRATION_1_2 = object : Migration(1, 2){
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("ALTER TABLE 'user_table' ADD COLUMN icon INTEGER")
        database.execSQL("ALTER TABLE 'user_table' ADD COLUMN money INTEGER DEFAULT 0 NOT NULL")
        database.execSQL("ALTER TABLE 'user_table' ADD COLUMN job TEXT")
    }
}