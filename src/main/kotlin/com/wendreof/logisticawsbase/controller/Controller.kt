package com.wendreof.logisticawsbase.controller

import com.wendreof.logisticawsbase.model.Product
import com.wendreof.logisticawsbase.repository.Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@Controller
@RequestMapping("products")
 class Controller
{
    @Autowired
    lateinit var mRepository: Repository


    @GetMapping
    @ResponseBody
    fun list(): List<Product>
    {
        return mRepository.findAll().toList()
    }


    @PostMapping
    fun add(@RequestBody product: Product): Product
    {
        return mRepository.save(product)
    }
}