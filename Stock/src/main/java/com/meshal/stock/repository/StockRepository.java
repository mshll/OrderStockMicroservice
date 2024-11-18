package com.meshal.stock.repository;

import com.meshal.stock.entity.StockEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends CrudRepository<StockEntity, Long> {
    Iterable<StockEntity> findByItem(String item);
    
    List<StockEntity> findAll();
}