package com.demo.lizejun.dagger2sample.chapter3_1;


import dagger.Component;

@Component( modules = FuModule.class)
public interface FuComponent {
    //父类注入的对象是FuComponentActivity
     void inject(FuComponentActivity activity);
     SubComponent getSubSourceComponent();
}
// FuComponent fuComponent = DaggerFuComponent.create();
//  1获取SubComponent。（一般来说，component实现类是单独生成的，而这个SubComponent则是通过fuComponent获得的，
//  其类生成也在DaggerFuSubComponent类中）
// SubComponent subSourceComponent = fuComponent.getSubSourceComponent();
//2.完成依赖注入。
//        subSourceComponent.inject(this);


//    private void initialize(final DaggerFuComponent.Builder builder) {
//
//        this.provideFuSourceProvider = FuModule_ProvideFuSourceFactory.create(builder.fuModule);
//
//        this.fuComponentActivityMembersInjector =
//                FuComponentActivity_MembersInjector.create(provideFuSourceProvider);
//    }

//跟前面一样，生成的DaggerFuComponent会生成etSubSourceComponent方法
//    @Override
//    public SubComponent getSubSourceComponent() {
//        return new DaggerFuComponent.SubComponentImpl();
//    }

//
//private final class SubComponentImpl implements SubComponent {
//    private MembersInjector<SubComponentActivity> subComponentActivityMembersInjector;
//
//    private SubComponentImpl() {
//        initialize();
//    }
//
//    @SuppressWarnings("unchecked")
//    private void initialize() {
//  可见subComponentActivityMembersInjector的构造函数传入的是DaggerFuComponent的module里方法生成的factory，
// 所以SubComponent可以使用父Component的moudle提供的实例
//        this.subComponentActivityMembersInjector =
//                SubComponentActivity_MembersInjector.create(
//                        DaggerFuComponent.this.provideLocalSourceProvider);
//    }
//
//    @Override
//    public void inject(SubComponentActivity activity) {
//        subComponentActivityMembersInjector.injectMembers(activity);
//    }
//}
