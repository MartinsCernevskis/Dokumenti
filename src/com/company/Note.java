package com.company;


public class Note extends Record {

    private String noteText;
@Override
    public void askInfo() {
        System.out.print("Enter text");
        noteText = Main.scan.next();
    }

    public String getTeksts() {
        return noteText;
    }

    public void setTeksts(String teksts) {
        this.noteText = teksts;
    }
}
