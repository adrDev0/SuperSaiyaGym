package Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User_Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id, idUser, idPlan;

    public User_Plan(int id, int idUser, int idPlan) {
        this.id = id;
        this.idUser = idUser;
        this.idPlan = idPlan;
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

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

}
