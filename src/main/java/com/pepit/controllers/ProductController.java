package com.pepit.controllers;


import com.pepit.constants.Routes;
import com.pepit.dto.ProductDto;
import com.pepit.dto.ProductPagineDTO;
import com.pepit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = Routes.PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping(value = "/search")
    public ResponseEntity<ProductPagineDTO> search(@RequestParam(required = false) String order,
                                                   @RequestParam(required = false) Integer page,
                                                   @RequestParam(required = false) String supplier,
                                                   @RequestParam(required = false) String type,
                                                   @RequestParam(required = false) Map<String, String> params
    ) {
        return ResponseEntity.status(200).body(productService.search(params, order, page, supplier, type));
    }


    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> searchProductById(@PathVariable String productId) {
        return ResponseEntity.status(200).body(productService.searchProductById(productId));
    }

    @GetMapping("/list/{values}")
    public ResponseEntity<List<ProductDto>> searchProductByListId(@PathVariable String[] values) {
        return ResponseEntity.status(200).body(productService.searchProductByListId(values));
    }

}
