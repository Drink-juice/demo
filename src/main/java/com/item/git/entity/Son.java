package com.item.git.entity;

public class Son extends User{

    private void son(){
        System.out.println("子类独有的方法");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.father();
        son.getName();
        System.out.println("this is test breach");
    }
}
