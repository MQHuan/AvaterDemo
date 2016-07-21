package com.example.mqh.avaterdemo;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avatar = (ImageView) findViewById(R.id.avatar);
        avatar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Rect rect = AnimationUtils.getBitmapRectFromImageView(avatar);
        UserAvatarDialog dialog = UserAvatarDialog.newInstance("", rect);
        dialog.show(getSupportFragmentManager(), "");

    }
}
