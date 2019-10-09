package com.hj.wa.exception;

/**
 * 如果JAva虚拟机试图创建类ExceptionInitializerError的实例，但是因为出现Out-Of-Memory-Error而无法创建实例，那么抛出OutOfMemoryError对象作为代替
 * 如果初始化器抛出一些Exception，而且Exception类不是Error或者它的某个子类，那么就会创建ExceptionInInitializerError类的一个新实例，并用Exception作为参数，用这个实例代理Exception
 */
public class ExceptionInintializerErrorMain {
    public static void main(String[] args) {

    }
}
