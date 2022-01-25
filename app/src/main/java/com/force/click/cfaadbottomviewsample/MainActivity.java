package com.force.click.cfaadbottomviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.clickforce.ad.AdBottomView;
import com.clickforce.ad.Listener.AdBottomListener;

public class MainActivity extends AppCompatActivity {
    private AdBottomView adBottomView;
    private String TAG = "ClickForce";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adBottomView = (AdBottomView) findViewById(R.id.adBottom);
        adBottomView.getAd(13117,true);
        adBottomView.setOnAdBottomViewListener(new AdBottomListener() {
            @Override
            public void OnAdBottomLoadSuccess() {
                Log.i(TAG, "OnAdBottomLoadSuccess");
                adBottomView.show();
            }

            @Override
            public void OnAdBottomLoadFail() {
                Log.i(TAG, "OnAdBottomLoadFail");
            }

            @Override
            public void OnAdBottomClick() {
                Log.i(TAG, "OnAdBottomClick");
            }

            @Override
            public void OnAdBottomClose() {
                Log.i(TAG, "OnAdBottomClose");
            }
        });
    }
}