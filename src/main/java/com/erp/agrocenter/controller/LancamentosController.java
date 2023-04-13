/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.agrocenter.controller;

import com.erp.agrocenter.model.Lancamentos;
import com.erp.agrocenter.services.LancamentoService;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Renato
 */
@RestController
@CrossOrigin("${front.cors}") //Habilita o CORS para o front-end
@RequestMapping("/api/lancamentos")
public class LancamentosController {

    @Autowired
    private LancamentoService lancamentoService;

    @RequestMapping(value = "lista-todos", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<List<Lancamentos>> listaTodos() {
        List<Lancamentos> lista = lancamentoService.listaTodos();
        if (lista != null) {
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "cadastro", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<Lancamentos> cadastraFornecedor(@RequestBody Map lancamento) {
        return new ResponseEntity<>(lancamentoService.cadastraLancamento(lancamento), HttpStatus.CREATED);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseEntity<HttpStatus> deletaFornecedor(@PathVariable(value = "id") String id) {
        Optional<Lancamentos> fornecedor = lancamentoService.findByid(Long.parseLong(id));
        if (fornecedor.isPresent()) {
            lancamentoService.delete(fornecedor.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
