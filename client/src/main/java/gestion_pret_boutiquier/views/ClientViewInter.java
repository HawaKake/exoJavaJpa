package gestion_pret_boutiquier.views;

import java.util.List;

import gestion_pret_boutiquier.Core.View;
import gestion_pret_boutiquier.Data.Entity.Client;

public interface ClientViewInter  extends View<Client> {
   
     void afficherParTel(List<Client> datas);
     String telephone();
    
}
