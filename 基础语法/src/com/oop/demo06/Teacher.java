package com.oop.demo06;

public class Teacher extends Person{
    public void go(){
        System.out.println("go");
    }
}
/*
        // 类型之间的转换， 父   子
        //高                   低
        Person obj = new Teacher();

        //student将这个对象转换为student类型，我们可以使用student类型的方法了！

        Teacher teacher = (Teacher) obj;
        teacher.go();
        ((Teacher)obj).go();

        //子类转化为父类可能会丢失一些自己原本的方法！
        Teacher teacher1 = new Teacher;
        teacher1.go();
        Person person = teacher1;
    }
}
/*
父类引用指向子类的对象
把子类转化为父类，向上转型；
把父类转化为子类，向下转型，强制转换
方便方法的调用，减少重复的代码！，简洁

抽象：封装，继承，多态；  抽象类
 */