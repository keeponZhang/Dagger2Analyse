package com.demo.lizejun.dagger2sample.scope.test2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.scope.bean.Pot;

import javax.inject.Inject;

public class MyScopeActivity2_1 extends AppCompatActivity {
    @Inject
    Pot pot;

    @Inject
    Pot pot2;


    @Inject
    Pot pot3;

    @Inject
    Pot pot4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scope2);
        DenpencyPotComponent2 potComponent2 = DaggerDenpencyPotComponent2.create();
        DaggerMyScope2Component.builder().denpencyPotComponent2(potComponent2).build().inject2(this);
        Log.e("TAG", "MyScopeActivity2   DaggerMyScope2Component  inject2:" + pot.show() + "  pot=" + pot);
        Log.e("TAG", "MyScopeActivity2 DaggerMyScope2Component  inject2:" + pot2.show() + "  pot2=" + pot2);

        DenpencyPotComponent2 potComponent3 = DaggerDenpencyPotComponent2.create();
        //这里如果用同一个potComponent2，四个pot的地址是一样的
        //这里如果用potComponent3，因为potComponent3跟potComponent2地址不一样，所以pot1，pot2一样，pot3，pot4一样，但是这两对是不一样的
        DaggerMyScope2_1Component.builder().denpencyPotComponent2(potComponent2).build().inject(this);
        Log.e("TAG", "MyScopeActivity2  DaggerMyScope2_1Component  inject2:" + pot3.show() + "  pot3=" + pot3);
        Log.e("TAG", "MyScopeActivity2 DaggerMyScope2_1Component   inject2:" + pot4.show() + "  pot4=" + pot4);
    }

    //	@Scope是需要成对存在的，在Module的Provide方法中使用了@Scope，那么对应的Component中也必须使用@Scope注解，当两边的@Scope名字一样时（比如同为@Singleton）, 那么该Provide方法提供的依赖将会在Component中保持“局部单例”。
    //	而在Component中标注@Scope，provide方法没有标注，那么这个Scope就不会起作用，而Component上的Scope的作用也只是为了能顺利通过编译，就像我刚刚定义的ActivityScope一样。


//	那么，我们如何使用Dagger2实现单例呢？
//	很简单，做到以下两点即可。
//	依赖在Component中是单例的（供该依赖的provide方法和对应的Component类使用同一个Scope注解。）
//	对应的Component在App中只初始化一次，每次注入依赖都使用这个Component对象。（在Application中创建该Component）

//	Scope是用来给开发者管理依赖的生命周期的，它可以让某个依赖在Component中保持 “局部单例”（唯一），如果将Component保存在Application中复用，则可以让该依赖在app中保持单例。
//	我们可以通过自定义不同的Scope注解来标记这个依赖的生命周期，所以命名是需要慎重考虑的。

//	作者：AItsuki
//	链接：https://www.jianshu.com/p/24af4c102f62

}
