package whitecape.com.comptebancaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import whitecape.com.comptebancaire.entites.Client;

public interface ClientRepository extends JpaRepository< Client,Long > {
}
