package tn.test.spring.Services.Stock;

import tn.test.spring.Entity.Stock;

import java.util.List;

public interface StockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);

    String retrieveStatusStock();
}
