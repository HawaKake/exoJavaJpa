package gestion_pret_boutiquier.Data.Repository.BD;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Core.RepositoryJpaimpl;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Commande;

public class CommandeRepoBd extends RepositoryJpaimpl<Commande> implements Repository<Commande> {
    public CommandeRepoBd() {
        super(Commande.class);
        table = "Commande";
        
    }
    
    
}
