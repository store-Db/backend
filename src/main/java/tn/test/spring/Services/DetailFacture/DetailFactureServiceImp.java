package tn.test.spring.Services.DetailFacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.DetailFacture;
import tn.test.spring.Entity.Facture;
import tn.test.spring.Repository.DetailFactureRepository;
import tn.test.spring.Repository.FactureRepositrory;
import tn.test.spring.Services.GServiceImp;

import java.util.List;
import java.util.Set;

@Service
public class DetailFactureServiceImp extends GServiceImp<DetailFacture, Long> implements DetailFactureService {

    @Autowired
    DetailFactureRepository detailFactureRepository ;
    @Autowired
    FactureRepositrory factureRepositrory ;

    @Override
    public Set<DetailFacture> findByFacture(long id) {
        Facture f = factureRepositrory.findById(id).orElse(null) ;
        if(f!=null){
            return  detailFactureRepository.getAllByFacture(f);
        }else
         return null;
    }

    @Override
    public DetailFacture addDetail(long idFacture,DetailFacture detailFacture) {
        Facture f = factureRepositrory.findById(idFacture).orElse(null) ;
        if(f!=null){
            detailFacture.setFacture(f);
            return  detailFactureRepository.save(detailFacture);
        }else
            return null;
    }

    @Override
    public void deleteD(DetailFacture detailFacture ) {
        //detailFactureRepository.deleteById(id);
        detailFactureRepository.delete(detailFacture);

    }

    @Override
    public Long idFacture(long id) {

            DetailFacture d =   detailFactureRepository.findById(id).orElse(null);

            return d.getFacture().getIdFacture();
        }


}

