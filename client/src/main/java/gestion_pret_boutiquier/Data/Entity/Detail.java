package gestion_pret_boutiquier.Data.Entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Detail")

public class Detail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idCl", nullable = false)
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idCmd", nullable = false)
    private Commande commande;

    @Column(nullable = false)
    private int qteCmd; 

    @Column(nullable = false)
    private double montant;

    

    public Detail(Long id, Article article, Commande commande, int qteCmd, double montant) {
        this.id = id;
        this.article = article;
        this.commande = commande;
        this.qteCmd = qteCmd;
        this.montant = montant;
    }



    public Detail() {
    }


    
}
