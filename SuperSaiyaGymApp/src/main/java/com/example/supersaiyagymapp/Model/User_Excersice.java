package Model;

public class User_Excersice {
    private int id, idUser, idExcersice;

    public User_Excersice(int id, int idUser, int idExcersice) {
        this.id = id;
        this.idUser = idUser;
        this.idExcersice = idExcersice;
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

    public int getIdExcersice() {
        return idExcersice;
    }

    public void setIdExcersice(int idExcersice) {
        this.idExcersice = idExcersice;
    }

}
