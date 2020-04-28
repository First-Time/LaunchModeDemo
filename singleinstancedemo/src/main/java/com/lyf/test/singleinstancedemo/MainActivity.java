package com.lyf.test.singleinstancedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_instance)
    Button btnInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singleInstanceIntent = new Intent();
                singleInstanceIntent.setAction("com.lyf.test.singleinstancedemo");
                startActivity(singleInstanceIntent);
            }
        });
    }
}
