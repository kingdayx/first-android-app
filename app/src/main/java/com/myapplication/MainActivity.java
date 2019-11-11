package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private FunFactActivity funFactActivity = new FunFactActivity();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView mfactTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mfactTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);
        relativeLayout= (RelativeLayout)  findViewById((R.id.relativeLayout));

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String fact = funFactActivity.getFacts();
                int color = colorWheel.getColor();
                mfactTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
