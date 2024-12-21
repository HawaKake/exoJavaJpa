package gestion_pret_boutiquier.Core.factory;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Core.Service;
import gestion_pret_boutiquier.Core.View;
import gestion_pret_boutiquier.Data.Entity.Client;

import gestion_pret_boutiquier.Data.Repository.BD.ClientRepoBD;

import gestion_pret_boutiquier.services.ClienServInter;
import gestion_pret_boutiquier.services.ClientServ;


public class ServFacto implements Factory<ClientServ >{

    
    private ClientRepoBD clientRepo;
  
    
    public ServFacto(ClientRepoBD clientRepo) {
        this.clientRepo = clientRepo;
       
    }


    @Override
    public ClientServ getInstanceClient() {
        return new  ClientServ(clientRepo);
    }


   
    
}
