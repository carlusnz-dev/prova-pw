package br.edu.ifpi.filmes.repository

import br.edu.ifpi.filmes.model.Filme
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FilmesRepository : JpaRepository<Filme, Long> {
    fun findByTitulo(titulo: String): List<Filme>
}
