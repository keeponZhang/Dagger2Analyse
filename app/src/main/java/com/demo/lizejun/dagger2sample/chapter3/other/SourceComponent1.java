package com.demo.lizejun.dagger2sample.chapter3.other;


import com.demo.lizejun.dagger2sample.chapter3.DependencyComponent0;

import dagger.Component;

//SourceComponent依赖 DependencyComponent0
@Component(dependencies = {DependencyComponent0.class,DependencyComponent1.class})
public interface SourceComponent1 {
     void inject(DependencyComponentActivity2 activity);
}

//SourceComponent的Builder类提供dependencyComponent0方法
// public Builder dependencyComponent0(DependencyComponent0 dependencyComponent0) {
//      this.dependencyComponent0 = Preconditions.checkNotNull(dependencyComponent0);
//      return this;
//    }


//     private void initialize(final DaggerSourceComponent0.Builder builder) {
//          this.getDependencySourceProvider =
//                  new DaggerSourceComponent0.com_demo_lizejun_dagger2sample_chapter3_DependencyComponent0_getDependencySource(
//                          builder.dependencyComponent0);
//通过getDependencySourceProvider来实现依赖注入
//          this.dependencyComponentActivityMembersInjector =
//                  DependencyComponentActivity_MembersInjector.create(getDependencySourceProvider);
//     }

//依赖的类和方法会生成一个类，构造函数是DependencyComponent0，其实这是一个factory， get方法拿的东西其实是通过构造函数传进来的dependencyComponent0调用它的getDependencySource
//class com_demo_lizejun_dagger2sample_chapter3_DependencyComponent0_getDependencySource
//        implements Provider<DependencySource0> {
//     private final DependencyComponent0 dependencyComponent0;
//
//     com_demo_lizejun_dagger2sample_chapter3_DependencyComponent0_getDependencySource(
//             DependencyComponent0 dependencyComponent0) {
//          this.dependencyComponent0 = dependencyComponent0;
//     }
//
//     @Override
//     public DependencySource0 get() {
//          return Preconditions.checkNotNull(
//                  dependencyComponent0.getDependencySource(),
//                  "Cannot return null from a non-@Nullable component method");
//     }
//}
