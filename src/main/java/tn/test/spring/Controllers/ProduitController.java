package tn.test.spring.Controllers;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import tn.test.spring.Entity.Produit;

import tn.test.spring.Entity.Stock;
import tn.test.spring.Services.Produit.ProduitServiceImp;

import java.util.List;

@RestController
@RequestMapping("/Produit")
public class ProduitController {

    @Autowired
    ProduitServiceImp produitServiceImp;;

    @PostMapping
    public Produit addProduit(@RequestBody Produit produit){
        return produitServiceImp.add(produit);
    }
    @GetMapping
    public List<Produit> getAll(){
        return produitServiceImp.retrieveAll();
    }

    @PutMapping
    public Produit updateProduit(@RequestBody Produit produit){
       return produitServiceImp.update(produit);
    }
    @GetMapping("/{id}")
    public Produit getProduit(@PathVariable(value = "id") long id){
        return produitServiceImp.findById(id);
    }

    @GetMapping("/{idProduit}/{idStock}")
    public Produit addProduitToStock(@PathVariable(value = "idProduit") long idProduit,@PathVariable(value = "idStock") long idStock){
       produitServiceImp.assignProduitToStock(idProduit,idStock);
       return produitServiceImp.findById(idProduit)  ;
    }




}