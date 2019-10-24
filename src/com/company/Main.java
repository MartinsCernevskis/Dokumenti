package com.company;

import java.net.IDN;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> records = new ArrayList<>();


    public static void main(String[] args) {
        scan.useDelimiter("\n");
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
                case "FIND":
                    findRecords();
                    break;
                case "DELETE":
                    deleteRecord();
                    break;
                default:
                    System.out.println("Error: unknown command");
            }

        }

    }

    private static void showHelp() {
        System.out.println("One day a great manual will be here");
    }




    private static void listRecord() {
        for (Record p : records) {
            System.out.println(p);
        }
    }


    private static void createRecord() {
        System.out.print("Type: PERSON for new person\nType: NOTE for new note\nType: ALARM for new alarm\n");
        String type = scan.next();
        switch (type) {
            case "PERSON":
                createRecord(new Person());
                break;
            case "NOTE":
                createRecord(new Note());
                break;
            case "ALARM":
                createRecord(new Alarm());
                break;

            default:
                System.out.println("Error: Unknown method type");

        }
    }
    private static void findRecords(){
        System.out.println("substring");
        String str =  scan.next();
        for(Record r : records) {
            if(r.contains(str));{
                System.out.println(r);
            }
        }
    }



    private static void deleteRecord(){

        System.out.println("record ID: ");
        int recordID = scan.nextInt();

        for (
                int i = 0;
                i < records.size();
                i++) {

            Record r = records.get(i);

            if (r.getId() == recordID ){
                records.remove(i);
                break;
            }

        }
}

//       private static void createPerson() {
//        Person p = new Person();
//        p.askInfo();
//        records.add(p);
//    }
//
//    private static void createNote() {
//        Note n = new Note();
//        n.askInfo();
//        records.add(n);
//    }
//
//       private static void createAlarm() {
//        Alarm a = new Alarm();
//        a.askInfo();
//        records.add(a);
//    }

    private static void createRecord(Record r){
        r.askInfo();
        records.add(r);
    }




}