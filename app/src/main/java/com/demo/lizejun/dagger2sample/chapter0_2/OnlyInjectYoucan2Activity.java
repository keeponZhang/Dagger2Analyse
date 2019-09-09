package com.demo.lizejun.dagger2sample.chapter0_2;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.demo.lizejun.dagger2sample.BaseActivity;
import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

public class OnlyInjectYoucan2Activity extends BaseActivity {
    @Inject
    LocalSource02 mLocalSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_inject);
        mTvText = (TextView) findViewById(R.id.tv_text);
        DaggerOnlyInjectYouCanComponent2.create().inject(this);

    }


    @Override
    protected String getData() {
        String data = mLocalSource.getData();
        Log.e("TAG", "OnlyInjectYoucan2Activity getData:" + data);
        return data;
    }
}
