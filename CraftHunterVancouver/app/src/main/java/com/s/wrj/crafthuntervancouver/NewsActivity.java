package com.s.wrj.crafthuntervancouver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {
    private TextView tvtitle, tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        // Setting values

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);

    }

    public void finish(View view) {
        finish();
    }

    public void shareBtn(View view) {
            Intent intent = getIntent();
            String Title = intent.getExtras().getString("Title");
            String Description = intent.getExtras().getString("Description");

            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = Title;
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, Title);
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody+"Read more at Vancouversun.com");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
