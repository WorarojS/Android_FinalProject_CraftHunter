package com.s.wrj.crafthuntervancouver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
        LatLng Stanley = new LatLng(49.299620, -123.133777);
        LatLng Bomber = new LatLng(49.277407, -123.074594);
        LatLng Yaletown = new LatLng(49.275573, -123.120998);
        LatLng acres = new LatLng(49.263965, -123.105356);
        LatLng andina = new LatLng(49.283426, -123.073944);
        LatLng bigrock = new LatLng(49.267202, -123.111560);
        LatLng main = new LatLng(49.264699, -123.099326);
        mMap.addMarker(new MarkerOptions().position(Stanley).title("Stanley brewing"));
        mMap.addMarker(new MarkerOptions().position(Bomber).title("Bomber brewing"));
        mMap.addMarker(new MarkerOptions().position(Yaletown).title("Yaletown brewing"));
        mMap.addMarker(new MarkerOptions().position(acres).title("33Acres brewing"));
        mMap.addMarker(new MarkerOptions().position(andina).title("Andina brewing"));
        mMap.addMarker(new MarkerOptions().position(bigrock).title("Bigrock brewing"));
        mMap.addMarker(new MarkerOptions().position(main).title("Main Street brewing"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Stanley));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(10));
    }
}
