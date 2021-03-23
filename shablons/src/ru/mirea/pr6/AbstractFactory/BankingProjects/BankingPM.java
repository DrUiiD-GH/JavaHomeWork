package ru.mirea.pr6.AbstractFactory.BankingProjects;

import ru.mirea.pr6.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking Project Manager manages project...");
    }
}
