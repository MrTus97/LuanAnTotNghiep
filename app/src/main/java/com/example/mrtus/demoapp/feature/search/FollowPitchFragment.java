package com.example.mrtus.demoapp.feature.search;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mrtus.demoapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FollowPitchFragment extends Fragment {


    public FollowPitchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_follow_pitch, container, false);
    }

}