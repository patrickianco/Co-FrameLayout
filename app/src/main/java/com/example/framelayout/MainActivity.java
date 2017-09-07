package com.example.framelayout;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView thriftboxImg, starImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.changeBtn);
        thriftboxImg = (ImageView) findViewById(R.id.thriftboxImg);
        starImg = (ImageView) findViewById(R.id.starImg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(thriftboxImg.getVisibility() == View.VISIBLE){
                    thriftboxImg.setVisibility(View.GONE);
                    starImg.setVisibility(View.VISIBLE);
                }
                else if(starImg.getVisibility() == View.VISIBLE){
                    starImg.setVisibility(View.GONE);
                    thriftboxImg.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}
