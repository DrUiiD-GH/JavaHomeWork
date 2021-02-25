package ru.mirea.pr3;

import java.util.*;
import java.util.concurrent.Semaphore;


public class main {
    public static volatile List<String> list = new ArrayList<String>();
    public static volatile Set<Integer> set = new TreeSet<>();

    private static final Semaphore semaphore = new Semaphore(1);


    public static int buff = 0;

    public static void main(String[] args) throws Exception {
        Thread one = new Thread(()->{
           addInList("Первый поток: запись один");
           addInList("Первый поток: запись два");
           addInList("Первый поток: запись три");
           deleteInList(2);
        });

        Thread two = new Thread(()->{
            deleteInList(1);
            addInList("Второй поток: запись один");
            addInList("Второй поток: запись два");
            addInList("Второй поток: запись три");
        });

        one.start();
        two.start();

        Thread.sleep(3000);
        System.out.println(list);
        one.interrupt();
        two.interrupt();

        one = new Thread(()->{
            for (int i=0; i< 10; i++){
               addInSet();
            }
        });
        two = new Thread(()->{
            for (int i=0; i< 10; i++){
                addInSet();
            }
        });

        one.start();
        two.start();

        Thread.sleep(3000);
        System.out.println(set);



    }

    synchronized static void addInList(String str) {
        list.add(str);
    }

    synchronized static void deleteInList(int i){
        if (i<list.size()){
            list.remove(i);
        } else System.out.println("Access error");
    }

    static void addInSet (){
        try{
            semaphore.acquire();
            set.add(buff++);
            semaphore.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        };
    };


}
