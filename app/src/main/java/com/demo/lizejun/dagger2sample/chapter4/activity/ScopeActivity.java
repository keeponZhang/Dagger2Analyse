package com.demo.lizejun.dagger2sample.chapter4.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter4.app.ScopeApp;
import com.demo.lizejun.dagger2sample.chapter4.app.ScopeAppComponent;
import com.demo.lizejun.dagger2sample.chapter4.app.ScopeAppData;
import com.demo.lizejun.dagger2sample.chapter4.my.MyRepository;

import javax.inject.Inject;

public class ScopeActivity extends AppCompatActivity {

    private static final String TAG = ScopeActivity.class.getSimpleName();

    private ScopeActivityComponent mScopeActivityComponent;

    @Inject
    ScopeAppData mScopeAppData;

    @Inject
    ScopeActivitySharedData mScopeActivitySharedData1;

    @Inject
    ScopeActivitySharedData mScopeActivitySharedData2;

    @Inject
    ScopeActivityNormalData mScopeActivityNormalData1;

    @Inject
    ScopeActivityNormalData mScopeActivityNormalData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scope);
        //为  @Inject的成员赋值
        getScopeActivityComponent().inject(this);
        TextView tvData = (TextView) findViewById(R.id.tv_scope_activity);
        String result = "[ScopeActivity1 Space] \n mScopeAppData=" + mScopeAppData
                + "\n\n" + "mScopeActivitySharedData1=" + mScopeActivitySharedData1
                + "\n\n" + "mScopeActivitySharedData2=" + mScopeActivitySharedData2
                + "\n\n" + "mScopeActivityNormalData1=" + mScopeActivityNormalData1
                + "\n\n" + "mScopeActivityNormalData2=" + mScopeActivityNormalData2;
        tvData.setText(result);
    }

    public ScopeActivityComponent getScopeActivityComponent() {
        if (mScopeActivityComponent == null) {
            ScopeAppComponent scopeAppComponent = ((ScopeApp) getApplication()).getAppComponent();
            //DaggerScopeActivityComponent依赖scopeAppComponent，不调用.scopeAppComponent(scopeAppComponent)会报错。
            mScopeActivityComponent = DaggerScopeActivityComponent.builder().scopeAppComponent(scopeAppComponent).build();
        }
        return mScopeActivityComponent;
    }

    public void getMyData(View view) {
        MyRepository myRepository = new MyRepository();
        mScopeActivityComponent.scopeMyRepositoryComponent().inject(myRepository);
        Log.e(TAG, "getMyData myRepository:"+myRepository+"  myRepository.getMyData="+myRepository.getMyData());
    }
}
