package ru.mirea.pr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String args[]){
        List<Human> Humans = new ArrayList();
        Humans.add(new Human(23, "Stive", "Morgan", LocalDate.of(LocalDate.now().getYear()-23, 8, 23), 55));
        Humans.add(new Human(46, "Bob", "Morley", LocalDate.of(LocalDate.now().getYear()-46, 12, 5), 54));
        Humans.add(new Human(12, "Billy", "Bonky", LocalDate.of(LocalDate.now().getYear()-12, 3, 24), 44));
        Humans.add(new Human(41, "Jane", "Watsan", LocalDate.of(LocalDate.now().getYear()-41, 1, 2), 94));
        Humans.add(new Human(73, "Mat", "Lousan", LocalDate.of(LocalDate.now().getYear()-72, 10, 10), 68));
        Humans.add(new Human(5, "Jake", "Bonky", LocalDate.of(LocalDate.now().getYear()-5, 5, 12), 35));
        Humans.add(new Human(32, "Lolly", "Koltan", LocalDate.of(LocalDate.now().getYear()-32, 3, 24), 57));

        Humans.stream()
                .limit(5)
                .sorted(Comparator.comparing(Human::getBirthDate))
                .filter(x -> x.getWeight()<60)
                .forEach(x -> System.out.printf("%s %s\n", x.getFirstName(), x.getLastName()));



    }


}
