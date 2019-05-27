package com.demo.lizejun.dagger2sample.chapter1;

import dagger.Module;
import dagger.Provides;

@Module
public class RemoteSourceModule {

    @Provides
    public RemoteSource provideRemoteSourcetest() {
        return new RemoteSource("module");
    }


}
