package ru.mirea.pr6.AbstractFactory.BankingProjects;

import ru.mirea.pr6.AbstractFactory.Developer;
import ru.mirea.pr6.AbstractFactory.ProjectManager;
import ru.mirea.pr6.AbstractFactory.ProjectTeamFactory;
import ru.mirea.pr6.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
