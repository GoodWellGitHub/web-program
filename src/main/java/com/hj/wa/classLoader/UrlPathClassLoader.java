package com.hj.wa.classLoader;

import java.net.URL;
import java.net.URLClassLoader;

public class UrlPathClassLoader extends URLClassLoader {
    private String packageName="net.xulingbo.classloader";
    public UrlPathClassLoader(URL[] classPath,ClassLoader parent){
        super(classPath,parent);
    }

    protected Class<?> findClass(String name) throws ClassNotFoundException{
        Class<?> aClass=findLoadedClass(name);
        if (aClass!=null){
            return aClass;
        }
        if (!packageName.startsWith(name)){
            return super.loadClass(name);
        }else {
            return findClass(name);
        }
    }
}
