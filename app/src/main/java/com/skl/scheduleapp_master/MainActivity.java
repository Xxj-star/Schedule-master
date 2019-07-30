package com.skl.scheduleapp_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.nukc.stateview.StateView;

public class MainActivity extends AppCompatActivity {
    private StateView stateView;
    private ImageView dataImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataImage = findViewById(R.id.dataImage);
        stateView = StateView.inject(this, R.layout.skeletona);
        stateView.setAnimatorProvider(new RotateAnimatorProvider());
        stateView.showLoading();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(
                        new Runnable() {
                            @Override
                            public void run() {
                                stateView.showContent();
                                dataImage.setVisibility(View.VISIBLE);
                            }
                        }
                );
            }
        }).start();
    }
}
