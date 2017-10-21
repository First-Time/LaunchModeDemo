package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SingleInstanceActivity extends BaseActivity {

    @InjectView(R.id.button8)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
        ButterKnife.inject(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singleInstanceIntent = new Intent();
                singleInstanceIntent.setAction("com.lyf.test.singleinstancedemo");
                startActivity(singleInstanceIntent);
            }
        });
    }
}
