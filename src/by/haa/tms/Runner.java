package by.haa.tms;


import by.haa.tms.hw001.HomeWork001;
import by.haa.tms.hw002.HomeWork002;
import by.haa.tms.hw003.HomeWork003;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Runner
 * Performs as an entry point to the program
 * Informs the user about the available homework
 * Provides a selection of available homework.
 * Informs the user about the available tasks in the selected homework
 * Provides choices for starting and running tasks from homework
 */
public class Runner {

    private SimplePrinter printer = new SimplePrinter();

    private Scanner scanIn;

    private String userName;

    private int homeWorkNumber;

    private int taskNumber;

    public static void main(String[] args) {

        Runner instance = new Runner();
        instance.route();
    }

    private void route() {
        this.scanIn = new Scanner(System.in, "UTF-8");
        System.out.println("Hello! Introduce youreself");
        this.userName = this.scanIn.next();
        homeWorkSelection();
        if (this.homeWorkNumber != 0) {
            this.taskSelection(this.homeWorkNumber);
        }
    }

    private void validateInput() {
        if (!this.scanIn.hasNextInt()) {
            System.out.printf("%s, you have entered an unavailable parameter. Please try again\n", this.userName);
            this.scanIn.next();
            validateInput();
        }
    }

    private void homeWorkSelection() {
        printer.split();
        System.out.printf("Hello, %s!\nChoose a homework from the list:\n1 - homework 'Intro';\n2 - homework 'Control flows';\n3 - homework 'Arrays';\n0 - exit from programm.\n", this.userName);
        printer.split();
        do {
            this.validateInput();
            this.homeWorkNumber = scanIn.nextInt();
            switch (this.homeWorkNumber) {
                case 1:
                    System.out.printf("You chose homework №%d\n", this.homeWorkNumber);
                    return;
                case 2:
                    System.out.printf("You chose homework №%d\n", this.homeWorkNumber);
                    return;
                case 3:
                    System.out.printf("You chose homework №%d\n", this.homeWorkNumber);
                    return;
                case 0:
                    System.out.printf("Goodbye, %s\n", this.userName);
                    printer.split();
                    return;
                default:
                    System.out.printf("There is no homework №%d. Try again.!\n", this.homeWorkNumber);
                    break;
            }
        }
        while (this.scanIn.hasNext());
    }

    private HomeWork homeWork(int homeWorkNumber) {
        switch (homeWorkNumber) {
            case 1:
                return new HomeWork001();
            case 2:
                return new HomeWork002();
            case 3:
                return new HomeWork003();
            default:
                return null;
        }
    }

    private void taskSelection(int homeWorkNumber) {
        printer.split();
        System.out.printf("%s!, choose a task from the list:\n", this.userName);
        HomeWork homeWorkObject = homeWork(homeWorkNumber);
        printer.split();
        System.out.println(Arrays.toString(homeWorkObject.getTaskDescription()));
        printer.split();
        do {
            this.validateInput();
            this.taskNumber = scanIn.nextInt();
            if(!homeWorkObject.run(this.taskNumber)){
                return;
            };
        }
        while (this.scanIn.hasNext());
    }

}