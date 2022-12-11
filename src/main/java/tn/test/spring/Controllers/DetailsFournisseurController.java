package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.DetailFournisseur;
import tn.test.spring.Services.DetailFournisseur.DetailFoutnisseurService;

@RestController
@CrossOrigin
@RequestMapping("/DetailsFournisseur")
public class DetailsFournisseurController {
    @Autowired
    DetailFoutnisseurService detailFoutnisseurService;

    @PostMapping("/addAndAssign/{idFour}")
    public void addDetailsFournisseur(@RequestBody DetailFournisseur df, @PathVariable long idFour) {
        detailFoutnisseurService.AddandassignDetailsFToFournisseur(df, idFour);
    }
    @GetMapping("/all")
    public void getAllDetailsFournisseur(){
        detailFoutnisseurService.retrieveAll();
    }
    @GetMapping("/{id}")
    public DetailFournisseur getDetailsFournisseur(@PathVariable long id){
            return detailFoutnisseurService.findById(id);
    }
    @PostMapping("/add")
    public DetailFournisseur addDetailsFournisseur(@RequestBody DetailFournisseur df){
        return detailFoutnisseurService.add(df);
    }
    @GetMapping("/DF/{id}")
    public DetailFournisseur getDetailsFournisseurByFournisseur(@PathVariable long id){

        return detailFoutnisseurService.findDetailFournisseurByFournisseur(id);
    }
    @PutMapping("/update")
    public DetailFournisseur updateDetailsFournisseur(@RequestBody DetailFournisseur df){
        return detailFoutnisseurService.update(df);
    }
}
