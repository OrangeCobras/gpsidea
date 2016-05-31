package com.example.bestizer.gpsidea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.gms.maps.model.LatLng;


public class MainActivity extends AppCompatActivity {

    ImageButton map;
    ImageButton train;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        train = (ImageButton) this.findViewById(R.id.imageButton);
        map = (ImageButton)this.findViewById(R.id.imageButton2);

        map.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                i.putExtra("Latit", 52);
                i.putExtra("Longit", 5);
                startActivity(i);

            }
        });

        /*
        train.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, StationChoiceActivity.class);
                startActivity(i);

            }
        });
        */
    }

}
