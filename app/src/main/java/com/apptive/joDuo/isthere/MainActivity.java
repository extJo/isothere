package com.apptive.joDuo.isthere;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.github.florent37.viewanimator.ViewAnimator;
import com.jaredrummler.android.widget.AnimatedSvgView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 로고 애니메이션
        AnimatedSvgView svgView = (AnimatedSvgView) findViewById(R.id.animated_svg_view);
        svgView.start();

        // 일정시간 이후에 자동으로 화면 전환
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ReviewMain.class);
                startActivity(intent);
                finish();
            }
        }, 3000); // 3000ms
    }
}
