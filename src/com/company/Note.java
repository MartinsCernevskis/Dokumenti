package com.company;


public class Note extends Record {

    private String input;

    public void askInfo() {
        System.out.print("Enter text");
        input = Main.scan.next();
    }

    public String getTeksts() {
        return input;
    }

    public void setTeksts(String teksts) {
        this.input = teksts;
    }
}
