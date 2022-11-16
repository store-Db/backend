package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Stock;
import tn.test.spring.Services.Stock.StockServiceImp;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockServiceImp stockServiceImp;

    @GetMapping
    public List<Stock> retrieveAll() {
        return stockServiceImp.retrieveAllStocks();
    }

    @PostMapping
    public Stock addStock(@RequestBody Stock s) {
        return stockServiceImp.addStock(s);
    }

    @GetMapping("/{id}")
    public Stock retrieveStock(@PathVariable Long id) {
        return stockServiceImp.retrieveStock(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStock(@PathVariable Long id) {
        stockServiceImp.removeStock(id);
    }

    @PutMapping
    public Stock updateStock(@RequestBody Stock s) {
        return stockServiceImp.updateStock(s);
    }
}
