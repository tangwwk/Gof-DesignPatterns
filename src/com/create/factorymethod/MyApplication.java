package com.create.factorymethod;

/**
 * Created by doushuqi on 15/3/25.
 * ConcreteCreator
 */
public class MyApplication extends Application {

    @Override
    public MyDocumnet createDocument() {
        super.createDocument();
        System.out.println("create document from MyApplication");
        return new MyDocumnet("sophia");
    }
}
