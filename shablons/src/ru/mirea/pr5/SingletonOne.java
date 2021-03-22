package ru.mirea.pr5;

public class SingletonOne {
    private static SingletonOne instance;
    public static synchronized SingletonOne getInstance(){
        if (instance!=null){
            return instance;
        }else return instance = new SingletonOne();
    }
}
