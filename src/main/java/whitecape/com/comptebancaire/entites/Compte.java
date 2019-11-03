package whitecape.com.comptebancaire.entites;

import org.springframework.dao.DataAccessException;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYP_CPTE",discriminatorType = DiscriminatorType.STRING,length = 2)
public abstract class Compte implements Serializable {
    @Id
    @GeneratedValue
    private String numCompt;
    @Temporal(TemporalType.TIMESTAMP)

    private Date dateOper;
    private double solde;
    @ManyToOne()
    @JoinColumn(name = "CODE_CLIENT")
    private Client client;

    @OneToMany(mappedBy = "compte",fetch = FetchType.LAZY)
    private Collection<Operation> operations;


    public String getNumCompt() {
        return numCompt;
    }

    public void setNumCompt(String numCompt) {
        this.numCompt = numCompt;
    }

    public Date getDateOper() {
        return dateOper;
    }

    public void setDateOper(Date dateOper) {
        this.dateOper = dateOper;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Collection < Operation > getOperations() {
        return operations;
    }

    public void setOperations(Collection < Operation > operations) {
        this.operations = operations;
    }

    public Compte(Date dateOper, double solde, Client client, Collection < Operation > operations) {
        this.dateOper = dateOper;
        this.solde = solde;
        this.client = client;
        this.operations = operations;
    }

    public Compte() {
    }
}
