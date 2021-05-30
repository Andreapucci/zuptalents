package br.com.estacionamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.estacionamento.model.Veiculos;
import br.com.estacionamento.service.VeiculosService;
import br.com.estacionamento.controllers.response.UsuarioDTO;
import br.com.estacionamento.controllers.request.VeiculosDTO;

@RestController
@RequestMapping("veiculos")
public class VeiculosControle {

    @Autowired
    private VeiculosService veiculoService;
    
    @GetMapping(value = "/buscaVeiculosPorCpf")
    public UsuarioDTO buscaVeiculosPorCpf(@RequestParam String cpf) {
        return veiculoService.buscaVeiculosPorCpf(cpf);
    }

    @PostMapping(value = "/incluirVeiculos")
    public Veiculos incluirVeiculos(@RequestBody VeiculosDTO veiculos) {
        return veiculoService.incluirVeiculos(veiculos);
    }
}
