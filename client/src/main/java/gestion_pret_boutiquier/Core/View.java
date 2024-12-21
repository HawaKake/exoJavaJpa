package gestion_pret_boutiquier.Core;

import java.util.List;



public interface View<T> {
     public void affiche(List<T> datas);
    public T saisie();
}
