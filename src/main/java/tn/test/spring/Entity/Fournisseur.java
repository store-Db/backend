package tn.test.spring.Entity;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournissuer;

    private String CodeFournisseur;

    private String libelleFournisseur;
    @Enumerated(EnumType.STRING)
    private tn.test.spring.Entity.CategorieFournisseur CategorieFournisseur;

    @ManyToMany(mappedBy = "fournisseurs")
    @JsonIgnore
    private Set<SecteurActivite> secteurActivites;

    @OneToOne
    @JsonIncludeProperties({"idDetailFournisseur"})
    @JsonIgnore
    private DetailFournisseur detailFournisseur;

    @OneToMany(mappedBy = "fournisseur")
    @JsonIgnore
    private Set<Facture> factures;

    private String addresse ;
}
