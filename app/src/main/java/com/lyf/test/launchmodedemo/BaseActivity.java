package com.lyf.test.launchmodedemo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

public class BaseActivity extends AppCompatActivity {

    protected ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Log.i("LaunchMode", "onCreate：" + getLocalClassName() + "    TaskId: " + getTaskId() + "    hasCode：" + this.hashCode());
        dumpTaskAffinity();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("LaunchMode", "onNewIntent：" + getLocalClassName() + " TaskId：" + getTaskId() + " hasCode：" + this.hashCode());
        dumpTaskAffinity();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LaunchMode", "onStart：" + getLocalClassName() + "    TaskId: " + getTaskId() + "    hasCode：" + this.hashCode());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LaunchMode", "onResume：" + getLocalClassName() + "    TaskId: " + getTaskId() + "    hasCode：" + this.hashCode());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LaunchMode", "onPause：" + getLocalClassName() + "    TaskId: " + getTaskId() + "    hasCode：" + this.hashCode());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LaunchMode", "onStop：" + getLocalClassName() + "    TaskId: " + getTaskId() + "    hasCode：" + this.hashCode());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LaunchMode", "onDestroy：" + getLocalClassName() + "    TaskId: " + getTaskId() + "    hasCode：" + this.hashCode());
    }

    protected void dumpTaskAffinity() {
        try {
            ActivityInfo info = this.getPackageManager()
                    .getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.i("LaunchMode", "taskAffinity：" + info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
