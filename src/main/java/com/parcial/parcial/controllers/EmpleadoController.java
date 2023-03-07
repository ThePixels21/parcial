package com.parcial.parcial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.parcial.parcial.models.Empleado;

import jakarta.validation.Valid;

@Controller
public class EmpleadoController {
    
    @GetMapping({"/", ""})
    public String formulario(Model model) {
        model.addAttribute("titulo", "Formulario");
        model.addAttribute("empleado", new Empleado());
        return "empleado/index";
    }

    @PostMapping("/form")
    public String resultado(@Valid Empleado empleado, BindingResult resultado, Model model) {
        if(resultado.hasErrors()) {
            model.addAttribute("titulo", "Corregir formulario");
            return "empleado/index";
        }
        model.addAttribute("titulo", "Datos del empleado");
        return "empleado/resultado";
    }
}
