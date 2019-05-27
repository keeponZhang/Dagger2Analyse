package com.demo.lizejun.dagger2sample.chapter3_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

public class FuComponentActivity extends AppCompatActivity {


    @Inject
    FuSource mLocalSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_fu);
    }
    public void fu(View view) {
    }
}
