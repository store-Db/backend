package tn.test.spring.Repository;

import tn.test.spring.Entity.Facture;
import tn.test.spring.Entity.Reglement;

import java.util.List;

public interface ReglementRepositrory extends GRepository<Reglement, Long> {
    List<Reglement> getReglementByFacture(Facture facture);


}

