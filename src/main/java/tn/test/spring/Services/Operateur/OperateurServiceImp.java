package tn.test.spring.Services.Operateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.Facture;
import tn.test.spring.Entity.Operateur;
import tn.test.spring.Services.Facture.FactureServiceImp;
import tn.test.spring.Services.GServiceImp;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class OperateurServiceImp extends GServiceImp<Operateur, Long> implements OperateurService {
    @Autowired
    FactureServiceImp factureServiceImp;

    @Override
    @Transactional
    public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
        Operateur operateur = this.findById(idOperateur);
        Facture facture = factureServiceImp.findById(idFacture);
        Set<Facture> factures = new HashSet<>();
        factures.add(facture);
        operateur.setFactures(factures);
        operateur.getFactures().add(facture);
    }
}

