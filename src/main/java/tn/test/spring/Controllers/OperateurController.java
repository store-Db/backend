package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.test.spring.Services.Operateur.OperateurServiceImp;

@RestController
@RequestMapping("/Operateur")
public class OperateurController {
    @Autowired
    OperateurServiceImp operateurServiceImp;

    @GetMapping("/{idOperateur}/{idFacture}")
    public void assignOperateurToFacture(@PathVariable(value = "idOperateur") long idOperateur, @PathVariable(value = "idFacture") long idFacture){
        operateurServiceImp.assignOperateurToFacture(idOperateur,idFacture);
    }

}
