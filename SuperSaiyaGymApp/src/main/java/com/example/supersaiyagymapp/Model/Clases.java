package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clases {
    private int id, cost;
    private LocalDate expired;
    private String days;
    private LocalTime start, end;

    public Clases(int id, int cost, LocalDate expired, String days, LocalTime start, LocalTime end) {
        this.id = id;
        this.cost = cost;
        this.expired = expired;
        this.days = days;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getExpired() {
        return expired;
    }

    public void setExpired(LocalDate expired) {
        this.expired = expired;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

}
