package com.demo.lizejun.dagger2sample.chapter1;



import javax.inject.Inject;

public class DataRepository {

//	@Inject
//	LocalSource mLocalSource;
//
//	public String getData() {
//		return mLocalSource.getData();
//	}

		    @Inject
		    RemoteSource mRemoteSource;
			public String getNetData() {
				return mRemoteSource.getData();
			}

	public DataRepository() {
		DaggerSourceComponent.create().inject(this);
	}


}
