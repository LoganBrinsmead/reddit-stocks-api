package com.stocks.stockmentions;

import com.stocks.stockmentions.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock, String> {
}
