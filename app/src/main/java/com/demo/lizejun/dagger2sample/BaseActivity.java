package com.demo.lizejun.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * createBy	 keepon
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected  TextView mTvText;

    public void getData(View view) {
        String data = getData();
        if(mTvText!=null){
            mTvText.setText(data);
        }

    }

    abstract  protected String getData();
}
