package com.example.security.Home.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.security.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityHelp extends AppCompatActivity {

    TextView mTitle, mIcon, mBell;
    Intent mIntent;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        mTitle = toolbar.findViewById(R.id.id_title_toolbar);
        mTitle.setText("Help");

        mIcon = toolbar.findViewById(R.id.IdBack);
        mBell = toolbar.findViewById(R.id.IdBell);
        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Yes, I am User Icon", Toast.LENGTH_SHORT).show();
                onBackPressed();
                finish();
            }
        });

        mBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Yes, I am Bell Icon", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("","");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("","");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("","");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("","");
    }

}
