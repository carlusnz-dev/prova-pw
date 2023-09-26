package br.edu.ifpi.filmes.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
data class Filme(
        @field:NotBlank(message = "O campo título é obrigatório")
        val titulo: String,

        @field:NotBlank(message = "O campo gênero é obrigatório")
        val genero: String,

        @field:NotBlank(message = "O campo duração é obrigatório")
        val duracao: String,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null
)