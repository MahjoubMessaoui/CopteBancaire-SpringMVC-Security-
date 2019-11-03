package whitecape.com.comptebancaire.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import java.util.Collection;
import java.util.Date;
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte{


    private double decouvert;

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public CompteCourant(Date dateOper, double solde, Client client, Collection < Operation > operations, double decouvert) {
        super(dateOper, solde, client, operations);
        this.decouvert = decouvert;
    }

    public CompteCourant() {

    }
}
