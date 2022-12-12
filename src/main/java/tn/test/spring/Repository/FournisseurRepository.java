package tn.test.spring.Repository;


import tn.test.spring.Entity.Fournisseur;

public interface FournisseurRepository extends GRepository<Fournisseur, Long> {
    void deleteFounisseurAndDetailFournisseurByIdFournissuer(Long id);
}
