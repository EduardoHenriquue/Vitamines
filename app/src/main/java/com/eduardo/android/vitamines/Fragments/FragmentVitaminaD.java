package com.eduardo.android.vitamines.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eduardo.android.vitamines.R;

/**
 * Created by Eduardo on 06/04/2016.
 */
public class FragmentVitaminaD extends Fragment {

    public FragmentVitaminaD() {
    }

    public void onCreateBundle(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_vitamina_d, container, false);

        return view;
    }
}
