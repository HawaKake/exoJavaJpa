package gestion_pret_boutiquier.views;
import java.util.List;
import java.util.Scanner;

import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Compte;
import gestion_pret_boutiquier.Core.View;;
public class CompteView implements CompteViewInter  {
    
    private Scanner scanner = new Scanner(System.in);

    @Override
      public Compte saisie() {
        System.out.print("Entrez l'email du compte : ");
        String email = scanner.nextLine();
        System.out.print("Entrez le login du compte : ");
        String login = scanner.nextLine();
        System.out.print("Entrez le mot de passe du compte : ");
        String password = scanner.nextLine();
        Compte compte = new Compte(email, login, password);
        //CompteRepository.listCompte.add(compte);
        return compte;

    }
    
    @Override
    public void affiche(List<Compte> datas) {
      for (Compte data : datas) {
           System.out.println(data);   
      }
    } 
}
