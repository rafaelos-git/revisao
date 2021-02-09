package com.example.revisao.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.revisao.entities.Client;

public class ClientRepository {
    public List<Client> getClients(){
        Client c1 = new Client();
        c1.setId(1l);
        c1.setName("Rafael");
        c1.setAdress("Rua Gda Civil, 182");

        Client c2 = new Client();
        c2.setId(2l);
        c2.setName("Rafael");
        c2.setAdress("Rua Gda Civil, 182");

        List<Client> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);

        return list;
    }
}
