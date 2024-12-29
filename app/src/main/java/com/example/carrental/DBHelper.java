package com.example.carrental;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DBNAME = "CarRental.db";
    public static final String SignupTable = "Signup";
    public static final String Username = "Username";
    public static final String Password = "Password";
    public SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, "CarRental.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL("create table Signup(\n" +
                "Username       TEXT        NOT NULL, " +
                "Password       TEXT        NOT NULL  " +
        ");\n");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("drop table if exists Signup");
        onCreate(db);
    }
    public boolean insertUsers(String username, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Username, username);
        cv.put(Password, password);
        long result = db.insert(SignupTable, null, cv);
        return result != -1;

    }
}
