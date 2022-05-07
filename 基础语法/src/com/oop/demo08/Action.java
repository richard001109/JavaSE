package com.oop.demo08;

/**
 * @author:Richard
 * @version:1.0
 */
//abstract抽象类          接口可以多继承
public abstract class Action {

    //约束~有人帮我们实现
    //抽象方法，只有方法名字，没有方法实现
    public abstract void doSomething();

    //1.不能new这个抽象类，只能靠子类区实现它，约束！
    //2.抽象类中可以写普通方法
    //3.抽象方法只能在抽象类中
    //抽象的抽象


}
