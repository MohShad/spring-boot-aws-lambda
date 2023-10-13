package com.mohshad.client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    void saveClient(Client client);

    List<Client> getAllClients();

    Optional<Client> getClientById(Long id);
}
