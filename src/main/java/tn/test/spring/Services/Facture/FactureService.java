package tn.test.spring.Services.Facture;

import tn.test.spring.Entity.Facture;

import javax.transaction.Transactional;
import java.util.List;

public interface FactureService {
    List<Facture> getFacturesByFournisseur(Long idFournisseur);


    Facture addFacture(Facture f, long idFournisseur);


}
