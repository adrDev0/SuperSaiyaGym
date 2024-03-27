package Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id, idUser, idTrainer;

    public User_Trainer(int id, int idUser, int idTrainer) {
        this.id = id;
        this.idUser = idUser;
        this.idTrainer = idTrainer;
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

    public int getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(int idTrainer) {
        this.idTrainer = idTrainer;
    }

}
