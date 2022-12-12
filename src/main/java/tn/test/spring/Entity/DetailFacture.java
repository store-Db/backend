package tn.test.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;

    private int qteCommande;

    private float prixTotalDetail;

    private int pourcentageRemise;

    private float montantRemise;

    @ManyToOne(cascade = CascadeType.DETACH,fetch=FetchType.EAGER)

   private Facture facture;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("produit")
    private Produit produit;
}
