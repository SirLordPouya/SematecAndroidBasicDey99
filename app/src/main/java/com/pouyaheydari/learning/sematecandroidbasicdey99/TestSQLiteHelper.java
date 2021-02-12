package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TestSQLiteHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "students";

    public TestSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "(" +
                "_id integer primary key autoincrement," +
                "name text," +
                "family text," +
                "age integer" + ")";
        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }


    // 'Pouya' ---> Strings
    public void insertIntoStudents(String name, String family, int age) {
        String INSERT_INTO_STUDENTS_QUERY = "INSERT INTO " + TABLE_NAME
                + "(name,family,age) VALUES(" + "'" + name + "'," + "'" + family + "'," + age
                + ")";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(INSERT_INTO_STUDENTS_QUERY);
        db.close();
    }

    public List<String> getStudentsNames() {
        String SELECT_NAMES_QUERY = "SELECT name FROM " + TABLE_NAME;
        ArrayList<String> names = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_NAMES_QUERY, null);

        while (cursor.moveToNext()) {
            String name = cursor.getString(0);
            names.add(name);
        }
        db.close();
        return names;
    }
}
