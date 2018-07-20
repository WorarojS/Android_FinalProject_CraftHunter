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
        mMap.addMarker(new MarkerOptions().position(Stanley).title("Stanley brewing"));
        mMap.addMarker(new MarkerOptions().position(Bomber).title("Bomber brewing"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Stanley));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(10));
    }
}
