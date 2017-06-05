package com.cn.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by chiclaim on 2016/02/18
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayUseLogoEnabled(false);
        }
    }

    /**
     * 显示加载对话框
     */
    public void showLoadingDialog() {
    }

    /**
     * 隐藏加载对话框
     */
    public void hideLoadingDialog() {
    }

    public void launchActivity(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
