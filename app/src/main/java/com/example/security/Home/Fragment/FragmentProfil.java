package com.example.security.Home.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.security.R;

import butterknife.ButterKnife;

public class FragmentProfil extends Fragment {

    View root;
    public FragmentProfil(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragmant_myprofil, container, false);
        ButterKnife.bind(this, root);
        return root;
    }
}
