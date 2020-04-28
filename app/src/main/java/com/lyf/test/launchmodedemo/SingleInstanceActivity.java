package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SingleInstanceActivity extends BaseActivity {

    @BindView(R.id.btn_self)
    Button btnSelf;
    @BindView(R.id.btn_other)
    Button btnOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
        ButterKnife.bind(this);
        btnSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singleInstanceIntent = new Intent();
                singleInstanceIntent.setAction("com.lyf.test.singleinstancedemo");
                startActivity(singleInstanceIntent);
            }
        });

        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingleInstanceActivity.this, OtherInstanceActivity.class));
//                startActivity(new Intent(SingleInstanceActivity.this, MainActivity.class));
            }
        });
    }
}
