package com.company;

public class Alarm extends Note {

    private String time;
@Override
    public void askInfo() {
    super.askInfo();
    System.out.print("Enter time");
    time = Main.scan.next();

    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", text='" + getTeksts() + '\'' +
                ", time='" + getTime() + '\'' +
                '}';

    }
}

