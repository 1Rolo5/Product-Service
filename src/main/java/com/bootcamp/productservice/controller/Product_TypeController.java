package com.bootcamp.productservice.controller;


import com.bootcamp.productservice.dto.product_type.Product_TypeDto;
import com.bootcamp.productservice.model.Product_Type;
import com.bootcamp.productservice.service.interfaces.IProduct_TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/producttype")
public class Product_TypeController {

    @Autowired
    private IProduct_TypeService product_typeService;

    //list all Product Type
    @GetMapping("/list")
    public Flux<Product_Type> list(){
        return product_typeService.findAll();
    }

    // create new Product Type
    @PostMapping("/create")
    public Mono<Product_Type> create (@RequestBody Product_TypeDto product_type){
        return product_typeService.save(product_type);
    }

    //modify a Product Type
    @PutMapping("/update")
    public Mono<Product_Type> update(@RequestBody Product_Type product_type){
        return product_typeService.update(product_type);
    }
    //show the Product Type by Id
    @GetMapping("/show/{id}")
    public Mono<Product_Type> ShowId(@PathVariable("id") String typeId){
        return product_typeService.ShowById(typeId);
    }
    //delete a Product Type
    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable("id") String id){
        return product_typeService.delete(id);
    }
}
