package com.example.ecomarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ecomarket.model.Vendedor;
import com.example.ecomarket.repository.VendedorRepository;

public class VendedorService {
     @Autowired
    private VendedorRepository vendedorRepository;

    public List<Vendedor> BuscarTodosvendedor() {
        
        return vendedorRepository.findAll();
    }

    public Vendedor BuscarPorId(long idvendedor) {
        return vendedorRepository.findById(idvendedor).get();
    }

    public Vendedor save(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public void delete(Long idvendedor) {
        vendedorRepository.deleteById(idvendedor);
    }

}
