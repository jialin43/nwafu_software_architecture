package com.company.singleton;

public  class Singleton {
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s2){
            System.out.println("单例模式启动成功");
        }
    }
}
