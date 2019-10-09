package com.hj.wa.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * 强制类型转换时会出现
 * JVM在做类型转换时会按照如下规则检查：
 * 对于普通对象，对象必须是目标类的实例或目标类的子类实例。如果目标类是接口，那么会把它当做实现了该接口的一个子类
 * 对于数组类型，目标类必须是数组类型或java.lang.Object、java.lang.Cloneable、java.io.Serializable
 */
public class ClassCastExceptionMain {
    public static Map m = new HashMap() {{
        put("a", "2");
    }};

    public static void main(String[] args) {
        String[] x=(String[])new Object();
        System.out.println(x.toString());
       // Integer isInt=(Integer)m.get("a");
       // System.out.println(isInt);
    }
}
