package tn.test.spring.Services.Fournisseur;

import tn.test.spring.Entity.Fournisseur;
import tn.test.spring.Services.GService;

public interface FournisseurService extends GService<Fournisseur, Long> {
    public void deleteF(Long id);

}

