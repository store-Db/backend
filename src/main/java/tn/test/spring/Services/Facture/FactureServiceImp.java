package tn.test.spring.Services.Facture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.Facture;
import tn.test.spring.Entity.Fournisseur;
import tn.test.spring.Repository.FactureRepositrory;
import tn.test.spring.Services.Fournisseur.FournisseurService;
import tn.test.spring.Services.GServiceImp;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FactureServiceImp extends GServiceImp<Facture, Long> implements FactureService {

    @Autowired
    FactureRepositrory factureRepositrory;

    @Autowired
    FournisseurService fournisseurServiceImp;

    @Override
    public List<Facture> getFacturesByFournisseur(Long idFournisseur) {
        Fournisseur fournisseur = fournisseurServiceImp.findById(idFournisseur);
        return factureRepositrory.getFacturesByFournisseur(fournisseur);
    }

    @Override
    @Transactional
    public Facture addFacture(Facture f, long idFournisseur) {
        Fournisseur fournisseur = fournisseurServiceImp.findById(idFournisseur);
        f.setFournisseur(fournisseur);
        this.add(f);
        return f;
    }


}

