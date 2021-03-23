package ru.mirea.pr6.FactoryMethod;

public class JavaDeveloperFactory implements FactoryDeveloper {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
