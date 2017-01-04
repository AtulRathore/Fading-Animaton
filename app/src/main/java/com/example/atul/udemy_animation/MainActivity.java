package com.example.atul.udemy_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){

        //int count=0;
        ImageView bart = (ImageView) findViewById(R.id.imageView);
        ImageView homer = (ImageView) findViewById(R.id.imageView2);

        bart.animate().alpha(0f).setDuration(2000);
        homer.animate().alpha(1f).setDuration(2000);
        /*while (count<20){
            if(count%2==0){
                bart.animate().alpha(1f).setDuration(2000);
                homer.animate().alpha(0f).setDuration(2000);
                count++;
            }else{
                bart.animate().alpha(0f).setDuration(2000);
                homer.animate().alpha(1f).setDuration(2000);
                count++;
            }
        }*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
