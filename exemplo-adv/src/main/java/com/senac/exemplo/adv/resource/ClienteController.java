package com.senac.exemplo.adv.resource;

import com.senac.exemplo.adv.model.Cliente;
import com.senac.exemplo.adv.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity create(@RequestBody Cliente cliente){
        Cliente save = clienteService.salvar(cliente);
        return ResponseEntity.created(URI.create("/api/clientes" + cliente.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll(){
        List<Cliente> clientes = clienteService.listarCliente();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        Cliente cliente = clienteService.buscaPorId(id);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity remove(@PathVariable("id") Long id){
        clienteService.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cli){
        Cliente cliente = clienteService.alterar(id, cli);
        return ResponseEntity.ok().body(cliente);
    }


}
