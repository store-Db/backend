package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Fournisseur;
import tn.test.spring.Services.DetailFournisseur.DetailFoutnisseurService;
import tn.test.spring.Services.Fournisseur.FournisseurService;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
@CrossOrigin
public class FournisseurController {
    @Autowired
    FournisseurService fournisseurServiceImp;

    @Autowired
    DetailFoutnisseurService detailFoutnisseurService;
    @GetMapping("/all")
    public List<Fournisseur> getAllFournisseur(){
        return fournisseurServiceImp.retrieveAll();
    }

    @PostMapping("/add")
    public Fournisseur addFournisseur(@RequestBody Fournisseur f){
        return fournisseurServiceImp.add(f);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFournisseur(@PathVariable long id){

        fournisseurServiceImp.deleteF(id);
    }
    @PutMapping("/update")
    public Fournisseur updateFournisseur(@RequestBody Fournisseur f){
        return fournisseurServiceImp.update(f);
    }

    @GetMapping("/{id}")
    public Fournisseur getFournisseur(@PathVariable long id){
        return fournisseurServiceImp.findById(id);
    }
}
