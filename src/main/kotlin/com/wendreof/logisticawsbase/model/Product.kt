package com.wendreof.logisticawsbase.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Product (@Id
        @GeneratedValue
        val id: Long = 0L,
        val remetente: String ="",
        val descricao: String ="",
        val preco: Double = 0.0
)
