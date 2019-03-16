package com.wendreof.logisticawsbase.repository

import com.wendreof.logisticawsbase.model.Product
import org.springframework.data.repository.CrudRepository

interface  Repository : CrudRepository<Product, Long>
