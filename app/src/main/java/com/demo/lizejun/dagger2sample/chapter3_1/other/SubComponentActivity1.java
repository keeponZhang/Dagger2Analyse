package com.demo.lizejun.dagger2sample.chapter3_1.other;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.demo.lizejun.dagger2sample.R;

public class SubComponentActivity1 extends AppCompatActivity {

    private static final String TAG = SubComponentActivity1.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_sub);


    }
}
