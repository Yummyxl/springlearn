package com.learn.bean.aopdemo;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 *
 * @Author: Yummyxl
 * @Date: 2020/3/6
 */

public class Daoimpl implements Dao {

    @Override
    public void select() {
        System.out.println("Daoimpl select ====================");
    }

    @Override
    public void insert() {
        System.out.println("Daoimpl insert ====================");
    }
}
