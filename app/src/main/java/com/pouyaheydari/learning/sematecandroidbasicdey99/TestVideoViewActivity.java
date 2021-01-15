package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class TestVideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        String url = "https://hajifirouz2.cdn.asset.aparat.com/aparat-video/7b9787e011e2b8e63d7f289d2c94961028971560-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6ImM0OGU2MWFmZDU5YjE5YzEwM2M0MTdjYzBlNjRiZDdiIiwiZXhwIjoxNjEwNzMzNTExLCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.JJeupNRNwFeXIlr0w90neWBPuIta57QiReUZHrOHRz0";
        VideoView video = findViewById(R.id.video);
        video.setVideoURI(Uri.parse(url));
        video.setMediaController(new MediaController(TestVideoViewActivity.this));
        video.start();
    }
}