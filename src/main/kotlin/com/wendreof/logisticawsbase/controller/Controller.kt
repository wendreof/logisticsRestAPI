package com.wendreof.logisticawsbase.controller

import com.wendreof.logisticawsbase.model.Product
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@Controller
@RequestMapping("products")
 class Controller {


    @GetMapping
    @ResponseBody
    fun list(): List<Product>{
        return listOf(Product("Wendreo Luciano Feranandes", "Iphone 10", 100.00),
                Product("Eloá Vitória", "NIntendo Switch", 999.00))
    }
}