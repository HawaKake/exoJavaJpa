package gestion_pret_boutiquier.views;


import java.util.List;
import java.util.Scanner;

import gestion_pret_boutiquier.Data.Entity.Detail;
import gestion_pret_boutiquier.views.DetailViewInter;

public class DetailView  implements DetailViewInter{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void affiche(List<Detail> datas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'affiche'");
    }

    @Override
    public Detail saisie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saisie'");
    }

    
}
