package Model;

public class FreeWeights {
    private int id;
    private String barType;
    private int weight;
    private int cant;

    public FreeWeights(int id, String barType, int weight, int cant) {
        this.id = id;
        this.barType = barType;
        this.weight = weight;
        this.cant = cant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarType() {
        return barType;
    }

    public void setBarType(String barType) {
        this.barType = barType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

}
