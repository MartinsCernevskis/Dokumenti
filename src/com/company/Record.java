package com.company;

public class Record {

    private static int counter = 0;
    private int id;

    public Record(){
        Record.counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }
}
