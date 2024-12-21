package gestion_pret_boutiquier.services;


import java.util.List;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Core.Service;
import gestion_pret_boutiquier.Data.Entity.Client;

public class ClientServ implements ClienServInter {
    private Repository<Client> clientRepo;



    public ClientServ(Repository<Client> clientRepo) {
        this.clientRepo = clientRepo;
    }



    @Override
    public void Create(Client ob) {
        clientRepo.insert(ob);
    }


    @Override
    public List<Client> show() {
        System.out.println(clientRepo.selectAll());
        return clientRepo.selectAll();
    }

   

  

   

   

    
    
}
