package Model;

import java.time.LocalDate;

public class Machine {
    private int id;
    private String name;
    private String muscle;
    private LocalDate admissionDate;

    public Machine(int id, String name, String muscle, LocalDate admissionDate) {
        this.id = id;
        this.name = name;
        this.muscle = muscle;
        this.admissionDate = admissionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

}
