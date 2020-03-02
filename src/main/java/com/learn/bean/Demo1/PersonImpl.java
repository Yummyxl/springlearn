package com.learn.bean.Demo1;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 *
 * @Author: Yummyxl
 * @Date: 2020/3/2
 */

public class PersonImpl implements Person {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String say() {
        return name;
    }
}
