package com.cn.test.myapplication;//package com.mazhan.theone.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cn.test.myapplication.databinding.ActivityBingdingdataBinding;

/**
 * Created by dragonfly on 2017/5/24.
 */

public class BindingDataActivity extends BaseActivity implements UserFollowEvent {
    private TextView tv_1, tv_2;
    private Button btn;
    private Person person;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBingdingdataBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_bingdingdata);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        btn = (Button) findViewById(R.id.btn);
        person = new Person("年方几许", "姓甚名谁");
        person.setAge("年方几许");
        person.setName("姓甚名谁");
        binding.setPerson(person);
        binding.setMyHandlers(new MyHandlers(this,person.getAge()));
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                person.setAge("二十有八");
//                person.setName("曹阿瞒");
//            }
//        });
    }

    @Override
    public void follow(View view) {

    }

    @Override
    public void unFollow(View view) {

    }
}
