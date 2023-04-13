/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.agrocenter.services;

import com.erp.agrocenter.model.Lancamentos;
import com.erp.agrocenter.repository.LancamentosRepository;
import java.util.Date;
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
public class LancamentoService {
    
    @Autowired
    LancamentosRepository lancamentosRepository;
    
    public List<Lancamentos> listaTodos(){
        return lancamentosRepository.findAll();
    }
    
    public Lancamentos cadastraLancamento(Map mapLancamentos){
        Lancamentos lancamentos = new Lancamentos();
        lancamentos.setDataLancamento((Date) mapLancamentos.get("dataLancamento"));
        lancamentos.setFornecedor((String) mapLancamentos.get("fornecedor"));
        lancamentos.setPlanoConta((String) mapLancamentos.get("planoConta"));
        lancamentos.setStatus((String) mapLancamentos.get("Status"));
        lancamentos.setDataQuitacao((Date) mapLancamentos.get("dataQuitacao"));
        lancamentos.setValorParcela((Double) mapLancamentos.get("valorParcela"));
        lancamentos.setDesconto((Double) mapLancamentos.get("desconto"));
        lancamentos.setJuros((Double) mapLancamentos.get("juros"));
        lancamentos.setQtAtraso((int) mapLancamentos.get("qtAtraso"));
        lancamentos.setTotalParcela((Double) mapLancamentos.get("totaParcela"));
        return lancamentosRepository.save(lancamentos);
    }
    
    public Optional<Lancamentos> findByid(Long idLancamento) {
        return lancamentosRepository.findById(idLancamento);
    }

    public void delete(Lancamentos lancamentos) {
        lancamentosRepository.delete(lancamentos);
    }
}
