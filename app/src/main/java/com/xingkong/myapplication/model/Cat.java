package com.xingkong.myapplication.model;

import com.glumes.cppso.utils.LogUtil;

/**
 * @Author glumes
 */

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
        LogUtil.Companion.d("Cat Construct call....");
    }

    @Override
    public String getName() {
        return "My name is " + this.name;
    }

}
