package br.edu.ifpi.filmes.controller

import br.edu.ifpi.filmes.model.Filme
import br.edu.ifpi.filmes.repository.FilmesRepository
import jakarta.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class FilmesController(private val filmesRepository: FilmesRepository) {

    @GetMapping("/form")
    fun abrirFormulario(model: Model): String {
        model.addAttribute("filme", Filme("", "", ""))
        return "formulario"
    }

    @GetMapping("/lista")
    fun listarFilmes(model: Model): String {
        model.addAttribute("filmes", filmesRepository.findAll())
        return "lista"
    }

    @PostMapping("/salvar")
    fun salvarFilme(
            @Valid filme: Filme,
            result: BindingResult,
            model: Model
    ): String {
        if (result.hasErrors()) {
            return "formulario"
        }

        filmesRepository.save(filme)
        return "redirect:/lista"
    }
}
