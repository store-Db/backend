package tn.test.spring.Services.SecteurActivite;

import tn.test.spring.Entity.SecteurActivite;
import tn.test.spring.Services.GService;

public interface SecteurActiviteService extends GService<SecteurActivite, Long> {
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long
            secteurActiviteId);
}
