package tn.test.spring.Services.SecteurActivite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.Fournisseur;
import tn.test.spring.Entity.SecteurActivite;
import tn.test.spring.Services.Fournisseur.FournisseurServiceImp;
import tn.test.spring.Services.GServiceImp;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;


@Service
public class SecteurActiviteServiceImp extends GServiceImp<SecteurActivite, Long> implements SecteurActiviteService {
    @Autowired
    FournisseurServiceImp fournisseurServiceImp ;
    @Override
    @Transactional
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur fournisseur = fournisseurServiceImp.findById(fournisseurId);
        SecteurActivite secteurActivite = this.findById(secteurActiviteId);
        Set<Fournisseur> fournisseurs  = new HashSet<>() ;
        fournisseurs.add(fournisseur);

       secteurActivite.setFournisseurs(fournisseurs);
       secteurActivite.getFournisseurs().add(fournisseur);

    }
}

