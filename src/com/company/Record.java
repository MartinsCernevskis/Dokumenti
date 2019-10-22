package com.company;

import java.util.Scanner;

public abstract class Record {

    private static int counter = 0;
    private int id;


    Scanner scan = new Scanner(System.in);

    public Record() {
        Record.counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }

    public abstract void askInfo();

    public abstract boolean contains(String str);
    String strID = Integer.toString(id);


}
