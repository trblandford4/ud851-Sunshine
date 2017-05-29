package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherDetailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDetailTextView = (TextView) findViewById(R.id.tv_weather_data_detail);

        String weatherDetail = "Weather detail from intent";
        Intent launcherIntent = getIntent();
        if(launcherIntent.hasExtra(Intent.EXTRA_TEXT)) {
            weatherDetail = launcherIntent.getStringExtra(Intent.EXTRA_TEXT);
        }

        mWeatherDetailTextView.setText(weatherDetail);
    }
}