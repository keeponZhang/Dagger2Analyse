package com.demo.lizejun.dagger2sample.chapter1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;


public class YouXianjiActivity extends AppCompatActivity {

	private static final String TAG = YouXianjiActivity.class.getSimpleName();
	private              Button mBtnGetNetData;
	@Inject
	RemoteSource mRemoteSource;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_repository);
		DaggerSourceComponent.create().inject(this);

		mBtnGetNetData = (Button) findViewById(R.id.bt_get_net_data);
		mBtnGetNetData.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String data = mRemoteSource.getData();
				Toast.makeText(YouXianjiActivity.this, data, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
