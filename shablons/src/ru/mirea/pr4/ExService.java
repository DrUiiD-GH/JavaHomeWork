package ru.mirea.pr4;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExService{
    private ExecutorService es;
    private int n;
    private List<Future<?>> ls = new ArrayList<>();

    public ExService(int n){
        this.n = n;
        es = Executors.newFixedThreadPool(n);
    }
    
    public void start(){
        for (int i=0; i<n; i++) {
            Future<?> submit = es.submit(() -> {
                try {
                    System.out.println("Start "+ Thread.currentThread().getId());
                    Thread.sleep(1000 + Math.round(Math.random()* 7000));
                    System.out.println("Finished "+Thread.currentThread().getId());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            ls.add(submit);
        }
    }
    public void stop() throws Exception{
        for(Future<?> f: ls){
            f.get();
        }
        System.out.println("FINISH");
        es.shutdown();
    }
}
