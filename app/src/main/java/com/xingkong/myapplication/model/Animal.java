package com.xingkong.myapplication.model;


import com.glumes.cppso.utils.LogUtil;

/**
 * @Author glumes
 */

public class Animal {


    protected String name;

    public static int num = 0;

    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        LogUtil.Companion.d("call getName method");
        return this.name;
    }

    public int getNum() {
        return num;
    }

    // C++ 调用 Java 的实例方法
    public void callInstanceMethod(int num) {
        LogUtil.Companion.d("call instance method and num is " + num);
    }

    // C++ 调用 Java 的类方法
    public static String callStaticMethod(String str) {

        if (str != null) {
            LogUtil.Companion.d("call static method with " + str);
        } else {
            LogUtil.Companion.d("call static method str is null");
        }
        return "";
    }

    public static String callStaticMethod(String[] strs, int num) {
        LogUtil.Companion.d("call static method with string array");
        if (strs != null) {
            for (String str : strs) {
                LogUtil.Companion.d("str in array is " + str+"");
            }
//            for (int i = 0; i <strs.length ; i++) {
//                LogUtil.Companion.d("str in array is " + strs[i]+ i);
//            }
        }
        return "";
    }

    public static void callStaticVoidMethod() {
        LogUtil.Companion.d("call static void method");
    }
}
