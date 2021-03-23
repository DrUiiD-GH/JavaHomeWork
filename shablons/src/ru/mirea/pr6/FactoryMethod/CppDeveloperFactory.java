package ru.mirea.pr6.FactoryMethod;

public class CppDeveloperFactory implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
