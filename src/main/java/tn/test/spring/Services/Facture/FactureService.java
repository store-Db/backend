package tn.test.spring.Services.Facture;

import tn.test.spring.Entity.Facture;
import tn.test.spring.Services.GService;

import java.util.List;

public interface FactureService extends GService<Facture, Long> {
    List<Facture> getFacturesByFournisseur(Long idFournisseur);


    Facture addFacture(Facture f, long idFournisseur);


}
