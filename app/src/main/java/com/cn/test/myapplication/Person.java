package com.cn.test.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

/**
 * Created by dragonfly on 2017/6/5.
 */

public class Person extends BaseObservable {
    private @Bindable
    String name;
    private @Bindable String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.cn.test.myapplication.BR.name);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(com.cn.test.myapplication.BR.age);
    }
    public void onBtnClick(View view) {

    }
}
