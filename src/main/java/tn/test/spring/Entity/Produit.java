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
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;

    private String CodeProduit;

    private String libelleProduit;

    private float prix;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Temporal(TemporalType.DATE)
    private Date dateDernierModification;

    private boolean archive;

    @ManyToOne(cascade = CascadeType.ALL)
    private CategorieProduit categorieProduit;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Stock stock;

    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactures;
}
