package ru.mirea.pr6.AbstractFactory.BankingProjects;

import ru.mirea.pr6.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
