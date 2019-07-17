package com.example.security.Library;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.security.SignUp.ModelUser;

import java.util.ArrayList;

public class SqlLiteDatabase extends SQLiteOpenHelper implements SqlLiteController {


    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "dbSecurity";
    private static final String TABLE_SECURITY = "tbl_security";

    private static final String KEY_USERID = "userid";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_DATE = "dateactivity";

    public SqlLiteDatabase(Context mContext) {
        super(mContext, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_ =
                "CREATE TABLE " + TABLE_SECURITY +
                        "("
                        + KEY_USERID +
                        " INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + KEY_USERNAME +
                        " TEXT,"
                        + KEY_EMAIL +
                        " TEXT,"
                        + KEY_PASSWORD +
                        " TEXT,"
                        + KEY_DATE +
                        " TEXT" +
                        ")";
        db.execSQL(CREATE_);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SECURITY);
        onCreate(db);
    }

    @Override
    public ArrayList<ModelUser> Login(String Username, String Password) throws SQLException {

        ArrayList<ModelUser> modelUsers = new ArrayList<>();
        ModelUser user = new ModelUser();

        String[] column = {
                KEY_USERID
        };

        SQLiteDatabase db = this.getReadableDatabase();
        String selection = KEY_USERNAME + " = ?" + " AND " + KEY_PASSWORD + " = ?";
        String[] selectionArgs = {Username, Password};
        Cursor cursor = db.query(TABLE_SECURITY, //Table to query
                column,                    //columns to return
                selection,                  //columns for the WHERE clause
                selectionArgs,              //The values for the WHERE clause
                null,                       //group the rows
                null,                       //filter by row groups
                null);
        int cursorCount = cursor.getCount();
        if (cursorCount > 0) {
            if (cursor.moveToFirst()) {
                do {
                    user.setUserID(String.valueOf(cursor.getInt(cursor.getColumnIndex(KEY_USERID))));
                    user.setUsername(cursor.getString(cursor.getColumnIndex(KEY_USERNAME)));
                    user.setEmail(cursor.getString(cursor.getColumnIndex(KEY_EMAIL)));
                    user.setPassword(cursor.getString(cursor.getColumnIndex(KEY_PASSWORD)));
                    user.setPassword(cursor.getString(cursor.getColumnIndex(KEY_DATE)));
                    modelUsers.add(user);
                } while (cursor.moveToNext());
            }
            cursor.close();
            db.close();
        }else{
            user.setUserID("NULL");
            user.setUsername("NULL");
            user.setEmail("NULL");
            user.setPassword("NULL");
            user.setPassword("NULL");
            modelUsers.add(user);
        }
        return modelUsers;
    }

    @Override
    public String Register(ModelUser modelUser) throws SQLException {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_USERNAME, modelUser.getUsername());
        values.put(KEY_EMAIL, modelUser.getEmail());
        values.put(KEY_PASSWORD, modelUser.getPassword());
        values.put(KEY_DATE, modelUser.getDateActivity());
        db.insert(TABLE_SECURITY, null, values);
        db.close();
        return "sukses";
    }
}
