package com.hj.wa.exception;

/**
 * 显式加载一个类通常有如下方式
 * 通过类Class中的forName()方法
 * 通过类ClassLoader.loadClass()方法
 * 通过ClassLoader.findSystemClass()方法
 * classNotFoundException 出现的原因通常是在当前的classpath的目录下没有指定的文件夹存在。
 * 获取当前的classpath路径的方法 this.getClass().getClassLoader().getResource("").toString()
 */
public class ClassNotFoundExceptionMain {
    public static void main(String[] args) {
        try {
            System.out.println(new ClassNotFoundExceptionMain().getClass().getClassLoader().getResource("").toString());
            Class.forName("com.hj.wa.web.HandleServer");
            Class.forName("HandleServer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
