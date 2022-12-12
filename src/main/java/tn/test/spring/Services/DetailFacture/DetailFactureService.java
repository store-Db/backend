package tn.test.spring.Services.DetailFacture;

import tn.test.spring.Entity.DetailFacture;
import tn.test.spring.Entity.Facture;
import tn.test.spring.Services.GService;

import java.util.List;
import java.util.Set;

public interface DetailFactureService extends GService<DetailFacture, Long> {
    Set<DetailFacture> findByFacture(long id );
public DetailFacture addDetail(long idFacture , DetailFacture detailFacture);
    void deleteD(DetailFacture detailFacture );
    public   Long idFacture(long id );
}

