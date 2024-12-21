package gestion_pret_boutiquier.Data.Repository.BD;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Core.RepositoryJpaimpl;
import gestion_pret_boutiquier.Data.Entity.Article;
import gestion_pret_boutiquier.Data.Entity.Client;








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

import lombok.Data;

public class ArticleRepoBd extends RepositoryJpaimpl<Article> implements Repository<Article>{

    public  ArticleRepoBd () {

        super(Article.class);
        table = "Article";
        
    }
    
}
