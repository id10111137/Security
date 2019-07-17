package com.example.security.Home.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.security.Home.Activity.ActivityHelp;
import com.example.security.Home.Activity.ActivityIssue;
import com.example.security.Home.Activity.ActivityPanic;
import com.example.security.Home.Activity.ActivitySchedule;
import com.example.security.Home.Activity.ActivityTrafic;
import com.example.security.R;
import com.example.security.SignUp.ActivityLogin;

import butterknife.ButterKnife;
import butterknife.OnClick;

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
        mIntent = new Intent(getContext(), ActivityIssue.class);
        startActivity(mIntent);
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
}
