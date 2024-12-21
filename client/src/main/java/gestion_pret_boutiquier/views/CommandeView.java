package gestion_pret_boutiquier.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestion_pret_boutiquier.Data.Entity.Article;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Commande;
import gestion_pret_boutiquier.Data.Entity.Detail;

public class CommandeView  implements CommandeViewInter {
    private Scanner scanner = new Scanner(System.in);


     @Override
    public void affiche(List<Commande> datas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'affiche'");
    }

    @Override
    public Commande saisie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saisie'");
    }
    

      @Override
     public Commande RechercherCommandeParId(List<Commande> datas) {
          int id=saisieCmdId();
          
          for (Commande cmd: datas) {
               if (cmd!=null && cmd.getId()==id) {
                 return cmd;

   
          
          }

     
     }
     return null;

}



@Override
public int saisieCmdId(){
     System.out.println("entrer le numero de telephone du client");
     return(scanner.nextInt());
};

public List<Article> recupererArticlesCommandes(Commande cmd,List<Article> datas  ){
   
    

       
       
            for (Detail  detail : cmd.getDetails()) {
                List<Article> listAr= new List<Article>();
                Article article=detail.getArticle();
                for (Article ar : datas) {
                    
                    if (ar.getId()==article.getId()) {
                        listAr.add(ar);
                        
                    }   
                }
 
            }
           
       
      
    

    return listAr;
}






    
}
