package Model;

public class Trainer extends User {

    private int anniosExperiencia;

    public Trainer(String nombre, String apellidos, String correo, int id, int cel, int anniosExperiencia) {
        super(nombre, apellidos, correo, id, cel);
        this.anniosExperiencia = anniosExperiencia;
    }

    public int getAnniosExperiencia() {
        return anniosExperiencia;
    }

    public void setAnniosExperiencia(int anniosExperiencia) {
        this.anniosExperiencia = anniosExperiencia;
    }

}
