package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Reglement;
import tn.test.spring.Services.Reglement.ReglementService;

import java.util.Date;
import java.util.List;

@RestController
//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://angular:8080")
@RequestMapping("/reglement")

public class ReglementController {

    @Autowired
    ReglementService reglementServiceImp;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Reglement save(@RequestBody Reglement reg) throws Exception {
        Reglement Response = (Reglement) reglementServiceImp.add(reg);
        return Response;
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Reglement> RetrieveAll() {
        try {
            return reglementServiceImp.retrieveAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        try {
            reglementServiceImp.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public Reglement update(@RequestBody Reglement reg) throws Exception {
        return reglementServiceImp.update(reg);
    }
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
