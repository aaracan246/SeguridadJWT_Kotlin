package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rutas_protegidas")
class RutaProtegidaController {


    @GetMapping("/recurso1")
    fun getRecursoProtegidoUno () : String {
        return "Este recurso sólo puede ser accedido por usuarios registrados en la BDD \uD83E\uDD75"
    }


    @GetMapping("/{id}")
    fun getRecursoProtegidoId () : String {
        return "Este recurso sólo puede ser accedido por usuario con id \uD83E\uDD75"
    }

    @DeleteMapping("/recurso/{id}")
    fun deleteRecursoProtegido(@PathVariable id: String): String{ return "Eliminar recurso por su id $id emoji jeje uwu"}

}