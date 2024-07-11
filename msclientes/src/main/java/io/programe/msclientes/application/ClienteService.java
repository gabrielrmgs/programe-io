package io.programe.msclientes.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.programe.msclientes.domain.Cliente;
import io.programe.msclientes.domain.ClienteRepository;
import jakarta.transaction.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository; 

    @Transactional
    public Cliente salvar(Cliente entity) {
        return clienteRepository.save(entity);
    }

    public Cliente getByCpf(String cpf) {
        return clienteRepository.findByCpf(cpf).orElseThrow();
    }

}
