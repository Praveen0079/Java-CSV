package com.bridgeLabz;


class ab{
    int age= 34;
    String name = "dfg";
    static ab instance;
    private ab(int age , String name){
        this.age = age;
        this.name = name;
    }

    static ab getInstance(){
        if(instance==null){
            instance = new ab(10,"sdf");
        }
        return instance;
    }
}
