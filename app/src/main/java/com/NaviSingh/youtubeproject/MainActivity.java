//package com.NaviSingh.youtubeproject;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.util.Log;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.ImageButton;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.NaviSingh.youtubeproject.Adapters.commentAdapter;
//import com.NaviSingh.youtubeproject.Model.comments;
//import com.google.android.youtube.player.YouTubeBaseActivity;
//import com.google.android.youtube.player.YouTubeInitializationResult;
//import com.google.android.youtube.player.YouTubePlayer;
//import com.google.android.youtube.player.YouTubePlayerView;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class MainActivity extends YouTubeBaseActivity {
//    private static final String TAG = "MainActivity";
////  youtube player view
//    YouTubePlayerView youTubePlayerView;
//    YouTubePlayer.OnInitializedListener onInitializedListener;
//
////  firebase database reference
//    DatabaseReference mDatabaseRef;
//
////  Recycler View
//    RecyclerView.LayoutManager layoutManager;
//    RecyclerView recyclerView;
//    RecyclerView.Adapter mAdapter;
//
////  widgets
//    EditText name, comment;
//    ImageButton sendbtn;
//    ImageButton like,dislike;
//    TextView videolikes, videodislikes;
//
////  Array list of class comments
//    ArrayList<comments> comm;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.d(TAG, "onCreate starts");
//
////        name = findViewById(R.id.userName);
//        comment = findViewById(R.id.uercomment);
//        sendbtn = findViewById(R.id.sendbtn);
//        youTubePlayerView = findViewById(R.id.youtubePlayer);
//        like = findViewById(R.id.likebtn);
//        dislike = findViewById(R.id.dislikebtn);
////        videolikes = findViewById(R.id.liketv);
////        videodislikes = findViewById(R.id.disliketv);
//
//        like.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                like.setBackgroundColor(  -16776961 );
//                dislike.setVisibility(View.INVISIBLE);
//
//                videolikes.setText("1 like");
//
//            }
//        });
//        dislike.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dislike.setBackgroundColor( -16776961);
//                like.setVisibility(View.INVISIBLE);
//
//                videolikes.setText("1 dislike");
//            }
//        });
//
////        created instance of database
//        mDatabaseRef = FirebaseDatabase.getInstance().getReference("comment_data");
//        mDatabaseRef.keepSynced(true);
//
////        recycler view
//        recyclerView = findViewById(R.id.recyclerView);
//        layoutManager = new LinearLayoutManager(MainActivity.this);
//
//        mDatabaseRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                comm = new ArrayList<>();
//                for(DataSnapshot postSnapshot: dataSnapshot.getChildren()){
//                    comments data = postSnapshot.getValue(comments.class);
//                    comm.add(data);
//                }
//
//                //on data change we refresh the recycler view
//                recyclerView.refreshDrawableState();
//                recyclerView.setNestedScrollingEnabled(false);
//                recyclerView.setHasFixedSize(true);
//                mAdapter = new commentAdapter(MainActivity.this, comm);
//                mAdapter.notifyDataSetChanged();
//                recyclerView.setAdapter(mAdapter);
//                recyclerView.setLayoutManager(layoutManager);
//            }
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Toast.makeText(MainActivity.this,databaseError.getMessage(),Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                Log.d(TAG, "done Initialising");
//                List<String> videoList = new ArrayList<>();
//                videoList.add("2LBBaD1aQuw");
//                videoList.add("xuYRglBC-Vs");
//                youTubePlayer.loadVideos(videoList);
//            }
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                Toast.makeText(MainActivity.this, "Oh no! ", Toast.LENGTH_LONG).show();
//            }
//        };
//        youTubePlayerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick Initialising youtube");
//                youTubePlayerView.initialize(youTubeConfig.getApiKey(), onInitializedListener);
//            }
//        });
//        sendbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getValues();
//            }
//        });
//    }
//
//    private void getValues() {
//        String username = name.getText().toString().trim();
//        String userComment = comment.getText().toString().trim();
//        String circleText = name.getText().toString().substring(0, 1);
//
//        if (!TextUtils.isEmpty(username)) {
//            comments com = new comments(username,userComment,circleText);
//            String id = mDatabaseRef.push().getKey();
//            mDatabaseRef.child(id).setValue(com);
//            Toast.makeText(this, "Uploaded Successfully", Toast.LENGTH_SHORT).show();
//        }
//        else{
//            Toast.makeText(this, "please enter a name", Toast.LENGTH_SHORT).show();
//        }
//
//    }
//}
