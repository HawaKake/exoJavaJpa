package gestion_pret_boutiquier.Core;

import java.util.List;

import gestion_pret_boutiquier.Data.Entity.Compte;

public interface View<T> {
     public void affiche(List<T> datas);
    public T saisie();
}
