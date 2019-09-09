package com.demo.lizejun.dagger2sample.chapter4_2.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter4_2.activity.ScopeActivity;
import com.demo.lizejun.dagger2sample.chapter4_2.activity.ScopeActivityNormalData;
import com.demo.lizejun.dagger2sample.chapter4_2.activity.ScopeActivitySharedData;
import com.demo.lizejun.dagger2sample.chapter4_2.app.ScopeAppData;

import javax.inject.Inject;

public class ScopeFragment extends Fragment {

    private ScopeActivity mScopeActivity;

    @Inject
    ScopeAppData mScopeAppData;

    @Inject
    ScopeActivitySharedData mScopeActivitySharedData;

    @Inject
    ScopeActivityNormalData ScopeActivityNormalData;

    @Inject
    ScopeFragmentData mScopeFragmentData;
    @Inject
    ScopeFragmentData mScopeFragmentData2;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mScopeActivity = (ScopeActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_scope, container, false);
        mScopeActivity.getScopeActivityComponent().scopeFragmentComponent().inject(this);
        TextView tv = (TextView) rootView.findViewById(R.id.tv_scope_fragment);
        String result = "[ScopeFragment Space] \n mScopeAppData=" + mScopeAppData
                + "\n\n" + "mScopeActivitySharedData1=" + mScopeActivitySharedData
                + "\n\n" + "ScopeActivityNormalData1=" + ScopeActivityNormalData
                + "\n\n" + "mScopeFragmentData=" + mScopeFragmentData
                + "\n\n" + "mScopeFragmentData2=" + mScopeFragmentData2;
        tv.setText(result);
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
