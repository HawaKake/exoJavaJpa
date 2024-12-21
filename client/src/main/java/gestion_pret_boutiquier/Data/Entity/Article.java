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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Article")

public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    @Column(length = 250,unique = false , nullable = false)
    private String libelle;


    @Column(nullable = false)
    private double prix;


    @Column(nullable = false)
    private int quantiteStock;


    @JoinColumn
    @OneToMany(mappedBy = "detail", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<Detail> details;

   public Article(Long id, String libelle, double prix, int quantiteStock) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
        this.quantiteStock = quantiteStock;
    }

public Article() {
    }

public void addDetail( Detail dtl) {
    this.details.add(dtl);
}
    
}
