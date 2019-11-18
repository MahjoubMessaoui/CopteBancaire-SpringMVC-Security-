package whitecape.com.comptebancaire.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
public class Client implements Serializable {
@Id
@GeneratedValue
    private Long code;
    private String name;
    private String email;
    @OneToMany(mappedBy = "client" ,fetch = FetchType.LAZY)
    private Collection<Compte> comptes;


    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection < Compte > getComptes() {
        return comptes;
    }

    public void setComptes(Collection < Compte > coptes) {
        this.comptes = coptes;
    }

    public Client(String name, String email, Collection < Compte > comptes) {
        this.name = name;
        this.email = email;
        this.comptes = comptes;
    }

    public Client(String mahjoub, String email, String cc) {
    }
}
