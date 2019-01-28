package com.example.vente.login.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vente.login.R;

/**
 * Created by vente on 28/01/2019.
 */

public class TemperatureFragment extends Fragment {

    public TemperatureFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Temperature");
        View rootView = inflater.inflate(R.layout.fragment_sensor_temperature, container, false);

        return rootView;
    }
}
