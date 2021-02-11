package ru.mirea.pr2;

import java.time.LocalDate;

public class main {
    public static void main(){
        Human human = new Human(23, "Stiven", "Smit", LocalDate.now(), 65);
        System.out.println(human.toString());
    }

}
