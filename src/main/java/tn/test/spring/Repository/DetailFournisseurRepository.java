package tn.test.spring.Repository;

import tn.test.spring.Entity.DetailFournisseur;
import tn.test.spring.Entity.Fournisseur;

public interface DetailFournisseurRepository extends GRepository<DetailFournisseur, Long> {
    DetailFournisseur findDetailFournisseurByFournisseur(Fournisseur fournisseur);

}
