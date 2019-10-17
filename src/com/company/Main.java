package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> records = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Enter a command. Type help for help. Exit for exit. Create to create new");
        for (; ; ) {
            System.out.print("> ");
            String cmd = scan.next();
            switch (cmd) {
                case "exit":
                    System.out.println("goodbye");
                    return;
                case "help":
                    showHelp();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecord();
                    break;

                default:
                    System.out.println("Error: unknown command");
            }

        }

    }


    private static void listRecord() {
        for (Record p : records) {
//            System.out.printf("%s %s %s\n", p.getId(), p.getName(), p.getSurname(), p.getPhone());
            System.out.println(p);
        }
    }


    private static void createRecord() {
        System.out.print("type: person");
        String type = scan.next();
        switch (type) {
            case "person":
                createPerson();
                break;
            case "note":
                createNote();
                break;
            default:
                System.out.println("Error: Unknown method type");

        }
    }

    private static void createNote() {
        Note n = new Note();

        n.askInfo();
        records.add(n);
    }


    private static void createPerson() {
        Person p = new Person();

        p.askInfo();
        records.add(p);
    }


    private static void showHelp() {
        System.out.println("One day a great manual will be here");
    }

}