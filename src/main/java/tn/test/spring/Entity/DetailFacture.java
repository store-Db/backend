package tn.test.spring.Entity;

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

    @ManyToOne(cascade = CascadeType.ALL)
    private Facture facture;

    @ManyToOne(cascade = CascadeType.ALL)
    private Produit produit;
}
