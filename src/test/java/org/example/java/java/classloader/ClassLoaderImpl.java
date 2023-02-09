package org.example.java.java.classloader;

public class ClassLoaderImpl extends ClassLoader{



    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
