package com.s.wrj.crafthuntervancouver;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {
    private static final int MAX_LINES = 0;
    private GoogleMap mMap;
    private TextView intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intro = findViewById(R.id.textView);

        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(MainActivity.this);
        }
        builder.setTitle("ARE YOU OVER 19")
                .setMessage("Are you Legally Drinking Age?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        GridLayout gridLayout = findViewById(R.id.grid);
        for (int i = 0; i < gridLayout.getChildCount(); i++) {

            ImageButton imgButt = (ImageButton) gridLayout.getChildAt(i);
            imgButt.setOnClickListener(this);
        }
    }
    @Override
    public void onClick(View v) {
        String num = v.getTag().toString();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("num", num);

        startActivity(intent);
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng main = new LatLng(49.264699, -123.099326);
        LatLng Stanley = new LatLng(49.299620, -123.133777);
        LatLng Bomber = new LatLng(49.277407, -123.074594);
        LatLng Yaletown = new LatLng(49.275573, -123.120998);
        LatLng acres = new LatLng(49.263965, -123.105356);
        LatLng andina = new LatLng(49.283426, -123.073944);
        LatLng bigrock = new LatLng(49.267202, -123.111560);
        LatLng offrail = new LatLng(49.277840, -123.075981);
        LatLng postmarl = new LatLng(49.284143, -123.095711);
        LatLng powell = new LatLng(49.283288, -123.075835);
        LatLng steam = new LatLng(49.284910, -123.110815);
        LatLng strange = new LatLng(49.272492, -123.077844);
        LatLng dog = new LatLng(49.209889, -123.081431);

        mMap.addMarker(new MarkerOptions().position(Stanley).title("Stanley brewing"));
        mMap.addMarker(new MarkerOptions().position(Bomber).title("Bomber brewing"));
        mMap.addMarker(new MarkerOptions().position(Yaletown).title("Yaletown brewing"));
        mMap.addMarker(new MarkerOptions().position(acres).title("33Acres brewing"));
        mMap.addMarker(new MarkerOptions().position(andina).title("Andina brewing"));
        mMap.addMarker(new MarkerOptions().position(bigrock).title("Bigrock brewing"));
        mMap.addMarker(new MarkerOptions().position(main).title("Main Street brewing"));
        mMap.addMarker(new MarkerOptions().position(offrail).title("Off The Rail Brewing Co."));
        mMap.addMarker(new MarkerOptions().position(postmarl).title("Postmark Brewing Co."));
        mMap.addMarker(new MarkerOptions().position(powell).title("Powell Brewing Co."));
        mMap.addMarker(new MarkerOptions().position(steam).title("SteamWorks Brewing Co."));
        mMap.addMarker(new MarkerOptions().position(strange).title("Strange Fellows Brewing Co."));
        mMap.addMarker(new MarkerOptions().position(dog).title("Dogwood Brewing Brewing Co."));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(main));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12));
    }


    public void showText(View view) {
        intro.setText("Craft Hunter Vancovuer \n" +
                "is an Android application Student Project from Android Development (301) class at CICCC \n\n" +
                "This application is about all of Vancouver brewery Library that contain most of brewery in The Greater Vancouver area that contain about 12 brewery and more than 40 information of beers.\n\n" +
                "And this app provided delivery services by third party app. "+"So i hope that this brewery Library would be benefit to you more or less.");

    }




}
