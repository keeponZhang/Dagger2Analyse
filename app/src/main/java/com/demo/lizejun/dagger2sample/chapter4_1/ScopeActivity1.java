package com.demo.lizejun.dagger2sample.chapter4_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

public class ScopeActivity1 extends AppCompatActivity {

    private static final String TAG = ScopeActivity1.class.getSimpleName();

    private ScopeActivityComponent1 mScopeActivityComponent;


    @Inject
    ScopeActivitySharedData1 mScopeActivitySharedData1;

    @Inject
    ScopeActivitySharedData1 mScopeActivitySharedData2;

    @Inject
    ScopeActivityNormalData1 mScopeActivityNormalData1;

    @Inject
    ScopeActivityNormalData1 mScopeActivityNormalData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scope_only);
        getScopeActivityComponent().inject(this);
        TextView tvData = (TextView) findViewById(R.id.tv_scope_activity);
        String result = "[ScopeActivity1 Space] \n ="
                + "\n\n" + "mScopeActivitySharedData1=" + mScopeActivitySharedData1
                + "\n\n" + "mScopeActivitySharedData2=" + mScopeActivitySharedData2
                + "\n\n" + "mScopeActivityNormalData1=" + mScopeActivityNormalData1
                + "\n\n" + "mScopeActivityNormalData2=" + mScopeActivityNormalData2;
        tvData.setText(result);
    }

    public ScopeActivityComponent1 getScopeActivityComponent() {
        if (mScopeActivityComponent == null) {
            mScopeActivityComponent = DaggerScopeActivityComponent1.create();
        }
        return mScopeActivityComponent;
    }
}
