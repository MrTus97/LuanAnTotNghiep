package com.example.mrtus.demoapp.common;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.example.mrtus.demoapp.R;

public class Common {
    public static void loadFragment(Fragment fragment, Context context) {
        // load fragment
        FragmentActivity myContext;
        myContext = (FragmentActivity) context;
        FragmentTransaction transaction = myContext.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
