package com.example.designpattern1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.designpattern.R;
import com.example.designpattern.databinding.ActivityMainBinding;
import com.example.designpattern1.adapter.AdapterActivity;
import com.example.designpattern1.bridge.BridgeActivity;
import com.example.designpattern1.builder.BuilderActivity;
import com.example.designpattern1.chainofresponsibility.ChainOfResponsibilityActivity;
import com.example.designpattern1.command.CommandActivity;
import com.example.designpattern1.composite.CompositeActivity;
import com.example.designpattern1.decorator.DecoratorActivity;
import com.example.designpattern1.facade.FacadeActivity;
import com.example.designpattern1.factory.FactoryActivity;
import com.example.designpattern1.flyweight.FlyweightActivity;
import com.example.designpattern1.interpreter.InterpreterActivity;
import com.example.designpattern1.iterator.IteratorActivity;
import com.example.designpattern1.mediator.MediatorActivity;
import com.example.designpattern1.memento.MementoActivity;
import com.example.designpattern1.observer.ObserverActivity;
import com.example.designpattern1.prototype.PrototypeActivity;
import com.example.designpattern1.proxy.ProxyActivity;
import com.example.designpattern1.singleton.SingletonActivity;
import com.example.designpattern1.state.StateActivity;
import com.example.designpattern1.strategy.StrategyActivity;
import com.example.designpattern1.templatemethod.TemplateMethodActivity;
import com.example.designpattern1.visitor.VisitorActivity;

import java.util.Arrays;

import me.jingbin.library.ByRecyclerView;
import me.jingbin.library.adapter.BaseByViewHolder;
import me.jingbin.library.adapter.BaseRecyclerAdapter;
import me.jingbin.library.decoration.GridSpaceItemDecoration;

/**
 * Created by test on 2016/10/21.
 * <p>
 * 源代码：https://github.com/youlookwhat/DesignPattern
 * 源代码：https://github.com/wh1992-github/DesignPattern
 * 创建型模式：单例模式、建造者模式、工厂模式、原型模式
 * 结构型模式：适配器模式、桥接模式、装饰者模式、组合模式、外观模式、享元模式、代理模式
 * 行为型模式：模板方法模式、命令模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式、状态模式、策略模式、责任链模式、访问者模式。
 * <p>
 * 单例（Singleton）模式：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
 * 原型（Prototype）模式：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
 * 工厂方法（Factory Method）模式：定义一个用于创建产品的接口，由子类决定生产什么产品。
 * 抽象工厂（AbstractFactory）模式：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。
 * 建造者（Builder）模式：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。
 * 代理（Proxy）模式：为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。
 * 适配器（Adapter）模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 * 桥接（Bridge）模式：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 * 装饰（Decorator）模式：动态的给对象增加一些职责，即增加其额外的功能。
 * 外观（Facade）模式：为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。
 * 享元（Flyweight）模式：运用共享技术来有效地支持大量细粒度对象的复用。
 * 组合（Composite）模式：将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。
 * 模板方法（TemplateMethod）模式：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
 * 策略（Strategy）模式：定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。
 * 命令（Command）模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
 * 职责链（Chain of Responsibility）模式：把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。
 * 状态（State）模式：允许一个对象在其内部状态发生改变时改变其行为能力。
 * 观察者（Observer）模式：多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。
 * 中介者（Mediator）模式：定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。
 * 迭代器（Iterator）模式：提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * 访问者（Visitor）模式：在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。
 * 备忘录（Memento）模式：在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
 * 解释器（Interpreter）模式：提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。
 */

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] patterns = {
            "观察者模式", "工厂模式",
            "单例模式", "策略模式",
            "适配器模式", "命令模式",
            "装饰者模式", "外观模式",
            "模板方法模式", "状态模式",
            "建造者模式", "原型模式",
            "享元模式", "代理模式",
            "桥接模式", "组合模式",
            "迭代器模式", "中介者模式",
            "备忘录模式", "解释器模式",
            "责任链模式", "访问者模式"
    };
    private Class[] classes = {
            ObserverActivity.class, FactoryActivity.class,
            SingletonActivity.class, StrategyActivity.class,
            AdapterActivity.class, CommandActivity.class,
            DecoratorActivity.class, FacadeActivity.class,
            TemplateMethodActivity.class, StateActivity.class,
            BuilderActivity.class, PrototypeActivity.class,
            FlyweightActivity.class, ProxyActivity.class,
            BridgeActivity.class, CompositeActivity.class,
            IteratorActivity.class, MediatorActivity.class,
            MementoActivity.class, InterpreterActivity.class,
            ChainOfResponsibilityActivity.class, VisitorActivity.class
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();
    }

    private void initView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        binding.recyclerView.setLayoutManager(gridLayoutManager);
        binding.recyclerView.addItemDecoration(new GridSpaceItemDecoration(2, 10).setEndFromSize(0));
        binding.recyclerView.setAdapter(new BaseRecyclerAdapter<String>(R.layout.item_main, Arrays.asList(patterns)) {
            @Override
            protected void bindView(BaseByViewHolder holder, String title, int position) {
                holder.setText(R.id.bt_button, title);
            }
        });
        binding.recyclerView.setOnItemClickListener(new ByRecyclerView.OnItemClickListener() {
            @Override
            public void onClick(View v, int position) {
                startActivity(new Intent(v.getContext(), classes[position]));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.actionbar_about:
                Uri issuesUrl = Uri.parse("https://github.com/wh1992-github/DesignPattern");
                Intent intent = new Intent(Intent.ACTION_VIEW, issuesUrl);
                startActivity(intent);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding.recyclerView.destroy();
    }
}
