package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OtherTopActivity extends BaseActivity {

    @BindView(R.id.btn_self)
    Button btnSelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_top);
        ButterKnife.bind(this);
        btnSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherTopActivity.this, SingleTopActivity.class));
            }
        });
    }
}
