package com.example.security.Library;

import android.database.SQLException;

import com.example.security.SignUp.ModelUser;

import java.util.ArrayList;

public interface SqlLiteController {

    ArrayList<ModelUser> Login(String Username, String Password) throws SQLException;

    String Register(ModelUser modelUser) throws SQLException;



}
