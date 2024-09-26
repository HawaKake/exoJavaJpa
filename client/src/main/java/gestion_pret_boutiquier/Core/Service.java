package gestion_pret_boutiquier.Core;

import java.util.List;

import gestion_pret_boutiquier.Data.Entity.Compte;

public interface Service <T>{


    public void Create(T ob); 
    List<T> show();
     
   
   
}

