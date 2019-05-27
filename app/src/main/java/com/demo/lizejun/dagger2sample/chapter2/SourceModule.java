package com.demo.lizejun.dagger2sample.chapter2;

import dagger.Module;
import dagger.Provides;

@Module
public class SourceModule {
    //会出现依赖注入迷失
    //这是因为Dagger2在寻找mLocalSource的创建方法时，它会去Component关联的Module中
    // （也就是SourceModule）寻找返回类型为Source的方法，但是在SourceModule中，provideLocalSource / providerRemoteSource这两个方法返回的类型都为Source，
    // 导致无法确定使用哪个方法来创建mLocalSource。
    //一般来说，使用@Qulifier是比较标准的方式

    @Provides
    @Local//解决依赖迷失，module跟实例化的地方的Qualifier需要配对（这里是用创建别名的方法，也可以用@Named）
//    @Named("Local")
    public Source provideLocalSource() {
        return new LocalSource();
    }

    @Provides
    @Remote
//    @Named("Remote") //@Named的话不需要重新定义注解
    public Source providerRemoteSource() {
        return new RemoteSource();
    }
}


