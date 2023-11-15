package com.senac.exemplo.adv.service;

import com.senac.exemplo.adv.model.Cliente;
import com.senac.exemplo.adv.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarCliente(){
        return clienteRepository.findAll();
    }

    public Cliente buscaPorId(Long id){
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente alterar(Long id, Cliente alterado){
        Optional<Cliente> optional = clienteRepository.findById(id);
        if (optional.isPresent()) {
            Cliente cliente = optional.get();
            cliente.setCpf(alterado.getCpf());
            cliente.setLimiteCredito(alterado.getLimiteCredito());
            cliente.setEmail(alterado.getEmail());
            cliente.setTelefone(alterado.getTelefone());
            return clienteRepository.save(cliente);
        }
        return null;
    }

    public void remover (Long id){
        clienteRepository.deleteById(id);
    }

}
