package by.haa.tms.hw002;

import by.haa.tms.HomeWork;

public class HomeWork002 extends HomeWork {

    private String[] taskDescription = {"1 -task 001 do first\n", "2 - task 002 do second\n", "3 - task 003 do third\n", "0 - exit\n"};

    @Override
    protected String[] getTaskDescription() {
        return taskDescription;
    }

    @Override
    public boolean run(int taskNumber) {
        System.out.println("HW002");
        return true;
    }
}
