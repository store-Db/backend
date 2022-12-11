package tn.test.spring.Services.DetailFournisseur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.DetailFournisseur;
import tn.test.spring.Entity.Fournisseur;
import tn.test.spring.Repository.DetailFournisseurRepository;
import tn.test.spring.Services.Fournisseur.FournisseurService;
import tn.test.spring.Services.Fournisseur.FournisseurServiceImp;
import tn.test.spring.Services.GServiceImp;

import javax.transaction.Transactional;

@Service
public class DetailFournisseurServiceImp extends GServiceImp<DetailFournisseur, Long> implements DetailFoutnisseurService {

    @Autowired
    DetailFournisseurRepository detailFournisseurRepository;
    @Autowired
    @Lazy
    FournisseurService fournisseurService;
    @Override
    public void AddandassignDetailsFToFournisseur(DetailFournisseur df, Long idF) {

    }

    @Override
    public DetailFournisseur findDetailFournisseurByFournisseur(Long idF) {
        Fournisseur f = fournisseurService.findById(idF);
        System.out.println(detailFournisseurRepository.findDetailFournisseurByFournisseur(f));
        return detailFournisseurRepository.findDetailFournisseurByFournisseur(f);
    }

}

