package com.hj.wa;

import java.util.ArrayList;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList instanceof ArrayList);
        System.out.println(arrayList instanceof RandomAccess);
        String str = new Main().getClass().getClassLoader().getResource("").toString();
        System.out.println("路径" + str);
        System.out.println("hello world");
    }
}
