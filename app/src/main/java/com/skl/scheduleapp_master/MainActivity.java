package com.skl.scheduleapp_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.nukc.stateview.StateView;

public class MainActivity extends AppCompatActivity {
    private StateView stateView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stateView = StateView.inject(this, R.layout.skeletona);
        stateView.setAnimatorProvider(new RotateAnimatorProvider());
        stateView.showLoading();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(
                        new Runnable() {
                            @Override
                            public void run() {
                                stateView.showContent();
                            }
                        }
                );
            }
        }).start();
    }
}
