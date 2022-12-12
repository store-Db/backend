package tn.test.spring.Services.Fournisseur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.DetailFournisseur;
import tn.test.spring.Entity.Fournisseur;
import tn.test.spring.Repository.DetailFournisseurRepository;
import tn.test.spring.Services.DetailFournisseur.DetailFoutnisseurService;
import tn.test.spring.Services.GServiceImp;

import javax.transaction.Transactional;

@Service
public class FournisseurServiceImp extends GServiceImp<Fournisseur, Long> implements FournisseurService {

        @Autowired
        DetailFoutnisseurService detailFoutnisseurService;
        //delete fournisseur and details fournisseur
        @Autowired
        DetailFournisseurRepository detailFournisseurRepository;
        @Override
        @Transactional
        public void deleteF(Long id) {
            Fournisseur f = findById(id);
            DetailFournisseur df = detailFournisseurRepository.findDetailFournisseurByFournisseur(f);
            if(df != null) {
                System.out.println(df.getIdDetailFournisseur());


                    detailFournisseurRepository.deleteById(df.getIdDetailFournisseur());
                 this.delete(id);
           }else {
               System.out.println("a not found");
               this.delete(id);
           }

        }

}

