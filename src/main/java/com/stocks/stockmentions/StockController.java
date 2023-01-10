package com.stocks.stockmentions;

import com.stocks.stockmentions.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class StockController {

    @Autowired
    StockRepository repo;

    @RequestMapping("/")
    public String defaultPage() {
        return "API successfully running.";
    }

    @GetMapping("/stocks")
    public List<Stock> getAllStocks() {
        return repo.findAll();
    }
}
