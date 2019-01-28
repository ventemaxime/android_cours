package com.example.vente.login.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vente.login.R;

/**
 * Created by vente on 28/01/2019.
 */

public class LightFragment extends Fragment {

    public LightFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Light");
        View rootView = inflater.inflate(R.layout.fragment_sensor_light, container, false);

        return rootView;
    }
}
