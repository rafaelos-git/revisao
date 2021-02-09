package com.example.revisao.dto;

public class ClientDTO {
    private Long id;
    private String name;

    public ClientDTO(){

    }

    public ClientDTO(Long id2, String name2) {
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
