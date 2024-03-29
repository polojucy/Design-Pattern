package com.design.pattern.structural.adapter.classadapter;

/**
 * Created by perl on 2019/6/18.
 * 适配器类
 * 类适配器模式 Class-Adapter （继承方式）
 * 通过super关键字调用父类方法实现接口适配
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
