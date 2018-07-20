package com.s.wrj.crafthuntervancouver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailActivity extends AppCompatActivity implements OnMapReadyCallback {
    private CraftLibrary mLibrary = new CraftLibrary();
    private static final int MAX_LINES = 2;
    private ImageView mPic;
    private TextView mName;
    private TextView mHead;
    private TextView mDes;
    private ImageButton mSub1;
    private ImageButton mSub2;
    private ImageButton mSub3;
    private ImageButton mSub4;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mPic = (ImageView) findViewById(R.id.Pic);
        mName = (TextView) findViewById(R.id.Name);
        mHead = (TextView) findViewById(R.id.Head);
        mDes = (TextView) findViewById(R.id.Des);
        mSub1 = (ImageButton) findViewById(R.id.subBut1);
        mSub2 = (ImageButton) findViewById(R.id.subBut2);
        mSub3 = (ImageButton) findViewById(R.id.subBut3);
        mSub4 = (ImageButton) findViewById(R.id.subBut4);


        Intent SecondActivityIntent = getIntent();
        String name = SecondActivityIntent.getStringExtra("num");
        int result = Integer.valueOf(name);

        mPic.setImageResource(mLibrary.getmPic(result));
        mName.setText(mLibrary.getmName(result));
        mHead.setText(mLibrary.getmHead(result));
        mDes.setText(mLibrary.getmDes(result));
//Stanley Park
        if (result == 0) {
            mSub1.setImageResource(mLibrary.getmSub1(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 0);
                    startActivity(intent);
                }
            });

            mSub2.setImageResource(mLibrary.getmSub1(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 1);
                    startActivity(intent);
                }
            });

            mSub3.setImageResource(mLibrary.getmSub1(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 2);
                    startActivity(intent);
                }
            });

            mSub4.setImageResource(mLibrary.getmSub1(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 3);
                    startActivity(intent);
                }
            });

//Bomber brewering
        } else if (result == 1) {
            mSub1.setImageResource(mLibrary.getmSub2(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 4);
                    startActivity(intent);
                }
            });

            mSub2.setImageResource(mLibrary.getmSub2(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 5);
                    startActivity(intent);
                }
            });

            mSub3.setImageResource(mLibrary.getmSub2(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 6);
                    startActivity(intent);
                }
            });

        }


        initView();
    }


    public void stanley(View view) {
        finish();
    }

    public void shareBtn(View view) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }

    private void initView() {
        Resize.doResizeTextView(mDes, MAX_LINES, "View More", true);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Intent SecondActivityIntent = getIntent();
        String name = SecondActivityIntent.getStringExtra("num");
        int result = Integer.valueOf(name);

        if (result == 0) {
            LatLng Stanley = new LatLng(49.299620, -123.133777);
            mMap.addMarker(new MarkerOptions().position(Stanley).title("Stanley brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Stanley));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }if (result == 1){
            LatLng Bomber = new LatLng(49.277407, -123.074594);
            mMap.addMarker(new MarkerOptions().position(Bomber).title("Bomber brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Bomber));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }

    }
}
