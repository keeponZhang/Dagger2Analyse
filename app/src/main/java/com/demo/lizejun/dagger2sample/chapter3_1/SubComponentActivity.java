package com.demo.lizejun.dagger2sample.chapter3_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

public class SubComponentActivity extends AppCompatActivity {

    private static final String TAG = SubComponentActivity.class.getSimpleName();

    @Inject
    FuSource mFuSubSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_sub);
        //2.获取父Component
        FuComponent fuComponent = DaggerFuComponent.create();
        //3.获取SubComponent。（一般来说，component实现类是单独生成的，而这个SubComponent则是通过fuComponent获得的，
        // 其类生成也在DaggerFuSubComponent类中）
        SubComponent subSourceComponent = fuComponent.getSubSourceComponent();
        //4.完成依赖注入。
        subSourceComponent.inject(this);

        Button viewById = (Button) findViewById(R.id.sub);
        viewById.setText(viewById.getText()+": "+mFuSubSource.getData());

    }
}
