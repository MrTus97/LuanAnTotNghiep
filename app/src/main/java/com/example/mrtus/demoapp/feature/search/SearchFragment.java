package com.example.mrtus.demoapp.feature.search;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.common.Common;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment{

    private View view;
    private CardView cvFollowPitch,cvFollowDate;
    private Context myContext;
    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        myContext = context;
        super.onAttach(context);
    }


}
