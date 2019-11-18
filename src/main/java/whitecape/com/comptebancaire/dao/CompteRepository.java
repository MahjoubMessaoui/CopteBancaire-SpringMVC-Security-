package whitecape.com.comptebancaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import whitecape.com.comptebancaire.entites.Compte;

public interface CompteRepository extends JpaRepository< Compte,String > {
}
