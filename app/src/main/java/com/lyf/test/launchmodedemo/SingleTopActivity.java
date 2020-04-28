package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SingleTopActivity extends BaseActivity {

    @BindView(R.id.btn_self)
    Button btnSelf;

    @BindView(R.id.btn_other)
    Button btnOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);
        ButterKnife.bind(this);
        btnSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, SingleTopActivity.class));
            }
        });
        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, OtherTopActivity.class));
//                startActivity(new Intent(SingleTopActivity.this, MainActivity.class));
            }
        });
    }
}
