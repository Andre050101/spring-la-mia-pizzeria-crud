package org.lessons.java.spring_la_mia_pizzeria_crud.controller;

import java.util.List;

import org.lessons.java.spring_la_mia_pizzeria_crud.model.Pizza;
import org.lessons.java.spring_la_mia_pizzeria_crud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzeController {

    @Autowired
    private PizzaRepository repo;

    @GetMapping
    public String index(Model model) {
        List<Pizza> pizze = repo.findAll(); // Select * from pizze
        model.addAttribute("pizze", pizze);
        return "pizzas/index";
    }
}
