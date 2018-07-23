package com.s.wrj.crafthuntervancouver;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
    private Button webBut;
    private ImageButton dash;


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
        dash = findViewById(R.id.dash);
        webBut = findViewById(R.id.web_but);


        Intent SecondActivityIntent = getIntent();
        String name = SecondActivityIntent.getStringExtra("num");
        int result = Integer.valueOf(name);

        mPic.setImageResource(mLibrary.getmPic(result));
        mName.setText(mLibrary.getmName(result));
        mHead.setText(mLibrary.getmHead(result));
        mDes.setText(mLibrary.getmDes(result));
        dash.setImageResource(R.drawable.dash);

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
//acres brew
        }else if (result == 3){
            mSub1.setImageResource(mLibrary.getSub4(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 7);
                    startActivity(intent);
                                         }
                                     });
            mSub2.setImageResource(mLibrary.getSub4(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 8);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub4(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 9);
                    startActivity(intent);
                }
            });
            //andina
        }else if (result == 4) {
            mSub1.setImageResource(mLibrary.getSub5(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 10);
                    startActivity(intent);
                }
            });
            mSub2.setImageResource(mLibrary.getSub5(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 11);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub5(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 12);
                    startActivity(intent);
                }
            });
            mSub4.setImageResource(mLibrary.getSub5(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 13);
                    startActivity(intent);
                }
            });
            //bigrock
        }else if (result == 5){
            mSub1.setImageResource(mLibrary.getSub6(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 14);
                    startActivity(intent);
                }
            });
            mSub2.setImageResource(mLibrary.getSub6(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 15);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub6(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 16);
                    startActivity(intent);
                }
            });
            mSub4.setImageResource(mLibrary.getSub6(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 17);
                    startActivity(intent);
                }
            });
            //mainstreet

        }else if (result == 6) {
            mSub1.setImageResource(mLibrary.getSub7(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 18);
                    startActivity(intent);
                }
            });
            mSub2.setImageResource(mLibrary.getSub7(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 19);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub7(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 20);
                    startActivity(intent);
                }
            });
            mSub4.setImageResource(mLibrary.getSub7(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 21);
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
        }
        if (result == 1) {
            LatLng Bomber = new LatLng(49.277407, -123.074594);
            mMap.addMarker(new MarkerOptions().position(Bomber).title("Bomber brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Bomber));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }if (result == 2) {
            LatLng Yaletown = new LatLng(49.275573, -123.120998);
            mMap.addMarker(new MarkerOptions().position(Yaletown).title("Yaletown brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Yaletown));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }if (result == 3){
            LatLng acres = new LatLng(49.263965, -123.105356);
            mMap.addMarker(new MarkerOptions().position(acres).title("33Acres brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(acres));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }if (result == 4){
            LatLng andina = new LatLng(49.283426, -123.073944);
            mMap.addMarker(new MarkerOptions().position(andina).title("Andina brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(andina));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }if (result == 5) {
            LatLng andina = new LatLng(49.267202, -123.111560);
            mMap.addMarker(new MarkerOptions().position(andina).title("Bigrock brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(andina));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }if (result == 6) {
            LatLng main = new LatLng(49.264699, -123.099326);
            mMap.addMarker(new MarkerOptions().position(main).title("Main Street brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(main));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }
    }

    public void webBut(View view) {
        Intent SecondActivityIntent = getIntent();
        String name = SecondActivityIntent.getStringExtra("num");
        int result = Integer.valueOf(name);

        if (result == 0) {
            Uri uri = Uri.parse("http://www.stanleyparkbrewing.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if (result == 1) {
            Uri uri = Uri.parse("http://www.bomberbrewing.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if (result == 2) {
            Uri uri = Uri.parse("http://www.mjg.ca/yaletown/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if (result == 3) {
            Uri uri = Uri.parse("http://33acresbrewing.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if (result == 4) {
            Uri uri = Uri.parse("https://andinabrewing.ca/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if (result == 5) {
            Uri uri = Uri.parse("http://bigrockurban.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }if (result == 5) {
            Uri uri = Uri.parse("http://mainstreetbeer.ca/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }

    public void callBut(View view) {
        Intent SecondActivityIntent = getIntent();
        String name = SecondActivityIntent.getStringExtra("num");
        int result = Integer.valueOf(name);

        if (result == 0) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6046023088"));
            startActivity(callIntent);
        }
        if (result == 1) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6044287457"));
                startActivity(callIntent);
        }if (result == 2) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6046812739"));
            startActivity(callIntent);
        }if (result == 3) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6046204589"));
            startActivity(callIntent);
        }if (result == 4) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6042532400"));
            startActivity(callIntent);
        }if (result == 5) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6047088311"));
            startActivity(callIntent);
        }if (result == 6) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6043367711"));
            startActivity(callIntent);
        }
        }

    public void dash(View view) {
        Uri uri = Uri.parse("https://www.doordash.com/food-delivery/vancouver-bc-restaurants/alcohol/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    }
