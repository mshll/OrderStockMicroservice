package com.meshal.stock.controller;


import com.meshal.stock.bo.AccountResponse;
import com.meshal.stock.bo.CreateStockRequest;
import com.meshal.stock.bo.UpdateStockResponse;
import com.meshal.stock.service.StockService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/addItems")
    public void addItems(@RequestBody CreateStockRequest stock) {
        stockService.addItems(stock);
    }

    @PostMapping("/updateStock")
    public UpdateStockResponse updateStock(@RequestBody CreateStockRequest request) {
        return stockService.updateStock(request);
    }

    @GetMapping("/account")
    public AccountResponse account() {
        return new AccountResponse(stockService.getStocks());
    }
}