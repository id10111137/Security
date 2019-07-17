package com.example.security.SignUp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.security.Library.SqlLiteDatabase;
import com.example.security.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityRegister extends AppCompatActivity {

    Intent mIntent;
    @BindView(R.id.IdUsername)
    EditText IdUsername;

    @BindView(R.id.IdPassword)
    EditText IdPassword;

    @BindView(R.id.IdEmail)
    EditText IdEmail;
    SqlLiteDatabase sqlLiteDatabase;
    ModelUser modelUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.IdGoRegister)
    void GoRegister() {
//        if (IdUsername.getText().toString().isEmpty()) {
//            IdUsername.setError("Field Username Kosong");
//        } else if (IdPassword.getText().toString().isEmpty()) {
//            IdPassword.setError("Field Username Kosong");
//        } else {
//            modelUser = new ModelUser();
//            modelUser.setUsername(IdUsername.getText().toString());
//            modelUser.setPassword(IdPassword.getText().toString());
//            modelUser.setEmail(IdPassword.getText().toString());
//            modelUser.setDateActivity("2019-10-10");
//            sqlLiteDatabase.Register(modelUser);
//
////           if(sqlLiteDatabase.Register(modelUser).equals("sukses")){
////                Toast.makeText(this, "Sukses Register", Toast.LENGTH_SHORT).show();
////            }else{
////                Toast.makeText(this, "Gagal Register", Toast.LENGTH_SHORT).show();
////            }
//        }
    }

    @OnClick(R.id.mGoLogin)
    void GoLogin() {
        mIntent = new Intent(this, ActivityLogin.class);
        startActivity(mIntent);
        finish();
    }
}
