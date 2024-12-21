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
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id ;
    @Column(length = 25,unique = true)
    private String telephone;
    @Column(length = 25,unique = true)
    private String nom;
    @Column(length = 25,unique = true)
    private String prenom;
    @Column(length = 250,unique = false)
    private String ville;
    @Column(length = 250,unique = false)
    private String quartier;
    @Column(length = 250,unique = false)
    private String numeroVilla;

    @JoinColumn
     @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commande> commandes;

    public Client(int id, String telephone, String nom, String prenom, String ville, String quartier,
            String numeroVilla) {
        this.id = id;
        this.telephone = telephone;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.quartier = quartier;
        this.numeroVilla = numeroVilla;
    }

    public Client() {
    }
    
    public void addCommande( Commande cmd) {
        this.commandes.add(cmd);
    }







   
    
}
