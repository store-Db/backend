package tn.test.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;

    private String matricule;

    @OneToOne

    private Fournisseur fournisseur;
}
