package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_standard)
    Button btnStandard;

    @BindView(R.id.btn_top)
    Button btnTop;

    @BindView(R.id.btn_task)
    Button btnTask;

    @BindView(R.id.btn_instance)
    Button btnInstance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        actionBar.setDisplayHomeAsUpEnabled(false);

        btnStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StandardActivity.class));
            }
        });
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SingleTopActivity.class));
            }
        });
        btnTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SingleTaskActivity.class));
            }
        });
        btnInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent singleInstanceIntent = new Intent();
//                singleInstanceIntent.setAction("com.lyf.test.singleinstancedemo");
//                startActivity(singleInstanceIntent);

                startActivity(new Intent(MainActivity.this, SingleInstanceActivity.class));
            }
        });
    }
}
