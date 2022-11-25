package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Facture;
import tn.test.spring.Services.Facture.FactureService;

import java.util.List;

@RestController
@RequestMapping("/Facture")
public class FactureController {
    @Autowired
    FactureService factureServiceImp;

    @GetMapping("/{idFournisseur}")
    public List<Facture> getFacturesByFournisseur(@PathVariable(value = "idFournisseur") Long idFournisseur) {
        return factureServiceImp.getFacturesByFournisseur(idFournisseur);
    }

    @PostMapping("/addAndAssign/{idFour}")
    public Facture addFacture(@RequestBody Facture facture, @PathVariable(value = "idFour") long idFour) {

        return factureServiceImp.addFacture(facture, idFour);
    }

}
