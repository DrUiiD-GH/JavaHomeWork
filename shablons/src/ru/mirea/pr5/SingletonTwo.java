package ru.mirea.pr5;

public class SingletonTwo {
    private static SingletonTwo instance = new SingletonTwo();
    public static SingletonTwo getInstance() {
        return instance;
    }
}
