package gestion_pret_boutiquier.Core.factory;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Repository.BD.ClientRepoBD;

public class EntityFacto implements Factory<Client>{

    public EntityFacto () {
      
    }


    @Override
    public Client getInstanceClient() {
        return new Client();
    }

 



    
}
