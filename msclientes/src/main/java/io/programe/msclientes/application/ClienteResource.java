package io.programe.msclientes.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.programe.msclientes.domain.Cliente;

@RestController
@RequestMapping("clientes")
public class ClienteResource {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{ads}")
    public String status(@PathVariable String ads){
        return "ok "+ads;
    } 

    @PostMapping
    public ResponseEntity salvar(@RequestBody Cliente cliente) {
        var result = clienteService.salvar(cliente);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getByCpf(@RequestParam("cpf") String cpf) {
        var cliente = clienteService.getByCpf(cpf);
        return ResponseEntity.ok(cliente);
    }

}
