package edu.ilp.sisgailp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class PruebaController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola amig@s desde ayacucho-Perú";
    }

    @GetMapping("/bienvenido")
    public String identificacion(@RequestParam String datos){
        return "Bienvenidos a la pontificia: " + datos;
    }
}
