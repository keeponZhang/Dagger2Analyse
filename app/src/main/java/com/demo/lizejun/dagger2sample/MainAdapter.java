package com.demo.lizejun.dagger2sample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.lizejun.dagger2sample.chapter0.OnlyInjectActivity;
import com.demo.lizejun.dagger2sample.chapter0_1.OnlyInjectYoucanActivity;
import com.demo.lizejun.dagger2sample.chapter0_2.OnlyInjectYoucan2Activity;
import com.demo.lizejun.dagger2sample.chapter1.YouXianjiActivity;
import com.demo.lizejun.dagger2sample.chapter2.QualifierActivity;
import com.demo.lizejun.dagger2sample.chapter3.DependencyComponentActivity;
import com.demo.lizejun.dagger2sample.chapter3_1.SubComponentActivity;
import com.demo.lizejun.dagger2sample.chapter4_0.test4.ComplextActivity;
import com.demo.lizejun.dagger2sample.chapter4_2.activity.ScopeActivity;
import com.demo.lizejun.dagger2sample.chapter4_0.test0.MyScopeActivity0;
import com.demo.lizejun.dagger2sample.chapter4_0.test1.MyScopeActivity1;
import com.demo.lizejun.dagger2sample.chapter4_0.test2.MyScopeActivity2;
import com.demo.lizejun.dagger2sample.chapter4_0.test3.MyScopeActivity3;
import com.demo.lizejun.dagger2sample.chapter5.HomeActivity;
import com.demo.lizejun.dagger2sample.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<String> mTitles = new ArrayList<>();


    public MainAdapter(List<String> titles) {
        mTitles = titles;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_main_item, parent, false);
        return new MainViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(final MainViewHolder holder, int position) {
        final String title = mTitles.get(position);
        TextView titleView = holder.mTvTitle;
        titleView.setText(title);
        titleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (holder.getAdapterPosition()) {
                    case 0:
                        Utils.startActivity(v.getContext(), OnlyInjectActivity.class);
                        break;
                    case 1:
                        Utils.startActivity(v.getContext(), OnlyInjectYoucanActivity.class);
                        break;
                    case 2:
                        Utils.startActivity(v.getContext(), OnlyInjectYoucan2Activity.class);
                        break;
                    case 3:
                        Utils.startActivity(v.getContext(), YouXianjiActivity.class);
                        break;
                    case 4:
                        Utils.startActivity(v.getContext(),QualifierActivity.class);
                        break;
                    case 5:
                        Utils.startActivity(v.getContext(),DependencyComponentActivity.class);
                        break;
                    case 6:
                        Utils.startActivity(v.getContext(), SubComponentActivity.class);
                        break;
                    case 7:
                        Utils.startActivity(v.getContext(), MyScopeActivity0.class);
                        break;
                    case 8:
                        Utils.startActivity(v.getContext(), MyScopeActivity1.class);
                        break;
                    case 9:
                        Utils.startActivity(v.getContext(), MyScopeActivity2.class);
                        break;
                    case 10:
                        Utils.startActivity(v.getContext(), MyScopeActivity3.class);
                        break;
                    case 11:
                        Utils.startActivity(v.getContext(), ScopeActivity.class);
                        break;
                    case 12:
                        Utils.startActivity(v.getContext(), ComplextActivity.class);
                        break;
                    case 61:
                        Utils.startActivity(v.getContext(), HomeActivity.class);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTitles.size();
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {

        public TextView mTvTitle;

        public MainViewHolder(View rootView) {
            super(rootView);
            mTvTitle = (TextView) rootView.findViewById(R.id.tv_title);
        }
    }
}
