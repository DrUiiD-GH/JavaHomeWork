package ru.mirea.pr6.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        FactoryDeveloper factory1 = new CppDeveloperFactory();
        FactoryDeveloper factory2 = new JavaDeveloperFactory();
        Developer developer = factory1.createDeveloper();
        developer.writeCode();
        developer = factory2.createDeveloper();
        developer.writeCode();
    }
}
