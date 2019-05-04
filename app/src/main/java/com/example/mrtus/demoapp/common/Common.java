package com.example.mrtus.demoapp.common;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.api.ApiClient;
import com.example.mrtus.demoapp.api.ApiInterface;

public class Common {

    public static final ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

    public static final int RESPONSE_SUCCESS = 200;
    public static final String STR_BAD_REQUEST = "BAD REQUEST";
    public static final String STR_SOMETHING_ERROR = "SOMETHING WRONG";
    public static void loadFragment(Fragment fragment, Context context) {
        // load fragment
        FragmentActivity myContext;
        myContext = (FragmentActivity) context;
        FragmentTransaction transaction = myContext.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public static String token = null;
    public static boolean isLogin = false;

    public static void setLogout(){
        token = null;
        isLogin = false;
    }

    public static void setLogin(String author){
        token = author;
        isLogin = true;
    }
}
