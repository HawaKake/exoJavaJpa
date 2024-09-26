package gestion_pret_boutiquier;


import java.util.Scanner;
//import gestion_pret_boutiquier.Core.Service;

import gestion_pret_boutiquier.Core.Repository;

import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Compte;
import gestion_pret_boutiquier.Data.Repository.BD.ClientRepoBD;
import gestion_pret_boutiquier.Data.Repository.BD.CompteRepoBD;
import gestion_pret_boutiquier.services.ClienServInter;
import gestion_pret_boutiquier.services.ClientServ;
import gestion_pret_boutiquier.services.CompteServ;
import gestion_pret_boutiquier.views.ClientView;
import gestion_pret_boutiquier.views.ClientViewInter;
import gestion_pret_boutiquier.views.CompteView;
import gestion_pret_boutiquier.views.CompteViewInter;
import gestion_pret_boutiquier.Core.View;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       // fabrique
      // Repository <Client> clientRepo=new ClientRepoList();
       //Repository <Compte> compteRepo=new CompteRepoList();

      Repository <Client> clientRepo=new ClientRepoBD();
      Repository <Compte> compteRepo=new CompteRepoBD();

       ClienServInter clientserv=new ClientServ(clientRepo);
       CompteServ compteserv=new CompteServ(compteRepo);

       ClientViewInter clientView=new ClientView();
       CompteViewInter compteView=new CompteView();

        Client cl=new Client();
        Compte cpt=new Compte();
        Class<Client> typeCl;
        Class<Compte> type;


         
        int choix;
      
        do {
            choix=  menu() ;
            switch (choix) {
                 case 1:cl=clientView.saisie();
                        clientserv.Create(cl);
                  break;
                  case 2: clientView.affiche(clientserv.show());
                  break;
                  case 3:    clientView.afficherParTel(clientserv.show()); 
                  break;
                 case 4:cpt=compteView.saisie();
                        compteserv.Create(cpt);
              
                  break;
                  case 5:compteView.affiche(compteserv.show());
                  break;
              }
          }while(choix !=6);
    }




    public static int menu() {
        System.out.println("1- Créer  un client");
        System.out.println("2- lister les clients ");
        System.out.println("3- rechercher client par telephone");
        System.out.println("4- creer un compte");
        System.out.println("5- lister les comptes");
        System.out.println("6- Quitter");
        return scanner.nextInt();
    }
}