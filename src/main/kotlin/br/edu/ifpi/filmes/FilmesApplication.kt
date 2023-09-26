package br.edu.ifpi.filmes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FilmesApplication

fun main(args: Array<String>) {
    runApplication<FilmesApplication>(*args)
}
