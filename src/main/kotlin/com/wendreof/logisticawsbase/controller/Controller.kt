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
    fun add( @RequestBody product: Product ): Product
    {
        return mRepository.save(product)
    }

    @PutMapping( "{id}" )
    fun alter( @PathVariable id: Long, @RequestBody product: Product ): Product
    {
        if ( mRepository.exists(id) )
        {
            val safe = product.copy(id)
            return mRepository.save( safe )
        }

        return Product()
    }

    @DeleteMapping("{id}" )
    fun delete( @PathVariable id: Long )
    {
        if( mRepository.exists(id) )
        {
            mRepository.delete(id)
        }
    }
}