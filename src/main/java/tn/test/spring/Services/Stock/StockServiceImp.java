package tn.test.spring.Services.Stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.Stock;
import tn.test.spring.Repository.StockRepository;

import java.util.List;

@Service
public class StockServiceImp implements StockService {

    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        stockRepository.save(s);
        return s;
    }

    @Override
    public Stock updateStock(Stock s) {
        stockRepository.save(s);
        return s;
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);

    }

    @Override
    public void removeStock(Long id) {
        stockRepository.deleteById(id);
    }



}

