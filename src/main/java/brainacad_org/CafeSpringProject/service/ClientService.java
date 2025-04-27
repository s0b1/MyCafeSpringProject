package brainacad_org.CafeSpringProject.service;

import brainacad_org.CafeSpringProject.entity.Client;
import brainacad_org.CafeSpringProject.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository)
    {
        this.clientRepository = clientRepository;
    }

    public Client addClient(Client client)
    {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients()
    {
        return clientRepository.findAll();
    }

    public void deleteClient(Long id)
    {
        clientRepository.deleteById(id);
    }
}