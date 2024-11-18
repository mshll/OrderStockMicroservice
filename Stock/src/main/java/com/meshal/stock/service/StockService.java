package com.meshal.stock.service;

import com.meshal.stock.bo.CreateStockRequest;
import com.meshal.stock.bo.UpdateStockResponse;
import com.meshal.stock.entity.StockEntity;

import java.util.List;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);

    List<StockEntity> getStocks();
}