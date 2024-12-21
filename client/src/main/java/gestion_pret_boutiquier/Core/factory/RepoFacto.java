package gestion_pret_boutiquier.Core.factory;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Data.Entity.Client;

import gestion_pret_boutiquier.Data.Repository.BD.ClientRepoBD;


public class RepoFacto implements Factory<ClientRepoBD>{

   
    public RepoFacto() {
      
    }



@Override
public ClientRepoBD getInstanceClient() {
  return new ClientRepoBD();
}



    
}
