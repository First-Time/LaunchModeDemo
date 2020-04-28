package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OtherInstanceActivity extends BaseActivity {

    @BindView(R.id.btn_self)
    Button btnSelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_instance);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_self)
    public void onClick() {
        startActivity(new Intent(this, SingleInstanceActivity.class));
    }
}
