package ru.mirea.pr5;

import java.util.concurrent.Semaphore;

public class SingletonThree {
    private final static Semaphore semaphore = new Semaphore(1);
    private static SingletonThree instance;

    public static SingletonThree getInstance() throws Exception {
        try {
            semaphore.acquire();
            if (instance == null){
                instance = new SingletonThree();
            }
            semaphore.release();
            return instance;
        } catch (InterruptedException e){
            e.printStackTrace();
            return null;
        }
    }
}
