package tn.test.spring.Repository;

import tn.test.spring.Entity.Facture;
import tn.test.spring.Entity.Fournisseur;

import java.util.List;

public interface FactureRepositrory extends GRepository<Facture, Long> {
    List<Facture> getFacturesByFournisseur(Fournisseur fournisseur);
}
