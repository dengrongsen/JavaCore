package com.yanqun.parents;

public class A extends  B
{
    public A(){
        super();
        System.out.println("A被加载了，加载器是： "+ this.getClass().getClassLoader());//对象使用之前，必然先把此对象对应的类加载
    }
}