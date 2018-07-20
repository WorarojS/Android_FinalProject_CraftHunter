package com.s.wrj.crafthuntervancouver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    private static final int MAX_LINES =2;
    private CraftLibrary mLibrary = new CraftLibrary();
    private TextView head;
    private ImageView pic;
    private TextView des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        head = findViewById(R.id.head);
        pic = findViewById(R.id.picture);
        des = findViewById(R.id.des);


        Intent mIntent = getIntent();
        int result = mIntent.getIntExtra("code", 0);

        if (result <= 3) {
            head.setText(mLibrary.getHead1(result));
            pic.setImageResource(mLibrary.getmSub1(result));
            des.setText(mLibrary.getDes1(result));
            //BomberSub
        }if (result == 4) {
            head.setText(mLibrary.getHead2(0));
            pic.setImageResource(mLibrary.getmSub2(0));
            des.setText(mLibrary.getDes2(0));
        }if (result == 5) {
            head.setText(mLibrary.getHead2(1));
            pic.setImageResource(mLibrary.getmSub2(1));
            des.setText(mLibrary.getDes2(1));
        }if (result == 5) {
            head.setText(mLibrary.getHead2(2));
            pic.setImageResource(mLibrary.getmSub2(2));
            des.setText(mLibrary.getDes2(2));
        }
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

}
