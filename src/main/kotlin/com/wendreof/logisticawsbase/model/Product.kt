package com.wendreof.logisticawsbase.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Product (@Id
        @GeneratedValue
        @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
               val id: Long = 0L,
               val remetente: String ="",
               val descricao: String ="",
               val preco: Double = 0.0
)
