package com.pepit.repository;

import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.Warning;
import com.pepit.dto.ProductDto;
import com.pepit.model.Product;
import com.pepit.util.Query;

import java.util.Iterator;
import java.util.List;

public interface ProductRepositoryCustom {
    List<ProductDto> testRequest(Query query);
    List<ProductDto> find(String query);
    Iterator<Warning> addDoc(DbDoc[] dbDocs);
    Iterator<Warning> updateBornes(String technicalName);
    List<String> listeDistinct(String technicalName);
    void removeDoc(String query);
    Long count();

    ProductDto getProductById(String productId);
}
