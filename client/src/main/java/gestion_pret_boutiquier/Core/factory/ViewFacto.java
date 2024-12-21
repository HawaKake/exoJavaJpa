package gestion_pret_boutiquier.Core.factory;

import gestion_pret_boutiquier.Core.View;
import gestion_pret_boutiquier.Data.Entity.Client;

import gestion_pret_boutiquier.views.ClientView;
import gestion_pret_boutiquier.views.ClientViewInter;



public class ViewFacto implements Factory<ClientViewInter>{
    

    public ViewFacto() {
    }



    @Override
    public ClientViewInter getInstanceClient() {
      return new ClientView();
    }




    
  
    

    
    
}
