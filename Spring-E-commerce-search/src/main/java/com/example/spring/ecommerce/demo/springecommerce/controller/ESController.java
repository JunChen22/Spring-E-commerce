package com.example.spring.ecommerce.demo.springecommerce.controller;

import com.example.spring.ecommerce.demo.springecommerce.Service.EsProductService;
import com.example.spring.ecommerce.demo.springecommerce.elasticsearch.document.EsProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("esProduct")
@Api(tags = "EsProductController")
public class ESController {

    @Autowired
    private EsProductService productService;

    @PostMapping("/importAll")
    @ApiOperation(value = "import all product from DB to elastic search")
    public String importAllList(){
        int count = productService.importAll();
        return count + " items imported";
    }

    @GetMapping("/search")
    @ApiOperation(value = "search product by keywords")
    @ApiImplicitParam(name = "sort", value = "order:0->relevance；1->new listed；2->top seller；3->price low；4->price hight",
            defaultValue = "0", allowableValues = "0,1,2,3,4", paramType = "query", dataType = "integer")
    public List<EsProduct> search(@RequestParam(required = false) String keyword,
                                  //@RequestParam(required = false, defaultValue = "0") int category,
                                  @RequestParam(required = false, defaultValue = "0") int pageNum,
                                  @RequestParam(required = false, defaultValue = "5") int pageSize,
                                  @RequestParam(required = false, defaultValue = "0") int sort) {
        return productService.search(keyword, pageNum, pageSize);
    }

    @PostMapping("/create/{id}")
    @ApiOperation(value = "create product by id")
    public String create(@PathVariable Long id){
        EsProduct esProduct = productService.create(id);
        return esProduct != null? "success" : "failed";
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "delete product by id")
    public String delete(@PathVariable Long id){
        productService.delete(id);
        return "deleted";
    }

    @PostMapping("/delete/batch")
    @ApiOperation(value = "delete product by ids")
    public String delete(@PathParam("ids") List<Long> ids){
        productService.delete(ids);
        return "deleted";
    }
}
