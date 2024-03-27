package Model;

import java.time.LocalDate;

public class Plan {
    private int id, cost, months;
    private LocalDate expired;

    public Plan(int id, int cost, int months, LocalDate expired) {
        this.id = id;
        this.cost = cost;
        this.months = months;
        this.expired = expired;
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

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public LocalDate getExpired() {
        return expired;
    }

    public void setExpired(LocalDate expired) {
        this.expired = expired;
    }

}
