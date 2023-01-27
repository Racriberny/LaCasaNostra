package com.cristobalbernal.lacasanostra.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiControlador {
    @GetMapping("/home")
    public String indice(){
        return "index";
    }
    @GetMapping("/carta")
    public String carta(){
        return "Carta/bienvenidaCarta";
    }
    @GetMapping("/entrantes")
    public String bebidas(){
        return "Carta/Entrantes/entrantes";
    }
    @GetMapping("/alcohol")
    public String alcohol(){
        return "Carta/Bebidas_Alcoholicas/fafadfda";
    }

}
