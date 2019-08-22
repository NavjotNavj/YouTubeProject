package com.NaviSingh.youtubeproject;

import android.content.Context;
import android.os.Bundle;

import com.NaviSingh.youtubeproject.fragments.HomeFragment;
import com.NaviSingh.youtubeproject.fragments.Profile_Fragment;
import com.NaviSingh.youtubeproject.fragments.TestFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.Menu;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "HomeActivity";
    private Context mContext = NavigationActivity.this;
    private static final int ACTIVITY_NUM = 0;
    private Toolbar toolbar;

    private BottomNavigationView nav_view1;


    //Fragment related
    private Fragment activeFragment = null;
    private FragmentManager manager;
    private HomeFragment homeFragment = new HomeFragment();
    private TestFragment testFragment = new TestFragment();
    private Profile_Fragment profile_fragment = new Profile_Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        init();
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        //setting the bottom navigation view here
//        setupBottomNavigationView();

        setUpBottomNavigation();
        addAllFragmentOnce();

    }


    //initialising all the views here
    private void init() {
        toolbar = findViewById(R.id.toolbar);
        nav_view1 = findViewById(R.id.nav_view1);

    }

    private void setUpBottomNavigation() {
        nav_view1.setOnNavigationItemSelectedListener(NavigationActivity.this);
        manager = getSupportFragmentManager();
        activeFragment = homeFragment;
    }

    private void addAllFragmentOnce() {

        //add the all the fragment on app start and only show home fragment and hide other fragments
        manager.beginTransaction()
                .add(R.id.parentLayout, activeFragment)
                .commit();

        manager.beginTransaction()
                .add(R.id.parentLayout, testFragment)
                .hide(testFragment)
                .commit();
        manager.beginTransaction()
                .add(R.id.parentLayout, profile_fragment)
                .hide(profile_fragment)
                .commit();
//
//        manager.beginTransaction()
//                .add(R.id.parentLayout, activityFragment)
//                .hide(activityFragment)
//                .commit();
//
//        manager.beginTransaction()
//                .add(R.id.parentLayout, chatFragment)
//                .hide(chatFragment)
//                .commit();
//
//        manager.beginTransaction()
//                .add(R.id.parentLayout, accountFragment)
//                .hide(accountFragment)
//                .commit();
    }

    private void showHideFragment(Fragment fragment) {
        //show fragment based on selection item id
        manager.beginTransaction()
                .hide(activeFragment)
                .show(fragment)
                .commit();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.navigation, menu);
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
        if (id == R.id.searchbar) {
            android.widget.SearchView searchView = (SearchView) item.getActionView();
            searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.ic_house:
        showHideFragment(homeFragment);
        activeFragment = homeFragment;
        break;

            case R.id.ic_search:
                showHideFragment(testFragment);
                activeFragment = testFragment;
                break;
            case R.id.ic_android:
                showHideFragment(profile_fragment);
                activeFragment = profile_fragment;
                break;
//
////            case R.id.id3:
////                showHideFragment(activityFragment);
////                activeFragment = activityFragment;
////                break;
////
////            case R.id.id4:
////                showHideFragment(chatFragment);
////                activeFragment = chatFragment;
////                break;
////            case R.id.id5:
////                showHideFragment(accountFragment);
////                activeFragment = accountFragment;
////                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
