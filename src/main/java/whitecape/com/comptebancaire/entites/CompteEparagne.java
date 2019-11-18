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

    public CompteEparagne(String codeCompte, Date dateOper, double solde, Client client, Collection < Operation > operations) {
        super(codeCompte, dateOper, solde, client, operations);
    }

    public CompteEparagne() {

    }
}
