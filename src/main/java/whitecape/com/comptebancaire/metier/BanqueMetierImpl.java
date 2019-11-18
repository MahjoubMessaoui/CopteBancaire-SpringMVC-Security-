package whitecape.com.comptebancaire.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import whitecape.com.comptebancaire.dao.CompteRepository;
import whitecape.com.comptebancaire.dao.OperationRepository;
import whitecape.com.comptebancaire.entites.*;

import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class BanqueMetierImpl implements IBanqueMetier {
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private OperationRepository operationRepository;


    @Override
    public Compte consulterCompte(String codeCompte) {
      /*  Compte cp=compteRepository.findOne(codeCompte);

        if (cp==null) throw new RuntimeException("Compte Introuvable");

        return null;*/
       Optional <Compte> optCompte=compteRepository.findById(codeCompte);
        if (optCompte==null) throw new RuntimeException("Compte Introuvable");

        return null;
    }

    @Override
    public void Verser(String codeCompte, double montant) {
          Compte cp=consulterCompte(codeCompte);
        Versement v=new Versement(new Date(),montant,cp);
        operationRepository.save(v);
        cp.setSolde(v.getMontant()+montant);
        compteRepository.save(cp);
    }

    @Override
    public void Retirer(String codeCompte, double montant) {
         Compte cp=consulterCompte(codeCompte);
         double faciliterCaisse=0;
         if(cp instanceof CompteCourant)
             faciliterCaisse=((CompteCourant) cp).getDecouvert();
         if (cp.getSolde()+faciliterCaisse<montant)
             throw new RuntimeException("Votre solde est insufisante");
        Retrait r=new Retrait(new Date(),montant,cp);
        operationRepository.save(r);
        cp.setSolde(r.getMontant()-montant);
        compteRepository.save(cp);
    }

    @Override
    public void Virement(String codeCompte1, String codeCompte2, double montant) {
              Verser(codeCompte1,montant);
              Retirer(codeCompte2,montant);
    }

    @Override
    public Page < Operation > listOperation(String codeCompte, int page, int size) {
        return null;
    }


    // operationRepository.listOperation(codeCompte, new PageRequest(page,size));


}
