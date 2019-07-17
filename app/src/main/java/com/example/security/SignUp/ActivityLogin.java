package com.example.security.SignUp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.security.Home.Activity.MainActivity;
import com.example.security.Library.SqlLiteDatabase;
import com.example.security.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityLogin extends AppCompatActivity {

    @BindView(R.id.IdPassword)
    EditText IdPassword;

    @BindView(R.id.IdUsername)
    EditText IdUsername;

    Intent mIntent;
    SqlLiteDatabase sqlLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.IdGoLogin)
    void GoLogin() {
        mIntent = new Intent(this, MainActivity.class);
        startActivity(mIntent);
        finish();
    }

    @OnClick(R.id.IdGoRegister)
    void GoRegister() {
        mIntent = new Intent(this, ActivityRegister.class);
        startActivity(mIntent);
        finish();
    }
}
