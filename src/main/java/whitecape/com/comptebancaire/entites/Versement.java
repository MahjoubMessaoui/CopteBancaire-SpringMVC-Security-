package whitecape.com.comptebancaire.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("CV")
public class Versement extends Operation {

    public Versement(Date dateOper, Double montant, Compte compte) {
        super(dateOper, montant, compte);
    }

    public Versement() {
    }
}
