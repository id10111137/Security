package com.example.security.Home.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.security.Home.Fragment.FragmentHome;
import com.example.security.Home.Fragment.FragmentInfo;
import com.example.security.Home.Fragment.FragmentProfil;
import com.example.security.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_navigation_mInfo)
    BottomNavigationView bottomNavigationView;

    Fragment fragment;
    FragmentManager fragmentManager;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupNavigationView();
    }

    private void setupNavigationView() {

        if (bottomNavigationView != null) {

            // Select first menu item by default and show Fragment accordingly.
            Menu menu = bottomNavigationView.getMenu();
            selectmInfo(menu.getItem(0));

            // Set action to perform when any menu-item is selected.
            bottomNavigationView.setOnNavigationItemSelectedListener(
                    item -> {
                        selectmInfo(item);
                        return false;
                    });
        }
    }


    protected void selectmInfo(MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()) {
            case R.id.IdMenuA:
                pushFragment(new FragmentHome());
                break;
            case R.id.IdMenuB:
                pushFragment(new FragmentInfo());
                break;
            case R.id.IdMenuC:
                pushFragment(new FragmentProfil());
                break;
        }
    }


    protected void pushFragment(Fragment fragment) {
        if (fragment == null)
            return;

        fragmentManager = getSupportFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.replace(R.id.frame_homes, fragment);
                ft.commit();
            }
        }
    }

}
