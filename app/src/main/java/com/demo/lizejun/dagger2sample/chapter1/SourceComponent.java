package com.demo.lizejun.dagger2sample.chapter1;

import dagger.Component;

@Component(modules = {RemoteSourceModule.class})
//@Component()
public interface SourceComponent {
     void inject(YouXianjiActivity youXianjiActivity);
}
//无module
//    private void initialize(final DaggerSourceComponent.Builder builder) {
//        this.youXianjiActivityMembersInjector =
//                YouXianjiActivity_MembersInjector.create(RemoteSource_Factory.create());
//    }

//有module
//private void initialize(final DaggerSourceComponent.Builder builder) {
//     this.provideRemoteSourcetestProvider =
//             RemoteSourceModule_ProvideRemoteSourcetestFactory.create(builder.remoteSourceModule);
//     this.youXianjiActivityMembersInjector =
//             YouXianjiActivity_MembersInjector.create(provideRemoteSourcetestProvider);
//}
//可见，module 是优先的
