package com.hj.wa.classLoader;

import com.hj.wa.exception.ClassCastExceptionMain;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ClassReloader extends ClassLoader {
    private String classPath;
    String classname="com.hj.wa.exception.ClassCastExceptionMain";
    public ClassReloader(String classPath){
        this.classPath=classPath;
    }
    protected Class<?> findClass(String name) throws ClassNotFoundException{
        byte[] classData=getData(name);
        if (classData==null){
            throw new ClassNotFoundException();
        }else {
            return defineClass(classname,classData,0,classData.length);
        }
    }

    private byte[] getData(String classname){
        String path=classPath+classname;
        try {
            InputStream stream=new FileInputStream(path);
            ByteArrayOutputStream stream1=new ByteArrayOutputStream();
            byte[] buffer=new byte[2048];
            int num=0;
            while ((num=stream.read(buffer))!=-1){
                stream1.write(buffer);
            }
            return stream1.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            String path="file:/Users/admin/work/program/data/content/content/web-program/target/classes/com/hj/wa/exception/";
            ClassReloader reloader=new ClassReloader(path);
            Class r=reloader.findClass("ClassCastExceptionMain.class");
            System.out.println(r.newInstance());

            ClassReloader reloader2=new ClassReloader(path);
            Class r2=reloader2.findClass("ClassCastExceptionMain.class");
            System.out.println(r2.newInstance());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
