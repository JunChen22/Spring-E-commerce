package com.example.spring.ecommerce.demo.springecommerce.Service.impl;

import com.example.spring.ecommerce.demo.springecommerce.Service.EsProductService;
import com.example.spring.ecommerce.demo.springecommerce.dao.EsProductDao;
import com.example.spring.ecommerce.demo.springecommerce.elasticsearch.document.EsProduct;
import com.example.spring.ecommerce.demo.springecommerce.elasticsearch.document.EsProductAttribute;
import com.example.spring.ecommerce.demo.springecommerce.elasticsearch.repository.EsProductRepository;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Service
public class EsProductServiceImpl implements EsProductService {

    @Autowired
    private EsProductDao productDao;

    @Autowired
    private EsProductRepository productRepository;

    @Override
    public int importAll() {
        List<EsProduct> esProductList = productDao.getAllEsProductList(null);
        Iterable<EsProduct> esProductIterable = productRepository.saveAll(esProductList);
        Iterator<EsProduct> iterator = esProductIterable.iterator();
        int result = 0;
        while(iterator.hasNext()){
            result++;
            iterator.next();
        }
        return result;
    }

    @Override
    public EsProduct create(Long id) {
        EsProduct result = null;
        List<EsProduct> productList = productDao.getAllEsProductList(id);
        if(productList.size() > 0){
            EsProduct newProduct = productList.get(0);
            result = productRepository.save(newProduct);
        }
        return result;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        if(!CollectionUtils.isEmpty(ids)){
            List<EsProduct> esProductList = new ArrayList<>();
            for(Long id: ids){
                EsProduct esproduct = new EsProduct();
                esproduct.setId(id);
                esProductList.add(esproduct);
            }
            productRepository.deleteAll(esProductList);
        }
    }

    @Override
    public List<EsProduct> search(String keyword, int pageNum, int pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return productRepository.findByNameOrSubTitleOrKeywords(keyword, keyword, keyword, pageable);
    }

    @Override
    public Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize) {
        return null;
    }
}
