package tn.test.spring.Services.DetailFournisseur;

import tn.test.spring.Entity.DetailFournisseur;
import tn.test.spring.Services.GService;

public interface DetailFoutnisseurService extends GService<DetailFournisseur, Long> {
    void AddandassignDetailsFToFournisseur(DetailFournisseur df, Long idF);


     DetailFournisseur findDetailFournisseurByFournisseur(Long idF);


}

