package com.pepit.service.impl;

import com.pepit.dto.ProductDto;
import com.pepit.dto.ProductPagineDTO;
import com.pepit.repository.impl.ProductRepositoryCustomImpl;
import com.pepit.util.Query;
import com.pepit.repository.ProductRepositoryCustom;
import com.pepit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Component
public class ProductServiceImpl implements ProductService {
    private final Long nbProductParPage = 10L;

    @Autowired
    ProductRepositoryCustom productRepositoryCustom;

    private static final Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());

    @Override
    public ProductPagineDTO search(Map<String, String> params, String order, Integer page, String supplier, String type) {
        logger.info("New Query : ");
        Query query = new Query();
        query
                .addType(type)
                .addSupplier(supplier)
                .addAllCriterias(params)
                .addSorting(order)
                .page(page);
        List<ProductDto> productList = productRepositoryCustom.testRequest(query);
        ProductPagineDTO productPagine = new ProductPagineDTO();
        productPagine.setProductsToDisplay(productList);
        Integer nbPagesTotal = (int) Math.ceil(productList.size()/ (double) nbProductParPage);
        productPagine.setNbPagesTotal(nbPagesTotal);

        if(page != null && nbPagesTotal>= page){
            productPagine.setPageActuelle(page);
        }else{
            productPagine.setPageActuelle(1);
        }
        return productPagine;
    }
}
