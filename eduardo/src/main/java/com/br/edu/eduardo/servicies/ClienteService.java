package com.br.edu.eduardo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.edu.eduardo.entities.Cliente;
import com.br.edu.eduardo.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;

@Autowired
public ClienteService(ClienteRepository clienteRepository) {
	this.clienteRepository = clienteRepository;
}

public Cliente saveClient (Cliente cliente) {
	return clienteRepository.save(cliente);
}

public Cliente getClienteById(Long idcCliente) {
	return clienteRepository.findById(idcCliente).orElse(null);	
}

public List<Cliente> getAllClientes () {
	return clienteRepository.findAll ();
}

public void deleteCliente (long idcCliente) {
	clienteRepository.deleteById(idcCliente);
}
}
