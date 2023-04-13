/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.agrocenter.services;

import com.erp.agrocenter.model.Fornecedor;
import com.erp.agrocenter.repository.FornecedorRepository;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Renato
 */
@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public List<Fornecedor> listaTodos() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor cadastraFornecedor(Map mapFornecedor) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome((String) mapFornecedor.get("nome"));
        fornecedor.setTipoDespesa((String) mapFornecedor.get("tipoDespesa"));
        return fornecedorRepository.save(fornecedor);
    }

    public Optional<Fornecedor> findByid(Long idFornecedor) {
        return fornecedorRepository.findById(idFornecedor);
    }

    public void delete(Fornecedor fornecedor) {
        fornecedorRepository.delete(fornecedor);
    }
}
