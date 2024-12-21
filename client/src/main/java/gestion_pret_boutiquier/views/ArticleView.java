package gestion_pret_boutiquier.views;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

import gestion_pret_boutiquier.Data.Entity.Article;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.views.ArticleViewInter;

public class ArticleView  implements ArticleViewInter{

    @Override
    public void affiche(List<Article> datas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'affiche'");
    }

    @Override
    public Article saisie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saisie'");
    }


    public Article chercherArticle(ArrayList<Article> datas){
        int choix;
        do {
    
           
            for (int i = 0; i < datas.size(); i++) {
                Article article = datas.get(i);
                System.out.println(  i+1 + "/ " + article);
            }
            System.out.println("le numero d'article a archiver");
           
            choix=scanner.nextInt();
        }while (choix> datas.size() || choix<1 );
    
        return(datas.get(choix-1));
    }
    
}
