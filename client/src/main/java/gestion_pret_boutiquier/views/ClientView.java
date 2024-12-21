package gestion_pret_boutiquier.views;

import java.util.List;
import java.util.Scanner;

import com.google.protobuf.Service;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Data.Entity.Client;
 

public class ClientView  implements ClientViewInter{
     private Scanner scanner = new Scanner(System.in);

  

     @Override
     public void affiche(List<Client> datas ) {
          for (Client data : datas) {
               System.out.println(data.toString());}
}
     @Override
  

public Client saisie() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrez l'identifiant : ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Consommer le retour à la ligne

    System.out.print("Entrez le numéro de téléphone : ");
    String telephone = scanner.nextLine();

    System.out.print("Entrez le nom : ");
    String nom = scanner.nextLine();

    System.out.print("Entrez le prénom : ");
    String prenom = scanner.nextLine();

    System.out.print("Entrez la ville : ");
    String ville = scanner.nextLine();

    System.out.print("Entrez le quartier : ");
    String quartier = scanner.nextLine();

    System.out.print("Entrez le numéro de villa : ");
    String numerovilla = scanner.nextLine();

  
    return new Client(id, telephone, nom, prenom, ville, quartier, numerovilla);
}
          

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
