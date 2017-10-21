package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SingleTopActivity extends BaseActivity {

    @InjectView(R.id.button6)
    Button button;

    @InjectView(R.id.button10)
    Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        ButterKnife.inject(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, SingleTopActivity.class));
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, OtherTopActivity.class));
            }
        });
    }
}
