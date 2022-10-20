package com.mulungu.demo.controller;

import com.mulungu.demo.Model.Servicos;
import com.mulungu.demo.Repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/servicos")
public class ServicosController {

        @Autowired
       ServicosRepository servicosRepository;

        @PostMapping
        public Servicos criar (@RequestBody Servicos servicos){return servicosRepository.save(servicos);
        }

        @GetMapping
        public List<Servicos> listar(){
                        return servicosRepository.findAll();
                }

}
