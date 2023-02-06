package com.learn;

public class User {

    private String name;

    public String getName(int index,boolean flag,Double doub){
        return this.name;
    }

    private String dummyName(){
        System.out.println("# dummyName called");
        return "Java";
    }
}
