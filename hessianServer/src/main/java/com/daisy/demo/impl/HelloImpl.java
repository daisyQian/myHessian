package com.daisy.demo.impl;

import com.daisy.demo.IHello;

/**
 * @Name com.daisy.demo.impl.HelloImpl
 * @Description
 * @Author qianna
 * @Version 2017/5/4 17:13
 * @Copyright 上海云辰信息科技有限公司
 */
public class HelloImpl implements IHello {
    public String sayHello() {
        return "Hello , I am from Hessian Service";
    }
}
