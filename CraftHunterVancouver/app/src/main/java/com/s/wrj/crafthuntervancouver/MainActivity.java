package com.s.wrj.crafthuntervancouver;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {
    private static final int MAX_LINES = 0;
    private GoogleMap mMap;
    private TextView intro;
    List<NewsLibrary> lstNews ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intro = findViewById(R.id.textView);

        lstNews = new ArrayList<>();
        lstNews.add(new NewsLibrary("Off the Rail honours Spirit of the West frontman with new craft brew",
                "Off The Rail Brewing Company has launched a new pilsner in support of John Mann, the Spirit of the West frontman fighting Alzheimer’s."
                ,"\t\tOff The Rail Brewing Company has launched a new pilsner in support of John Mann, the Spirit of the West frontman fighting Alzheimer’s. The brewer’s new “Spirit Lifter” Pilsner is intended to raise awareness and funds for Mann’s ongoing treatments, said Off the Rail in a news release on Monday. Over three decades, Spirit of the West built a reputation as one of Canada’s most influential and socially-conscious bands. But in 2014, Mann, then 51, received a diagnosis of early-onset Alzheimer’s, leading to the band’s farewell concert at the Commodore Ballroom a year later. Mann continues to battle the disease.\n" +
                "\n" +
                "“As Alzheimer’s has now taken centre stage and continues to progress,” said Off the Rail, “proceeds of sales will go to John Mann and his family for his continued and evolving care.”\n" +
                "\n" +
                "\n" +
                "There is a connection between Mann and the brewing company. Off the Rail founder Steve Forsyth owned the legendary Railway Club, where Spirit of the West started their career, for over 27 years. Moreover, Steve’s sister Janet managed the band for many years.\n" +
                "\n" +
                "Forsyth came up with the idea to celebrate the spirit of both the band and craft beer as a way to give back to Mann’s family, and the “Spirit Lifter” pilsner was enthusiastically approved by Mann’s wife, Jill Daum, as well as fellow bandmate Geoffrey Kelly.\n" +
                "\n" +
                "“Spirit Lifter” will be available at BC liquor stores and other licensed retailers from June 15 – Sept. 1.",
                R.drawable.news1));

        lstNews.add(new NewsLibrary("Surrey's Central City begins selling Red Racer beer in larger cans for same price",
                "Surrey craft brewery Central City says it is changing North America beer standards by bumping up the size of its cans while keeping the price the same.",
                "\t\tSurrey craft brewery Central City says it is changing North America beer standards by bumping up the size of its cans while keeping the price the same.\n" +
                        "\n" +
                        "Starting in June, all of Central City’s Red Racer beer — 6 packs and 12 packs — will come in the larger 500ml tallboy format instead of traditional 355ml cans.\n" +
                        "\n" +
                        "Central City, which is also updating its branding to coincide with its 15th anniversary, says it is the first brewery in North American to move its entire core beer lineup to 500 ml cans.\n" +
                        "\n" +
                        "The company says customers won’t be paying more for that extra beer, as Central City plans to maintain its 355ml can pricing.\n" +
                        "\n" +
                        "“We are making this sizable move to shake things up,” said Darryll Frost, president and founder of Central City Brewers and Distillers. “We built the Central City brewery to be as efficient as possible in order to offer great value to consumers while producing high quality, premium craft beer. This is our way of thanking our customers for the 15 years of brand loyalty as well as introducing our Red Racer brand to new beer fans.”",
                R.drawable.news2));

        lstNews.add(new NewsLibrary("Opinion: Vancouver not yet a world-class beer city",
                "A few months ago Vogue magazine suggested that Vancouver might be the “New Craft Beer Capital of North America,” and this newspaper echoed with the question, “Is Vancouver the new Portland when it comes to craft beer?” Well, no.",
                "A few months ago Vogue magazine suggested that Vancouver might be the “New Craft Beer Capital of North America,” and this newspaper echoed with the question, “Is Vancouver the new Portland when it comes to craft beer?” Well, no. Vancouver has a very long way to go before it can be compared with the great beer cities in North America.\n" +
                        "\n" +
                        "Yes, we have great — maybe the best — craft beer and breweries, but that’s often where it ends. Great end-user distribution is what sets craft-beer cities apart and Vancouver needs to do better. Our important craft-beer industry deserves better.",
                R.drawable.new3));

        lstNews.add(new NewsLibrary("Opinion: Bringing B.C. craft beer to the world",
                "The mountains are a draw to Vancouver, there’s no denying it. The ocean is magnificent, the seawall is one of a kind, Stanley Park is a national treasure and the air is crisper than anywhere else in Canada.",
                "The mountains are a draw to Vancouver, there’s no denying it. The ocean is magnificent, the seawall is one of a kind, Stanley Park is a national treasure and the air is crisper than anywhere else in Canada. But if there is one thing we’ve become known for above all else in recent memory, it’s craft beer.\n" +
                        "\n" +
                        "The 8th annual Vancouver Craft Beer Week kicked off May 26. With over 100 craft breweries pouring more than 300 unique beer and cider samples, the local market is showing no signs of cooling off.\n" +
                        "\n" +
                        "Nationally, B.C. craft beer has long been considered the crème de la crème. From gritty East Van breweries like Parallel 49, to the aesthetically pleasing bottles of Postmark, our local craft-beer scene has become synonymous with satisfied palates throughout the province — and has provided a relatively overlooked boon for our economy along the way.\n" +
                        "\n" +
                        "With more than 150 craft breweries across B.C. and $1.1 billion in annual revenue, the B.C. craft-beer industry is projected for 2.6-per-cent annual growth by 2020. But that growth hasn’t come without challenges.",
                R.drawable.news4));

        lstNews.add(new NewsLibrary("Vancouver Craft Beer Week releases its collaborative brew",
                "The Vancouver Craft Beer Week, which begins Friday and runs until June 3, is the most wonderful time of the year for hops lovers.",
                "The Vancouver Craft Beer Week, which begins Friday and runs until June 3, is the most wonderful time of the year for hops lovers.\n" +
                        "\n" +
                        "Hops, the flowery bud of the hop plant Humulus lupulus, provide B.C. beer with its flavourful and aromatic punch that can run from floral to citrusy, depending on the variety of plant used.\n" +
                        "\n" +
                        "Not surprisingly, it’s the star ingredient in this year’s VCBW collaborative beer — the Double Dry Hopped Pilsner from Squamish’s Backcountry Brewing, North Vancouver’s Beere Brewing and Whistler’s Coast Mountain Brewing. ",
                R.drawable.news5));

        lstNews.add(new NewsLibrary("Vancouver rock heroes Japandroids get their own beer",
                "As rock and rollers, it’s no surprise that Japandroids have an affinity for beer. Now they’re getting one named after them.",
                "As rock and rollers, it’s no surprise that Japandroids have an affinity for beer. Now they’re getting one named after them.\n" +
                        "\n" +
                        "Drummer Dave Prowse says the real triumph of his band teaming up with Goose Island Brewery to produce a beer isn’t just that the proceeds are going to charity, it’s also that he and guitarist Brian King finally have a beer they can agree on.\n" +
                        "\n" +
                        "The band is big enough now, he says, that they can list separate beers on their performance riders. Prowse is avid craft beer guy, interested in all kinds of colours and flavours, while King, he says, he usually happiest with a straight-up lager.\n" +
                        "\n" +
                        "“One of the big coups for me was developing a beer that we both will drink,” he said Tuesday from his Vancouver jam space, where he and King are prepping for a European tour that launches June 29 in Moscow.",
                R.drawable.news6));





        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstNews);
        myrv.setLayoutManager(new GridLayoutManager(this,1));
        myrv.setAdapter(myAdapter);



        // Analog
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
