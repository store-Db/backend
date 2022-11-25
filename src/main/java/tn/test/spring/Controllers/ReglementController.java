package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Reglement;
import tn.test.spring.Services.Reglement.ReglementService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reglement")
public class ReglementController {

    @Autowired
    ReglementService reglementServiceImp;

    @GetMapping("/{idFacture}")
    public List<Reglement> retrieveReglementByFacture(@PathVariable(value = "idFacture") Long idFacture) {
        return reglementServiceImp.retrieveReglementByFacture(idFacture);
    }

    @PostMapping("/{idFacture}")
    public Reglement addReglement(@RequestBody Reglement reglement, @PathVariable(value = "idFacture") long idFacture) {

        return reglementServiceImp.addReglement(reglement, idFacture);
    }

    @GetMapping("/{sd}/{ed}")
    public float getChiffreAffaireEntreDeuxDate(@PathVariable(value = "sd") String startDate, @PathVariable(value = "ed") String endDate) {
        Date sd = java.sql.Date.valueOf(startDate);
        Date ed = java.sql.Date.valueOf(endDate);
        return reglementServiceImp.getChiffreAffaireEntreDeuxDate(sd, ed);
    }

    @GetMapping("/precent/{DateDeb}/{DateFin}")
    public float pourcentageRecouvrement(@PathVariable(value = "DateDeb") String DateDeb, @PathVariable(value = "DateFin") String DateFin) {
        Date sd = java.sql.Date.valueOf(DateDeb);
        Date ed = java.sql.Date.valueOf(DateFin);
        return reglementServiceImp.pourcentageRecouvrement(sd, ed);
    }
}
