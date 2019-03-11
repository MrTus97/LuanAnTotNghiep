package com.example.mrtus.demoapp.feature.search;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.common.Common;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment implements View.OnClickListener {

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
        initXml();
        setEvent();
        return view;
    }

    @Override
    public void onAttach(Context context) {
        myContext = context;
        super.onAttach(context);
    }

    private void setEvent() {
        cvFollowPitch.setOnClickListener(this);
        cvFollowDate.setOnClickListener(this);

    }

    private void initXml() {
        cvFollowPitch = view.findViewById(R.id.cardViewSearchFra_followPitch);
        cvFollowDate = view.findViewById(R.id.cardViewSearchFra_followDate);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardViewSearchFra_followPitch:
                Common.loadFragment(new FollowPitchFragment(),myContext);
                break;
            case R.id.cardViewSearchFra_followDate:
                Common.loadFragment(new FollowDateFragment(),myContext);
                break;
        }
    }

}
