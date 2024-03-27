package Model;

public class Exercise {
    private int id;
    private String name, muscle;

    public Exercise(int id, String name, String muscle) {
        this.id = id;
        this.name = name;
        this.muscle = muscle;
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

}
