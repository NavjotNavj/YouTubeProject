//package com.NaviSingh.youtubeproject.Utils;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//import android.view.MenuItem;
//
//import androidx.annotation.NonNull;
//
//import com.NaviSingh.youtubeproject.AccountActivity;
//import com.NaviSingh.youtubeproject.AddActivity;
//import com.NaviSingh.youtubeproject.EditActivity;
//import com.NaviSingh.youtubeproject.NotificationActivity;
//import com.NaviSingh.youtubeproject.R;
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
//
//public class BottomNavigationViewHelper {
//
//    private static final String TAG = "BottomNavigationViewHel";
//
//    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {
//        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
//        bottomNavigationViewEx.enableAnimation(false);
//        bottomNavigationViewEx.enableItemShiftingMode(false);
//        bottomNavigationViewEx.enableShiftingMode(false);
//        bottomNavigationViewEx.setTextVisibility(false);
//    }
//    public static void enableNavigation(final Context context, final Activity callingActivity, BottomNavigationViewEx view){
//        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//
////                    case R.id.ic_house:
////                        Intent intent1 = new Intent(context, .class);//ACTIVITY_NUM = 0
////                        context.startActivity(intent1);
////                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
////                        break;
//
//                    case R.id.ic_search:
//                        Intent intent2  = new Intent(context, EditActivity.class);//ACTIVITY_NUM = 1
//                        context.startActivity(intent2);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//                        break;
//
//                    case R.id.ic_circle:
//                        Intent intent3 = new Intent(context, AddActivity.class);//ACTIVITY_NUM = 2
//                        context.startActivity(intent3);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//                        break;
//
//                    case R.id.ic_alert:
//                        Intent intent4 = new Intent(context, NotificationActivity.class);//ACTIVITY_NUM = 3
//                        context.startActivity(intent4);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//                        break;
//
//                    case R.id.ic_android:
//                        Intent intent5 = new Intent(context, AccountActivity.class);//ACTIVITY_NUM = 4
//                        context.startActivity(intent5);
//                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//                        break;
//                }
//
//
//                return false;
//            }
//        });
//    }
//
//
//}
//
