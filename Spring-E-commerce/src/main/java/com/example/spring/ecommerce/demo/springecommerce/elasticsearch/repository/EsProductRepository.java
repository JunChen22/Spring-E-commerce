package com.example.spring.ecommerce.demo.springecommerce.elasticsearch.repository;

import com.example.spring.ecommerce.demo.springecommerce.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {

    List<EsProduct> findByKeywords(String keyword);
    List<EsProduct> findByName(String name);
    List<EsProduct> findByNameOrKeywords(String name, String keywords);
    List<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subtitle, String keywords, Pageable page);
}
