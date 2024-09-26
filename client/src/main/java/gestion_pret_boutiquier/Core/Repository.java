package gestion_pret_boutiquier.Core;

import java.util.List;

public interface Repository<T> {
      boolean insert(T objet);
       List<T> selectAll();
   
}
