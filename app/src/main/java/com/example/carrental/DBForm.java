package com.example.carrental;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBForm extends SQLiteOpenHelper {
    public DBForm(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "RentalForm.db", null, 1);

    }

    public static String DBName = "RentalForm.db";
    public static String RentalForm = "RForm"; //name of the table
    public static String FirstName = "Fname";
    public static String LastName = "Lname";
    public static String Address = "Address";
    public static String Address2 = "Address2";
    public static String Phone = "Phone";
    public static String Date1 = "Date1";
    public static String Date2 = "Date2";
    public static String VehicleType = "VehicleType";
    public static String VehicleName = "VehicleName";
    public static String TotalPassenger = "TotalPassenger";
    public static String Payment = "Payment";
    public SQLiteDatabase db1;


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table RForm(" +
                "Fname  TEXT    NOT NULL, " +
                "Lname  TEXT    NOT NULL, " +
                "Phone  TEXT    NOT NULL, " +
                "Address  TEXT    NOT NULL, " +
                "Address2  TEXT    NOT NULL, " +
                "Date1  TEXT    NOT NULL, " +
                "Date2  TEXT    NOT NULL, " +
                "TotalPassenger  TEXT    NOT NULL, " +
                "Payment  TEXT    NOT NULL, " +
                "VehicleType  TEXT    NOT NULL, " +
                "VehicleName  TEXT    NOT NULL" +
                ");"

        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db1.execSQL("drop table if exists Signup");
        onCreate(db1);
    }

    Boolean insertData(String fname, String lname, String address, String address2, String phone, String date1, String date2, String totalpassenger, String payment, String vehicletype, String vehiclename) {
        SQLiteDatabase db1 = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(FirstName, fname);
        cv.put(LastName, lname);
        cv.put(Address, address);
        cv.put(Address2, address2);
        cv.put(Phone, phone);
        cv.put(Date1, date1);
        cv.put(Date2, date2);
        cv.put(TotalPassenger, totalpassenger);
        cv.put(Payment, payment);
        cv.put(VehicleType, vehicletype);
        cv.put(VehicleName, vehiclename);
        long result = ((SQLiteDatabase) db1).insert(RentalForm, null, cv);
        return result != -1;
    }

}
