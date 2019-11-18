package whitecape.com.comptebancaire.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("CR")
public class Retrait extends Operation {

    public Retrait(Date dateOper, Double montant, Compte compte) {
        super(dateOper, montant, compte);
    }

    public Retrait() {
    }


}
