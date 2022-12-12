package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Facture;
import tn.test.spring.Entity.Stock;
import tn.test.spring.Services.Facture.FactureService;

import java.util.List;

@RestController
@RequestMapping("/Facture")
@CrossOrigin(origins = "http://localhost:4200")
public class FactureController {
    @Autowired
    FactureService factureService;

//    @GetMapping("/{idFournisseur}")
//    public List<Facture> getFacturesByFournisseur(@PathVariable(value = "idFournisseur") Long idFournisseur) {
//        return factureService.getFacturesByFournisseur(idFournisseur);
//    }

//    @PostMapping("/addAndAssign/{idFour}")
//    public Facture addFacture(@RequestBody Facture facture, @PathVariable(value = "idFour") long idFour) {
//
//        return factureService.addFacture(facture, idFour);
//    }




    @GetMapping
    public List<Facture> retrieveAll() {
        return factureService.retrieveAll();
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
