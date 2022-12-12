package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Facture;
import tn.test.spring.Entity.Reglement;
import tn.test.spring.Services.Facture.FactureService;

import java.util.List;

@RestController
@RequestMapping("/facture")
@CrossOrigin(origins = "http://localhost:4200")
public class FactureController {
    @Autowired
    FactureService factureServiceImp;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Facture save(@RequestBody Facture fa) throws Exception {
        Facture Response = (Facture) factureServiceImp.add(fa);
        return Response;
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Facture> RetrieveAll() {
        try {
            return factureServiceImp.retrieveAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        try {
            factureServiceImp.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @GetMapping("/{idFournisseur}")
    public List<Facture> getFacturesByFournisseur(@PathVariable(value = "idFournisseur") Long idFournisseur) {
        return factureServiceImp.getFacturesByFournisseur(idFournisseur);
    }

    @PostMapping("/addAndAssign/{idFour}")
    public Facture addFacture(@RequestBody Facture facture, @PathVariable(value = "idFour") long idFour) {

        return factureServiceImp.addFacture(facture, idFour);
    }

}
