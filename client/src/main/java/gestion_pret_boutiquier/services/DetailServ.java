package gestion_pret_boutiquier.services;

import java.util.List;

import gestion_pret_boutiquier.Core.Repository;
import gestion_pret_boutiquier.Data.Entity.Client;
import gestion_pret_boutiquier.Data.Entity.Detail;

public class DetailServ  implements DetailServInter{

    private Repository<Detail> DetailRepo;




    @Override
    public void Create(Detail ob) {
        DetailRepo.insert(ob);
    }


    @Override
    public List<Detail> show() {
        System.out.println(DetailRepo.selectAll());
        return DetailRepo.selectAll();
    }
}
