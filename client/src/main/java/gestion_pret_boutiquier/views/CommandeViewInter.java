package gestion_pret_boutiquier.views;
import java.util.List;

import gestion_pret_boutiquier.Core.View;
import gestion_pret_boutiquier.Data.Entity.Commande;



public interface CommandeViewInter extends View<Commande> {
   
    public Commande RechercherCommandeParId(List<Commande> datas);
    public int saisieCmdId();
  
   
}

