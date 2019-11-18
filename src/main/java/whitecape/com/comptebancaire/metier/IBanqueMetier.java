package whitecape.com.comptebancaire.metier;

import org.springframework.data.domain.Page;
import whitecape.com.comptebancaire.entites.Compte;
import whitecape.com.comptebancaire.entites.Operation;

public interface IBanqueMetier {
    public Compte consulterCompte(String codeCompte);
    public void Verser(String codeCompte, double montant);
    public void Retirer(String codeCompte,double montant);
    public void Virement(String codeCompte1  ,String codeCompte2, double montant);
    public Page < Operation > listOperation(String codeCompte,int page,int size);



}
