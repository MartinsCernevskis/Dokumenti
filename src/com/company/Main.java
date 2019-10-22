package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> records = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Enter a command.\nType HELP for help.\nType CREATE to create new\nType LIST to create new list\nType EXIT for exit.\n");
        for (; ; ) {
            System.out.print("> ");
            String cmd = scan.next();
            switch (cmd) {
                case "EXIT":
                    System.out.println("goodbye");
                    return;
                case "HELP":
                    showHelp();
                    break;
                case "CREATE":
                    createRecord();
                    break;
                case "LIST":
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
        System.out.print("Type: PERSON for new person\nType: NOTE for new note\nType: ALARM for new alarm\n");
        String type = scan.next();
        switch (type) {
            case "PERSON":
                createPerson();
                break;
            case "NOTE":
                createNote();
                break;
            case "ALARM":
                createAlarm();
                break;
            default:
                System.out.println("Error: Unknown method type");

        }
    }

       private static void createPerson() {
        Person p = new Person();
        p.askInfo();
        records.add(p);
    }

    private static void createNote() {
        Note n = new Note();
        n.askInfo();
        records.add(n);
    }

    private static void createRecord(Record r){
        r.askInfo();
        records.add(r)
        }

    private static void createAlarm() {
        Alarm a = new Alarm();
        a.askInfo();
        records.add(a);
    }

    private static void showHelp() {
        System.out.println("One day a great manual will be here");
    }

}