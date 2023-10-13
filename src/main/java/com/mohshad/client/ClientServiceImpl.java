package com.mohshad.client;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImpl(final ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public void saveClient(Client client) {
        this.clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        List<Client> clients = this.clientRepository.findAll();
        return clients;
    }

    @Override
    public Optional<Client> getClientById(Long id) {
        Optional<Client> client = this.clientRepository.findById(id);
        return client;
    }
}
