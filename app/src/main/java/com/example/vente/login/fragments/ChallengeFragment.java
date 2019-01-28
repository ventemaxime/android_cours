package com.example.vente.login.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.vente.login.R;
import com.example.vente.login.activities.OtherActivity;
import com.example.vente.login.common.Friend;

import java.util.ArrayList;

/**
 * Created by vente on 28/01/2019.
 */

public class ChallengeFragment extends Fragment {

    public ChallengeFragment(){super();}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Challenge");
        View rootView = inflater.inflate(R.layout.fragment_challenge, container, false);
        ArrayList<Friend> liste = OtherActivity.friends;

        ListView lv = rootView.findViewById(R.id.listAmis);
        A
        lv.setAdapter();
        return rootView;
    }
}
