package ru.mirea.pr1;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        x=scanner.nextInt();
        y=scanner.nextInt();

        Comparator<Integer> test = (a, b) ->{
            if (Math.abs(a)>Math.abs(b)) return a;
            else return b;
        };
        System.out.println(test.compare(x, y));
    }
}
