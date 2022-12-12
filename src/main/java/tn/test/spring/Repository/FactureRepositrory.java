package tn.test.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.test.spring.Entity.Facture;
import tn.test.spring.Entity.Fournisseur;


import java.util.List;

public interface FactureRepositrory extends JpaRepository<Facture, Long> {
    List<Facture> getFacturesByFournisseur(Fournisseur fournisseur);

}
