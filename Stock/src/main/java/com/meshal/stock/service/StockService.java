package com.meshal.stock.service;

import com.meshal.stock.bo.CreateStockRequest;
import com.meshal.stock.bo.UpdateStockResponse;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);
}