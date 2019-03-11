package com.example.mrtus.demoapp.feature.template;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.example.mrtus.demoapp.common.Common;
import com.example.mrtus.demoapp.common.FlagStatus;
import com.example.mrtus.demoapp.feature.account.AccountFragment;
import com.example.mrtus.demoapp.feature.home.HomeFragment;
import com.example.mrtus.demoapp.R;
import com.example.mrtus.demoapp.feature.login.LoginFragment;
import com.example.mrtus.demoapp.feature.search.SearchFragment;

public class MainActivity extends AppCompatActivity {
    public final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_new:
                        Log.i(TAG,"new");
                        loadFragment(new HomeFragment());
                        return true;
                    case R.id.navigation_account:
                        Log.i(TAG,"account");
                        if (FlagStatus.isLogin){
                            loadFragment(new AccountFragment());
                        }else{
                            loadFragment(new LoginFragment());
                        }
                        return true;
                    case R.id.navigation_search:
                        Log.i(TAG,"search");
                        loadFragment(new SearchFragment());
                        return true;
                }
                return false;
            }
        });
    }



    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}