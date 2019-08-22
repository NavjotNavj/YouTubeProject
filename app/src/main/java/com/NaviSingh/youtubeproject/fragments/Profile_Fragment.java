package com.NaviSingh.youtubeproject.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.NaviSingh.youtubeproject.NavigationActivity;
import com.NaviSingh.youtubeproject.R;


import de.hdodenhof.circleimageview.CircleImageView;

public class Profile_Fragment extends Fragment {

    private TextView mPosts, mFollowers, mFollowing, mDisplayName, mUsername, mWebsite, mDescription;
    private ProgressBar mProgressBar;
    private CircleImageView mProfilePhoto;
    private ImageView profileMenu;
    private Context mContext;

    public Profile_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);
        mDisplayName =  view.findViewById(R.id.display_name);
        mUsername =  view.findViewById(R.id.username);
        mWebsite =  view.findViewById(R.id.website);
        mDescription =  view.findViewById(R.id.description);
        mProfilePhoto =  view.findViewById(R.id.profile_photo);
        mProgressBar =  view.findViewById(R.id.profileProgressBar);
//        profileMenu =  view.findViewById(R.id.profileMenu);
        mContext = getActivity();
//        setupToolbar();
        return view;


    }

//    private void setupToolbar(){
//
//        profileMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent intent = new Intent(mContext, AccountSettingsActivity.class);
////                startActivity(intent);
////                getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//            }
//        });
//    }

}
