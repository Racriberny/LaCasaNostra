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
    @GetMapping("/bebidas")
    public String bebidas(){
        return "Carta/Bebidas/Bebidas";
    }
    @GetMapping("/entrantes")
    public String entrantes(){
        return "Carta/Entrantes/entrantes";
    }
    @GetMapping("/alcohol")
    public String alcohol(){
        return "Carta/Bebidas_Alcoholicas/bebidasAlcoholicas";
    }
    @GetMapping("/ensaladas")
    public String ensaladas(){return "Carta/Ensaladas/enladas";}
    @GetMapping("/pastas")
    public String pastas(){return "Carta/Pastas/pastas";}
    @GetMapping("/hamburguesas")
    public String hamburguesas(){return "Carta/Hambuguesas/Hamburguesas";}
    @GetMapping("/pizzas")
    public String pizzas(){return "Carta/Pizzas/Pizzas";}
    @GetMapping("/postres")
    public String postres(){return "Carta/Postres/Postres";}
    @GetMapping("/parrilla")
    public String parrilla(){return "Carta/Parrilla/Parrilla";}
}
