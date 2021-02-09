package com.example.revisao.service;

import java.util.ArrayList;
import java.util.List;

import com.example.revisao.dto.ClientDTO;
import com.example.revisao.entities.Client;
import com.example.revisao.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repo;

    public List<ClientDTO> getClients(){
        List<Client> list = repo.getClients();
        List<ClientDTO> listDTO = new ArrayList<>();
        for(Client c: list){
            listDTO.add(new ClientDTO(c.getId(),c.getName()));
        }
        return listDTO;
    }
}
