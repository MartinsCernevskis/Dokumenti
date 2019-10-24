package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Reminder extends Alarm {

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("UUUU / MM");
    private LocalDate date;

    @Override
    public void askInfo() {
        super.askInfo();
        System.out.print("Enter date");
        String strDate = Main.scan.next();
        date = LocalDate.parse(strDate, TIME_FORMAT);
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) || date.format(TIME_FORMAT).contains(str);
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}

