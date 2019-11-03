package whitecape.com.comptebancaire.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@DiscriminatorValue("CE")
public class CompteEparagne extends Compte {

    private double taux;

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public CompteEparagne(Date dateOper, double solde, Client client, Collection < Operation > operations, double taux) {
        super(dateOper, solde, client, operations);
        this.taux = taux;
    }

    public CompteEparagne() {

    }
}
