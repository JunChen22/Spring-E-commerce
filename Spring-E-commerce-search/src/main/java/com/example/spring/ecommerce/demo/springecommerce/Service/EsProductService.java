package com.example.spring.ecommerce.demo.springecommerce.Service;

import com.example.spring.ecommerce.demo.springecommerce.elasticsearch.document.EsProduct;
import com.github.pagehelper.Page;

import java.util.List;

public interface EsProductService {

    int importAll();

    EsProduct create(Long id);

    void delete(Long id);

    void delete(List<Long> id);

    List<EsProduct> search(String keyword, int pageNum, int pageSize);

    //List<EsProduct> search(String name, String keyword, int category, int pageNum, int pageSize, int sort);

    Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize);

    // EsProductRelatedInfo searchRelatedInfo(String keyword);
}
