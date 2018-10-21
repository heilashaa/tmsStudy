package by.haa.tms.hw001;

import by.haa.tms.HomeWork;


public class HomeWork001 extends HomeWork {

//    public HomeWork001(){
////        super();
////        System.out.println(Arrays.toString(this.getTaskDescription()));
//    }//todo конструктор не наследуется/ Какой конструктор вызывается при полиморфном создании объекта: родительский или подкласса, из какого класса будет брать значения полей;

    protected String[] taskDescription = {"1 -task 001 do first\n", "2 - task 002 do second\n", "3 - task 003 do third\n", "0 - exit"};

    protected String[] getTaskDescription() {
        return taskDescription;
    }

    @Override
    public void run(int taskNumber) {

        switch (taskNumber) {
            case 1:
                this.task001();
                break;
            case 2:
                this.task002();
                break;
            case 3:
                this.task003();
                break;
            case 0:
                System.out.println("Goodbye");
                return;
            default:
                System.out.printf("Tasks for number №%d no. Please try again!\n", taskNumber);
                break;
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
