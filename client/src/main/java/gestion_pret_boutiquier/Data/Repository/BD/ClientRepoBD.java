package gestion_pret_boutiquier.Data.Repository.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Core.RepositoryJpaimpl;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Compte;
import lombok.Data;




public class ClientRepoBD  extends RepositoryJpaimpl<Client> {

    public ClientRepoBD() {
        super(Client.class);
        table = "Client";
        
    }
}