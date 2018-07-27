package com.s.wrj.crafthuntervancouver;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailActivity extends AppCompatActivity implements OnMapReadyCallback {
    private CraftLibrary mLibrary = new CraftLibrary();
    private static final int MAX_LINES = 2;
    private TextView mResizableTextView;
    private ImageView mPic;
    private TextView mName;
    private TextView mHead;
    private TextView mDes;
    private ImageButton mSub1;
    private ImageButton mSub2;
    private ImageButton mSub3;
    private ImageButton mSub4;
    private GoogleMap mMap;
    private ImageButton dash;
    Intent SecondActivityIntent = getIntent();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent SecondActivityIntent = getIntent();
        String name = SecondActivityIntent.getStringExtra("num");
        int result = Integer.valueOf(name);

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
        } else if (result == 3) {
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
        } else if (result == 4) {
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
        } else if (result == 5) {
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

        } else if (result == 6) {
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
            //off rail
        }else if (result == 7) {
            mSub1.setImageResource(mLibrary.getSub8(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 22);
                    startActivity(intent);
                }
            });
            mSub2.setImageResource(mLibrary.getSub8(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 23);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub8(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 24);
                    startActivity(intent);
                }
            });
            mSub4.setImageResource(mLibrary.getSub8(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 25);
                    startActivity(intent);
                }
            });
            //postmark
        }
        else if (result == 8) {
            mSub1.setImageResource(mLibrary.getSub9(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 26);
                    startActivity(intent);
                }
            });
            mSub2.setImageResource(mLibrary.getSub9(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 27);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub9(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 28);
                    startActivity(intent);
                }
            });
            mSub4.setImageResource(mLibrary.getSub9(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 29);
                    startActivity(intent);
                }
            });
        }
        //powell
        else if (result == 9) {
            mSub1.setImageResource(mLibrary.getSub10(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 30);
                    startActivity(intent);
                }
            });
            mSub2.setImageResource(mLibrary.getSub10(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 31);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub10(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 32);
                    startActivity(intent);
                }
            });
            mSub4.setImageResource(mLibrary.getSub10(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 33);
                    startActivity(intent);
                }
            });
            //steam
        }else if (result == 10) {
                mSub1.setImageResource(mLibrary.getSub11(0));
                mSub1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                        intent.putExtra("code", 34);
                        startActivity(intent);
                    }
                });
                mSub2.setImageResource(mLibrary.getSub11(1));
                mSub2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                        intent.putExtra("code", 35);
                        startActivity(intent);
                    }
                });
                mSub3.setImageResource(mLibrary.getSub11(2));
                mSub3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                        intent.putExtra("code", 36);
                        startActivity(intent);
                    }
                });
                mSub4.setImageResource(mLibrary.getSub11(3));
                mSub4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                        intent.putExtra("code", 37);
                        startActivity(intent);
                    }
                });
        //fellow
        }else if (result == 11) {
            mSub1.setImageResource(mLibrary.getSub12(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 38);
                    startActivity(intent);
                }
            });
            mSub2.setImageResource(mLibrary.getSub12(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 39);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub12(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 40);
                    startActivity(intent);
                }
            });
            mSub4.setImageResource(mLibrary.getSub12(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 41);
                    startActivity(intent);
                }
            });
        //dogwood
        }else if (result == 12) {
            mSub1.setImageResource(mLibrary.getSub13(0));
            mSub1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 42);
                    startActivity(intent);
                }
            });
            mSub2.setImageResource(mLibrary.getSub13(1));
            mSub2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 43);
                    startActivity(intent);
                }
            });
            mSub3.setImageResource(mLibrary.getSub13(2));
            mSub3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 44);
                    startActivity(intent);
                }
            });
            mSub4.setImageResource(mLibrary.getSub13(3));
            mSub4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(DetailActivity.this, SubActivity.class);
                    intent.putExtra("code", 45);
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
        Intent SecondActivityIntent = getIntent();
        String name = SecondActivityIntent.getStringExtra("num");
        int result = Integer.valueOf(name);
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = mLibrary.getmName(result)+mLibrary.getmHead(result);
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, mLibrary.getmName(result));
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
        }
        if (result == 2) {
            LatLng Yaletown = new LatLng(49.275573, -123.120998);
            mMap.addMarker(new MarkerOptions().position(Yaletown).title("Yaletown brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Yaletown));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }
        if (result == 3) {
            LatLng acres = new LatLng(49.263965, -123.105356);
            mMap.addMarker(new MarkerOptions().position(acres).title("33Acres brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(acres));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }
        if (result == 4) {
            LatLng andina = new LatLng(49.283426, -123.073944);
            mMap.addMarker(new MarkerOptions().position(andina).title("Andina brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(andina));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }
        if (result == 5) {
            LatLng andina = new LatLng(49.267202, -123.111560);
            mMap.addMarker(new MarkerOptions().position(andina).title("Bigrock brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(andina));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }
        if (result == 6) {
            LatLng main = new LatLng(49.264699, -123.099326);
            mMap.addMarker(new MarkerOptions().position(main).title("Main Street brewing"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(main));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }
        if (result == 7) {
            LatLng offrail = new LatLng(49.277840, -123.075981);
            mMap.addMarker(new MarkerOptions().position(offrail).title("Off The Rail Brewing Co."));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(offrail));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }
        if (result == 8) {
            LatLng postmarl = new LatLng(49.284143, -123.095711);
            mMap.addMarker(new MarkerOptions().position(postmarl).title("Postmark Brewing Co."));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(postmarl));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

        }if (result == 9) {
            LatLng powell = new LatLng(49.283288, -123.075835);
            mMap.addMarker(new MarkerOptions().position(powell).title("Powell Brewing Co."));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(powell));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

        }if (result == 10) {
            LatLng steam = new LatLng(49.284910, -123.110815);
            mMap.addMarker(new MarkerOptions().position(steam).title("Steamworks Brewing Co."));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(steam));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

        }if (result == 11) {
            LatLng strange = new LatLng(49.272492, -123.077844);
            mMap.addMarker(new MarkerOptions().position(strange).title("Strange Fellows Brewing Co."));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(strange));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

        }if (result == 12) {
            LatLng dog = new LatLng(49.209889, -123.081431);
            mMap.addMarker(new MarkerOptions().position(dog).title("Dog Wood Brewing Co."));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(dog));
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
        }
        if (result == 6) {
            Uri uri = Uri.parse("http://mainstreetbeer.ca/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }if (result == 7) {
            Uri uri = Uri.parse("http://offtherailbrewing.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if (result == 8) {
            Uri uri = Uri.parse("http://postmarkbrewing.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }if (result == 9) {
            Uri uri = Uri.parse("http://powellbeer.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }if (result == 10) {
            Uri uri = Uri.parse("http://steamworks.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }if (result == 11) {
            Uri uri = Uri.parse("http://strangefellowsbrewing.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }if (result == 12) {
            Uri uri = Uri.parse("http://stanleyparkbrewing.com/");
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
        }
        if (result == 2) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6046812739"));
            startActivity(callIntent);
        }
        if (result == 3) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6046204589"));
            startActivity(callIntent);
        }
        if (result == 4) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6042532400"));
            startActivity(callIntent);
        }
        if (result == 5) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6047088311"));
            startActivity(callIntent);
        }
        if (result == 6) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6043367711"));
            startActivity(callIntent);
        }
        if (result == 7) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6045635767"));
            startActivity(callIntent);
        }if (result == 8) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6046991988"));
            startActivity(callIntent);
        }if (result == 9) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6045582537"));
            startActivity(callIntent);
        }
        if (result == 10) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6046892739"));
            startActivity(callIntent);

        }if (result == 11) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6042150092"));
            startActivity(callIntent);
        }if (result == 12) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:6043182280"));
            startActivity(callIntent);
        }



    }

        public void dash (View view){
            Uri uri = Uri.parse("https://www.doordash.com/food-delivery/vancouver-bc-restaurants/alcohol/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

    }




}
