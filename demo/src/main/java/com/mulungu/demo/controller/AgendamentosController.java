package com.mulungu.demo.controller;

import com.mulungu.demo.Model.Agendamentos;
import com.mulungu.demo.Model.Cartorio;
import com.mulungu.demo.Repository.AgendamentosRepository;
import com.mulungu.demo.Repository.CartorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/agendamento")
public class AgendamentosController {

    @Autowired
    AgendamentosRepository agendamentosRepository;

    @PostMapping
    public Agendamentos criar (@RequestBody Agendamentos agendamentos){return agendamentosRepository.save(agendamentos);
    }

    @GetMapping
    public List<Agendamentos> listar(){
        return agendamentosRepository.findAll();
    }
}
