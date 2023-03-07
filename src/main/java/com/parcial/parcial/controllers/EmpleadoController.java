package com.parcial.parcial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parcial.parcial.models.Empleado;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @GetMapping({"/", ""})
    public String formulario(Model model) {
        model.addAttribute("titulo", "Formulario");
        model.addAttribute("empleado", new Empleado());
        return "empleado/index";
    }
}
