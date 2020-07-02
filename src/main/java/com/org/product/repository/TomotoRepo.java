package com.org.product.repository;

import com.org.product.model.Tomoto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TomotoRepo extends MongoRepository<Tomoto,Integer> {

   public  Tomoto  findByBoxId(Integer boxId);

   public void deleteByBoxId(Integer boxId);

}
