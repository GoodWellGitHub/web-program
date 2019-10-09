package com.hj.wa.classLoader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class NetClassLoader extends ClassLoader {
    private String classPath;
    private String packageName = "net.xulingbo.classloader";

    public NetClassLoader(String classPath) {
        this.classPath = classPath;
    }

    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> aClass = findLoadedClass(name);
        if (aClass != null) {
            return aClass;
        }
        if (packageName.startsWith(name)) {
            byte[] classDate = getData(name);
            if (classDate == null) {
                throw new ClassNotFoundException();
            } else {
                return defineClass(name, classDate, 0, classDate.length);
            }
        } else {
            return super.loadClass(name);
        }
    }

    private byte[] getData(String className) {
        String path = classPath + File.separatorChar + className.replace('.', File.separatorChar) + ".class";
        try {
            URL url = new URL(path);
            InputStream is = url.openStream();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            byte[] buffer = new byte[2048];
            int num = 0;
            while ((num = is.read(buffer)) != -1) {
                stream.write(buffer, 0, num);
            }
            return stream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private byte[] deCode(byte[] str) {
        byte[] decode = null;
        //对Src字节码进行解码
        return decode;
    }

}
