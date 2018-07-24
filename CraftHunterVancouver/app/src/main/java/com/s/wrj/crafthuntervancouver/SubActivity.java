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
        //stanley
        if (result <= 3) {
            head.setText(mLibrary.getHead1(result));
            pic.setImageResource(mLibrary.getmSub1(result));
            des.setText(mLibrary.getDes1(result));
            //BomberSub
        }
        if (result == 4) {
            head.setText(mLibrary.getHead2(0));
            pic.setImageResource(mLibrary.getmSub2(0));
            des.setText(mLibrary.getDes2(0));
        }
        if (result == 5) {
            head.setText(mLibrary.getHead2(1));
            pic.setImageResource(mLibrary.getmSub2(1));
            des.setText(mLibrary.getDes2(1));
        }
        if (result == 6) {
            head.setText(mLibrary.getHead2(2));
            pic.setImageResource(mLibrary.getmSub2(2));
            des.setText(mLibrary.getDes2(2));
            //acres sub
        }
        if (result == 7) {
            head.setText(mLibrary.getHead4(0));
            pic.setImageResource(mLibrary.getSub4(0));
            des.setText(mLibrary.getDes4(0));
        }
        if (result == 8) {
            head.setText(mLibrary.getHead4(1));
            pic.setImageResource(mLibrary.getmSub2(1));
            des.setText(mLibrary.getDes4(1));
        }if (result == 9) {
            head.setText(mLibrary.getHead4(2));
            pic.setImageResource(mLibrary.getSub4(2));
            des.setText(mLibrary.getDes4(2));


            //andin
        }
        if (result == 10) {
            head.setText(mLibrary.getHead5(0));
            pic.setImageResource(mLibrary.getSub5(0));
            des.setText(mLibrary.getDes5(0));
        }
        if (result == 11) {
            head.setText(mLibrary.getHead5(1));
            pic.setImageResource(mLibrary.getSub5(1));
            des.setText(mLibrary.getDes5(1));
        }
        if (result == 12) {
            head.setText(mLibrary.getHead5(2));
            pic.setImageResource(mLibrary.getSub5(2));
            des.setText(mLibrary.getDes5(2));
        }if (result == 13) {
            head.setText(mLibrary.getHead5(3));
            pic.setImageResource(mLibrary.getSub5(3));
            des.setText(mLibrary.getDes5(3));
        }

        //bigrock

        if (result == 14) {
            head.setText(mLibrary.getHead6(0));
            pic.setImageResource(mLibrary.getSub6(0));
            des.setText(mLibrary.getDes6(0));
        }
        if (result == 15) {
            head.setText(mLibrary.getHead6(1));
            pic.setImageResource(mLibrary.getSub6(1));
            des.setText(mLibrary.getDes6(1));
        }
        if (result == 16) {
            head.setText(mLibrary.getHead6(2));
            pic.setImageResource(mLibrary.getSub6(2));
            des.setText(mLibrary.getDes6(2));
        }if (result == 17) {
            head.setText(mLibrary.getHead6(3));
            pic.setImageResource(mLibrary.getSub6(3));
            des.setText(mLibrary.getDes6(3));
        }
        //mainstreet
        if (result == 18) {
            head.setText(mLibrary.getHead7(0));
            pic.setImageResource(mLibrary.getSub7(0));
            des.setText(mLibrary.getDes7(0));
        }
        if (result == 19) {
            head.setText(mLibrary.getHead7(1));
            pic.setImageResource(mLibrary.getSub7(1));
            des.setText(mLibrary.getDes7(1));
        }
        if (result == 20) {
            head.setText(mLibrary.getHead7(2));
            pic.setImageResource(mLibrary.getSub7(2));
            des.setText(mLibrary.getDes7(2));
        }if (result == 21) {
            head.setText(mLibrary.getHead7(3));
            pic.setImageResource(mLibrary.getSub7(3));
            des.setText(mLibrary.getDes7(3));
        }if (result == 22) {
            head.setText(mLibrary.getHead8(0));
            pic.setImageResource(mLibrary.getSub8(0));
            des.setText(mLibrary.getDes8(0));
        }
        if (result == 23) {
            head.setText(mLibrary.getHead8(1));
            pic.setImageResource(mLibrary.getSub8(1));
            des.setText(mLibrary.getDes8(1));
        }
        if (result == 24) {
            head.setText(mLibrary.getHead8(2));
            pic.setImageResource(mLibrary.getSub8(2));
            des.setText(mLibrary.getDes8(2));
        }if (result == 25) {
            head.setText(mLibrary.getHead8(3));
            pic.setImageResource(mLibrary.getSub8(3));
            des.setText(mLibrary.getDes8(3));
        }if (result == 26) {
            head.setText(mLibrary.getHead9(0));
            pic.setImageResource(mLibrary.getSub9(0));
            des.setText(mLibrary.getDes9(0));
        }
        if (result == 27) {
            head.setText(mLibrary.getHead9(1));
            pic.setImageResource(mLibrary.getSub9(1));
            des.setText(mLibrary.getDes9(1));
        }
        if (result == 28) {
            head.setText(mLibrary.getHead9(2));
            pic.setImageResource(mLibrary.getSub9(2));
            des.setText(mLibrary.getDes9(2));
        }if (result == 29) {
            head.setText(mLibrary.getHead9(3));
            pic.setImageResource(mLibrary.getSub9(3));
            des.setText(mLibrary.getDes9(3));
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
