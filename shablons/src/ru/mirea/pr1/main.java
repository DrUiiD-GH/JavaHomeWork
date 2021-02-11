package ru.mirea.pr1;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Comparator<Integer> test = (a, b) ->{
            if (Math.abs(a)>Math.abs(b)) return a;
            else return b;
        };
        System.out.println(test.compare(12, -34));
    }
}
