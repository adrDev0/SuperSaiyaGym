package demo.src.Model;

public class Asociacion {
    private int id;
    private String persona, rol;

    public Asociacion(int id, String persona, String rol) {
        this.id = id;
        this.persona = persona;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
