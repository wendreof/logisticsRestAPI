package com.wendreof.logisticawsbase.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Product
(
        @Id
        @GeneratedValue
        @JsonProperty( value = "id", access = JsonProperty.Access.READ_ONLY )
                val id: Long = 0L,
                val remetente: String ="",
                val recebedor: String ="",
                val descricao: String ="",
                val assinatura: String ="",
                val local: String ="",
                val dataRecebimento: String ="",
                val codBarras: String ="",
                val quantidade: Int = 0
)
