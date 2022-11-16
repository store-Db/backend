package tn.test.spring.Services.Produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.Produit;
import tn.test.spring.Entity.Stock;
import tn.test.spring.Services.GServiceImp;
import tn.test.spring.Services.Stock.StockServiceImp;

import javax.transaction.Transactional;

@Service
public class ProduitServiceImp extends GServiceImp<Produit, Long> implements ProduitSerive {
    @Autowired
    StockServiceImp stockServiceImp;

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit = this.findById(idProduit);
        Stock stock = stockServiceImp.retrieveStock(idStock);
        produit.setStock(stock);
        this.update(produit);
    }
}

