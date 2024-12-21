package gestion_pret_boutiquier.services;

import java.util.List;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Data.Entity.Article;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Commande;

public class CommandeServ implements CommandeServInter {

    

     private Repository<Commande> commandeRepo;



public CommandeServ(Repository<Commande> commandeRepo) {
        this.commandeRepo = commandeRepo;
    }



   
    public void Create(Commande ob) {
        commandeRepo.insert(ob);
    }


    
    public List<Commande> show() {
        System.out.println(commandeRepo.selectAll());
        return commandeRepo.selectAll();
    }


    
}
