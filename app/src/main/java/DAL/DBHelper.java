package com.example.deafanddumbcommunicator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "DefAndDumbCommunicator.db";
    public static final String USER_TABLE_NAME = "users";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table users " +
                        "(id integer primary key autoincrement, name text,email text, phone_number text,birthday datetime,password text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        onCreate(db);
    }

    public boolean AddUser (String name, String email, String phone, String birthday,String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("email", email);
        contentValues.put("phone_number", phone);
        contentValues.put("birthday", birthday);
        contentValues.put("password", password);
        long result = db.insert("users", null, contentValues);
        if(result == -1)
            return false;
        return true;
    }

    public boolean updateUser (String name, String email,String birthday, String phone,String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("birthday", birthday);
        contentValues.put("password", password);
        contentValues.put("phone_number", phone);
        long result = db.update("contacts", contentValues, "email = ? ", new String[] { email} );
        if(result == -1)
            return false;
        return true;
    }

    public Integer deleteContact (String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("users",
                "email = ? ",
                new String[] { email });
    }
}