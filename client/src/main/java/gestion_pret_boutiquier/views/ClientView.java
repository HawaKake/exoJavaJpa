package gestion_pret_boutiquier.views;

import java.util.List;
import java.util.Scanner;

import com.google.protobuf.Service;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Compte;

public class ClientView  implements ClientViewInter{
     private Scanner scanner = new Scanner(System.in);

  

     @Override
     public void affiche(List<Client> datas ) {
          for (Client data : datas) {
               System.out.println(data.toString());}
}
     @Override
     public Client saisie() {
          System.out.print("Entrez le nom du client : ");
          String surname = scanner.nextLine();
          System.out.print("Entrez le numéro de téléphone du client : ");
          String telephone = scanner.nextLine();
          System.out.print("Entrez l'adresse du client : ");
          String adresse = scanner.nextLine();
          return new Client(surname, telephone, adresse);}
          

          @Override
          public String telephone(){
               System.out.println("entrer le numero de telephone du client");
               return(scanner.nextLine());
          };

     @Override
     public void afficherParTel(List<Client> datas) {
          String tel=telephone();
          
          for (Client cl : datas) {
               if (cl!=null && cl.getTelephone().compareTo(tel)==0) {
                   System.out.println(cl);
   
          
          }

     
     }

}
      
    
}
