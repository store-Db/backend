package tn.test.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;

    private float montantRemise;

    private float montantFacture;

    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;

    @Temporal(TemporalType.DATE)
    private Date dateDernierModification;

    private boolean archive;

    @OneToMany(mappedBy = "facture")
    @JsonIgnore
    private Set<Reglement> reglements;

    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;

    @ManyToOne(cascade = CascadeType.ALL)
    private Fournisseur fournisseur;
}
