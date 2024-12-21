package gestion_pret_boutiquier.Data.Repository.BD;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Core.RepositoryJpaimpl;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Commande;
import gestion_pret_boutiquier.Data.Entity.Detail;

public class DetailRepoBd extends RepositoryJpaimpl<Detail> implements Repository<Detail> {
    

     public DetailRepoBd () {
        super(Detail.class);
        table = "Detail";
        
    }
}
