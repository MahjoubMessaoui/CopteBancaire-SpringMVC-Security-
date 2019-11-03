package whitecape.com.comptebancaire.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYP_OPERATION",discriminatorType = DiscriminatorType.STRING,length = 2)
public abstract class Operation implements Serializable {
    @Id
    @GeneratedValue
    private Long numOper;
    @Temporal(TemporalType.TIMESTAMP)

    private Date dateOper;
    private Double montant;
    @ManyToOne
    @JoinColumn(name = "CODE_CPTE")
    private Compte compte;

    public Long getNumOper() {
        return numOper;
    }

    public void setNumOper(Long numOper) {
        this.numOper = numOper;
    }

    public Date getDateOper() {
        return dateOper;
    }

    public void setDateOper(Date dateOper) {
        this.dateOper = dateOper;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Operation(Date dateOper, Double montant, Compte compte) {
        this.dateOper = dateOper;
        this.montant = montant;
        this.compte = compte;
    }

    public Operation() {
    }
}
