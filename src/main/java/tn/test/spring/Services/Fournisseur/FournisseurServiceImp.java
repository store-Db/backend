package tn.test.spring.Services.Fournisseur;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import tn.test.spring.Entity.Fournisseur;
import tn.test.spring.Entity.SecteurActivite;
import tn.test.spring.Services.GServiceImp;
import tn.test.spring.Services.SecteurActivite.SecteurActiviteServiceImp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class FournisseurServiceImp extends GServiceImp<Fournisseur, Long> implements FournisseurService {

    @Autowired
    SecteurActiviteServiceImp secteurActiviteServiceImp;

    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur fournisseur = this.findById(fournisseurId);
        SecteurActivite secteurActivite = secteurActiviteServiceImp.findById(secteurActiviteId);
        Set<SecteurActivite> secteurActivites  = new HashSet<>() ;
        secteurActivites.add(secteurActivite);
        fournisseur.setSecteurActivites(secteurActivites);
        this.update(fournisseur);
    }
}

