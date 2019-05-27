package com.demo.lizejun.dagger2sample.chapter3;


import dagger.Component;

//SourceComponent依赖 DependencyComponent0
//被依赖Component可以注入依赖Component中module中提供的实例
@Component(dependencies = DependencyComponent0.class)
public interface SourceComponent0 {
     void inject(DependencyComponentActivity activity);
}
//1.实例化所依赖的Component。
// DependencyComponent0 dependencyComponent = DaggerDependencyComponent0.create();
//2.DaggerSourceComponent0没有create方法，只能通过builder创建，并且要传入依赖的Component（dependencyComponent0）不能为空
//		DaggerSourceComponent0.builder().dependencyComponent0(dependencyComponent).build().inject(this);


//SourceComponent的Builder类提供dependencyComponent0方法（方法名为类名第一个字母小写）
//创建DaggerSourceComponent0实例时，通过builder创建，必须传入依赖的component
// public Builder dependencyComponent0(DependencyComponent0 dependencyComponent0) {
//      this.dependencyComponent0 = Preconditions.checkNotNull(dependencyComponent0);
//      return this;
//    }


//     private void initialize(final DaggerSourceComponent0.Builder builder) {
//          this.getDependencySourceProvider =
//                  new DaggerSourceComponent0.com_demo_lizejun_dagger2sample_chapter3_DependencyComponent0_getDependencySource(
//                          builder.dependencyComponent0);
//通过getDependencySourceProvider来实现依赖注入,DaggerSourceComponent0.inject最终调用的是dependencyComponentActivityMembersInjectorin.jectMembers,调用的是getDependencySourceProvider.get
//          this.dependencyComponentActivityMembersInjector =
//                  DependencyComponentActivity_MembersInjector.create(getDependencySourceProvider);
//     }

//依赖的类和方法会生成一个类，构造函数是DependencyComponent0，其实这是一个factory， get方法拿的东西其实是通过构造函数传进来的dependencyComponent0调用它的getDependencySource,即dependencyComponent0.getDependencySource()
// dependencyComponent0.getDependencySource(),最终是所以来的compoent通过它的module的方法生成的factory来拿
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
