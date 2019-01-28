package com.example.vente.login.fragments;

import android.support.v4.app.Fragment;
import android.hardware.Sensor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vente.login.R;

/**
 * Created by vente on 28/01/2019.
 */

public class SensorFragment extends Fragment {

    public SensorFragment(){super();}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        getActivity().setTitle("Sensor");
        View rootView = inflater.inflate(R.layout.fragment_sensor, container, false);

        return rootView;
    }
}
