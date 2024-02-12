package com.example.csc475_1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.ContentValues

class ToDoDBHelper(context: Context) : SQLiteOpenHelper(context, "ToDoDB.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase) {
        val createTableQuery = """
            CREATE TABLE todos (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                task TEXT NOT NULL,
                completed INTEGER NOT NULL DEFAULT 0
            )
        """.trimIndent()
        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS todos")
        onCreate(db)
    }

    fun insertTask(task: String) {
        val db = this.writableDatabase
        val values = ContentValues().apply {
            put("task", task)
            put("completed", 0) // 0 for false
        }
        db.insert("todos", null, values)
        db.close()
    }

    fun deleteTask(id: Int) {
        val db = this.writableDatabase
        db.delete("todos", "id=?", arrayOf(id.toString()))
        db.close()
    }

    fun toggleTaskCompleted(id: Int, completed: Boolean) {
        val db = this.writableDatabase
        val values = ContentValues().apply {
            put("completed", if (completed) 1 else 0)
        }
        db.update("todos", values, "id=?", arrayOf(id.toString()))
        db.close()
    }
}