package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/secretos_extra_confidenciales")
class SecretosExtraConfiController {


    @GetMapping("/ficha1")
    fun getRecursoProtegidoUno () : String {
        return "Este recurso sólo puede ser accedido por el alto mando del Gobierno de ESÑAPA registrados en la BDD \uD83E\uDD75"
    }

    @GetMapping("/ficha2")
    fun getRecursoProtegidoDos () : String {
        return "Este recurso sólo puede ser accedido por todos los registrados en la BDD \uD83E\uDD75"
    }
}