package gestion_pret_boutiquier.services;

import java.util.List;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Core.Service;
import gestion_pret_boutiquier.services.ClientServ;
import gestion_pret_boutiquier.services.CompteServ;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Compte;

public class CompteServ implements Service<Compte> {
     private Repository<Compte> compteRepo;

     public CompteServ(Repository<Compte> compteRepo) {
          this.compteRepo = compteRepo;
     }

     @Override
     public void Create(Compte ob) {
          compteRepo.insert(ob);
     }

     @Override
     public List<Compte> show() {
          return compteRepo.selectAll(  );
     }

    



     }
        
    

    

