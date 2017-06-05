package com.cn.test.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by dragonfly on 2017/6/5.
 */

public class MyHandlers {
    private String inputstr;
    MyHandlers(Context context,String str){
        this.inputstr=str;

    }
    public void onClickView(View view){
        Toast.makeText(view.getContext(), inputstr, Toast.LENGTH_SHORT).show();
    };
}
