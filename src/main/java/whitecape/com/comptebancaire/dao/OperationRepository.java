package whitecape.com.comptebancaire.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import whitecape.com.comptebancaire.entites.Operation;

public interface OperationRepository extends JpaRepository< Operation,Long > {
  //  @Query("select o from Operation  where o.compte.codeCompte:=x order by o.dateOper desc")
    //public Page<Operation> listOperation(@Param("x") String codeCompte, Pageable pageable);
}
