package whitecape.com.comptebancaire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import whitecape.com.comptebancaire.dao.ClientRepository;
import whitecape.com.comptebancaire.dao.CompteRepository;
import whitecape.com.comptebancaire.entites.Client;
import whitecape.com.comptebancaire.entites.Compte;
import whitecape.com.comptebancaire.entites.Retrait;
import whitecape.com.comptebancaire.entites.Versement;
import whitecape.com.comptebancaire.metier.BanqueMetierImpl;
import whitecape.com.comptebancaire.metier.IBanqueMetier;

import java.util.Date;

@SpringBootApplication
public class ComptebancaireApplication  {
    public static void main(String[] args) {   SpringApplication.run(ComptebancaireApplication.class, args);;
   /* @Autowired
    private ClientRepository clientRepository;
    @Autowired
   private CompteRepository compteRepository;
    @Autowired
    private IBanqueMetier iBanqueMetier;
    public static void main(String[] args) {
*/



    }
   /* @Override
    public void run(String... args) throws Exception {
        Client c1 = clientRepository.save(new Client("mahjoub", "messaoui@yahoo.fr", "op1"));
        Client c2 = clientRepository.save(new Client("mahjoub", "messaoui@yahoo.f", "op1"));
        iBanqueMetier.Verser("c1",111111);
    }

    */
    }

