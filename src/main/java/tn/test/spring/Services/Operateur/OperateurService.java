package tn.test.spring.Services.Operateur;

import tn.test.spring.Entity.Operateur;
import tn.test.spring.Services.GService;

public interface OperateurService extends GService<Operateur, Long> {
    public void assignOperateurToFacture(Long idOperateur, Long idFacture);
}
