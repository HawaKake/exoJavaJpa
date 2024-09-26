package gestion_pret_boutiquier.Data.Entity;

import java.util.ArrayList;
import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id ;
    @Column(length = 25,unique = true)
    private String telephone;
    @Column(length = 25,unique = true)
    private String surname;
    @Column(length = 250,unique = false)
    private String address;

    @JoinColumn
    @OneToOne
    private Compte compte;
    




    public Client() {
    }




    public Client(String surname, String telephone, String address) {
        this.surname = surname;
        this.telephone = telephone;
        this.address = address;
    }




   
    
}
