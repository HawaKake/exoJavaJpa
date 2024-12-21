package gestion_pret_boutiquier.services;

import java.util.List;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Data.Entity.Article;
import gestion_pret_boutiquier.Data.Entity.Client;

public class ArticleServ implements ArtilcleServInter  {
    private Repository<Article> articleRepo;

   public ArticleServ(Repository<Article> articleRepo) {
        this.articleRepo = articleRepo;
    }


@Override
    public void Create(Article ob) {
        articleRepo.insert(ob);
    }


    @Override
    public List<Article> show() {
        System.out.println(articleRepo.selectAll());
        return articleRepo.selectAll();
    }

    
}
