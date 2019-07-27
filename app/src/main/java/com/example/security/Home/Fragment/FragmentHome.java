package com.example.security.Home.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.security.Home.Activity.ActivityHelp;
import com.example.security.Home.Activity.ActivityIssue;
import com.example.security.Home.Activity.ActivityPanic;
import com.example.security.Home.Activity.ActivitySchedule;
import com.example.security.Home.Activity.ActivityTrafic;
import com.example.security.R;
import com.example.security.SignUp.ActivityLogin;

import java.util.Objects;

import butterknife.ButterKnife;
import butterknife.OnClick;
import info.androidhive.fontawesome.FontTextView;

public class FragmentHome  extends Fragment {



    private Intent mIntent;

    private View root;
    public FragmentHome(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

    @OnClick(R.id.IdIssue)
    void GoIssue(){
//        mIntent = new Intent(getContext(), ActivityIssue.class);
//        startActivity(mIntent);
        DialogShow();
    }

    @OnClick(R.id.IdShcedule)
    void GoSchedule(){
        mIntent = new Intent(getContext(), ActivitySchedule.class);
        startActivity(mIntent);
    }

    @OnClick(R.id.IdHelp)
    void GoMessage(){
        mIntent = new Intent(getContext(), ActivityHelp.class);
        startActivity(mIntent);
    }


    @OnClick(R.id.IdMyTrafic)
    void GoTrafic(){
        mIntent = new Intent(getContext(), ActivityTrafic.class);
        startActivity(mIntent);
    }

    @OnClick(R.id.IdPannicButton)
    void GoPannic(){
        mIntent = new Intent(getContext(), ActivityPanic.class);
        startActivity(mIntent);
    }

    @OnClick(R.id.IdLogout)
    void GoLogout(){
        mIntent = new Intent(getContext(), ActivityLogin.class);
        startActivity(mIntent);
    }

    private void DialogShow(){
        final Dialog dialog = new Dialog(Objects.requireNonNull(getContext()));
        // kemudian menambahkan tampilan costum dialog;
        dialog.setContentView(R.layout.dialog_issue);
        dialog.setTitle("Costum Dialog");
        FontTextView IdDialogClose = (FontTextView) dialog.findViewById(R.id.IdDialogClose);
        IdDialogClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        LinearLayout IdSimpanIssue = (LinearLayout) dialog.findViewById(R.id.IdSimpanIssue);
        IdSimpanIssue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "InProgress", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }

}
