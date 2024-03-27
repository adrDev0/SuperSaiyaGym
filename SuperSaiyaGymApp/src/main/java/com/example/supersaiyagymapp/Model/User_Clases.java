package Model;

public class User_Clases {
    private int id, idUser, idClases;

    public User_Clases(int id, int idUser, int idClases) {
        this.id = id;
        this.idUser = idUser;
        this.idClases = idClases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdClases() {
        return idClases;
    }

    public void setIdClases(int idClases) {
        this.idClases = idClases;
    }

}
