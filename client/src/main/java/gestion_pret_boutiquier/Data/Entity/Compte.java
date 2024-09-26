package gestion_pret_boutiquier.Data.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "COMPTE")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    @Column(length = 25, unique = true)
    private String login;
    @Column(length = 70, unique = true)

    private String password;
    @Column(length = 25, unique = true)

    @ColumnDefault("true")
    private boolean etat;

    @JoinColumn
    @OneToOne
    private Client client;

    public Compte() {
    }

    public Compte(String email, String login, String password) {
        this.email = email;
        this.login = login;
        this.password = password;
        this.etat = true;
    }

}