package gestion_pret_boutiquier;



import java.util.Scanner;
import gestion_pret_boutiquier.Core.Service;

import gestion_pret_boutiquier.Core.Repository;

import gestion_pret_boutiquier.Data.Entity.Client;

import gestion_pret_boutiquier.Data.Repository.BD.ClientRepoBD;

import gestion_pret_boutiquier.services.ClienServInter;
import gestion_pret_boutiquier.services.ClientServ;

import gestion_pret_boutiquier.views.ClientView;
import gestion_pret_boutiquier.views.ClientViewInter;

import gestion_pret_boutiquier.Core.View;
import gestion_pret_boutiquier.Core.factory.RepoFacto;
import gestion_pret_boutiquier.Core.factory.ServFacto;
import gestion_pret_boutiquier.Core.factory.ViewFacto;
import gestion_pret_boutiquier.Core.factory.EntityFacto;
import gestion_pret_boutiquier.Core.factory.Factory;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
 
  
    ClientRepoBD clientRepo= RepoFacto.getInstanceClient();
    


   
    //couche service
    Factory<ClientServ> servFacto= new ServFacto( clientRepo);
    ClienServInter clientserv=servFacto.getInstanceClient();
   




    // Couche View
    Factory<ClientViewInter> viewFacto= new ViewFacto();
    ClientViewInter clientView= viewFacto.getInstanceClient();
   

    // entity

    

    Client cl=new Client();
    Commande cmd=new Commande();
    Detail dtl=new Detail();
    Article ar =new Article();

       


         
        


    int choix;
      
    do {
        choix=  menu() ;
        switch (choix) {
             case 1: clientView.afficherParTel(clientserv.show());
                    ;
              break;
              case 2: 
              break;
              case 3:   
              break;
              case 4:
              break;
              case 5:   
              break;
             
          }
      }while(choix !=6);
}




    public static int menu() {
        System.out.println("===================================");
        System.out.println("         MENU PRINCIPAL");
        System.out.println("===================================");
        System.out.println("1. Rechercher un client");
        System.out.println("2. supprimer un article");
        System.out.println("3. modifier le prix ");
        System.out.println("4. modifier la quantite ");
        System.out.println("5. Ajouter une commande a un client");
        System.out.println("6. Quitter");
        System.out.println("===================================");
        System.out.print("Veuillez choisir une option : ");
        return scanner.nextInt();
    }
}