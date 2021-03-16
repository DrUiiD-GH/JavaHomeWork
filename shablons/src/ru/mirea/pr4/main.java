package ru.mirea.pr4;

public class main {
    public static void main(String[] args) throws Exception {
        ExService exS = new ExService(4);
        exS.start();
        exS.stop();

    }
}

