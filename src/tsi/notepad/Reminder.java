package tsi.notepad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reminder extends Alarm {
    private LocalDate date;

    @Override
    public void askInfo() {
        super.askInfo();
        date = Asker.askDate("date");
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || date.format(Asker.DATE_FORMAT).contains(str);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", date='" + date.format(Asker.DATE_FORMAT) + '\'' +
                ", time='" + getTime().format(Asker.TIME_FORMAT) + '\'' +
                '}';
    }
}