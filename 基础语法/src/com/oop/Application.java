package com.oop;

import com.oop.demo08.Action;
import com.oop.demo10.Outer;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();
        inner.in();
//        inner.getID();

    }
}
