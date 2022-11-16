package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.test.spring.Services.SecteurActivite.SecteurActiviteServiceImp;

@RestController
@RequestMapping("/SA")
public class SecteurActiviteController {

   @Autowired
   SecteurActiviteServiceImp secteurActiviteServiceImp ;
    @GetMapping("{idSA}/{idF}")
    public void assignSecteurActiviteToFournisseur(@PathVariable(value = "idSA") Long fournisseurId, @PathVariable(value = "idF") Long secteurActiviteId) {
        secteurActiviteServiceImp.assignSecteurActiviteToFournisseur(fournisseurId, secteurActiviteId);
    }
}
