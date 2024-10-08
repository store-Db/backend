package tn.test.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Stock;
import tn.test.spring.Services.Stock.StockService;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockService stockServiceImp;

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

    @DeleteMapping
    public void deleteStock(@PathVariable Long id) {
        stockServiceImp.removeStock(id);
    }

    @PutMapping
    public Stock updateStock(@RequestBody Stock s) {

        return stockServiceImp.updateStock(s);
    }


}
