package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SingleTaskActivity extends BaseActivity {

    @InjectView(R.id.button7)
    Button button;

    @InjectView(R.id.button12)
    Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
        ButterKnife.inject(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskActivity.this, SingleTaskActivity.class));
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskActivity.this, OtherTaskActivity.class));
            }
        });
    }
}
