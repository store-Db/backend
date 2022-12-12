package tn.test.spring.Repository;

import tn.test.spring.Entity.DetailFacture;
import tn.test.spring.Entity.Facture;

import java.util.List;
import java.util.Set;

public interface DetailFactureRepository extends GRepository<DetailFacture, Long> {
    Set<DetailFacture>  getAllByFacture(Facture  f );
  void deleteDetailFactureByIdDetailFacture(Long id) ;
}
