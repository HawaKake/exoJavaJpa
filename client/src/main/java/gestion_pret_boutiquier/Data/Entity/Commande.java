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
@Table(name = "Commande")

public class Commande {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @JoinColumn
    @OneToMany(mappedBy = "detail", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<Detail> details;

   public Commande(Long id, Client client) {
        this.id = id;
        this.client = client;
    }

public Commande() {

    }


public void addDetail( Detail dtl) {
    this.details.add(dtl);
}

    
}
