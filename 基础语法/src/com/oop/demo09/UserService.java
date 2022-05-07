package com.oop.demo09;

/**
 * @author:Richard
 * @version:1.0
 */
public interface UserService {

    //接口中所有定义都是抽象的
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
