package gestion_pret_boutiquier.views;

import java.util.List;

import gestion_pret_boutiquier.Core.View;
import gestion_pret_boutiquier.Data.Entity.Compte;

public interface CompteViewInter  {

    Compte saisie();
     void affiche(List<Compte> datas);
}
