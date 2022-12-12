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
    FactureService factureService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Facture save(@RequestBody Facture fa) throws Exception {
        Facture Response = (Facture) factureService.add(fa);
        return Response;
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Facture> RetrieveAll() {
        try {
            return factureService.retrieveAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        try {
            factureService.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @GetMapping("/{idFournisseur}")
    public List<Facture> getFacturesByFournisseur(@PathVariable(value = "idFournisseur") Long idFournisseur) {
        return factureService.getFacturesByFournisseur(idFournisseur);
    }

    @PostMapping("/add")
    public Facture add(@RequestBody Facture s) {

        return factureService.add(s);
    }


    @GetMapping("/{id}")
    public Facture retrieveFacture(@PathVariable Long id) {

        return factureService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable Long id) {

        factureService.delete(id);
    }

    @PutMapping
    public Facture updateStock(@RequestBody Facture s) {

        return factureService.update(s);
    }








}
