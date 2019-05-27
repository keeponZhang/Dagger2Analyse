package com.demo.lizejun.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_main);
        List<String> titles = new ArrayList<>();
        titles.add("(0)  OnlyInject 构造函数无参");
        titles.add("(1)  OnlyInject module 直接实例化");
        titles.add("(2)  OnlyInject module 提供参数");
        titles.add("(3)   使用 @Inject 和 @Module 优先级");
        titles.add("(4)  依赖迷失");
        titles.add("(5) dependency");
        titles.add("(3) 依赖、包含方式");
        titles.add("(4) @Scope only scope");
        titles.add("(4) @Scope");
        titles.add("(5) Android 支持库");
        MainAdapter mainAdapter = new MainAdapter(titles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mainAdapter);
    }
}
