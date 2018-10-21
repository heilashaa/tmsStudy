package by.haa.tms.hw001;

import by.haa.tms.HomeWork;


public class HomeWork001 extends HomeWork {

    private String[] taskDescription = {"1 -task 001 do first\n", "2 - task 002 do second\n", "3 - task 003 do third\n", "0 - exit\n"};

    @Override
    protected String[] getTaskDescription() {
        return taskDescription;
    }

    @Override
    public boolean run(int taskNumber) {

        switch (taskNumber) {
            case 1:
                this.task001();
                return true;
            case 2:
                this.task002();
                return true;
            case 3:
                this.task003();
                return true;
            case 0:
                System.out.println("Goodbye");
                return false;
            default:
                System.out.printf("Tasks for number №%d no. Please try again!\n", taskNumber);
                return true;
        }

    }

    private void task001() {
        System.out.println("You launched 1 task");
    }

    private void task002() {
        System.out.println("You launched 2 task");
    }

    private void task003() {
        System.out.println("You launched 3 task");
    }

}
