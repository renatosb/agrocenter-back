/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.agrocenter.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Renato
 */
@Entity
@Table(name = "lancamentos")
public class Lancamentos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private Date dataLancamento;
    @Column
    private String fornecedor;
    @Column
    private String planoConta;
    @Column
    private String status;
    @Column
    private Date dataQuitacao;
    @Column
    private Double valorParcela;
    @Column
    private Double desconto;
    @Column
    private Double juros;
    @Column
    private int qtAtraso;
    @Column
    private Double totalParcela;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getPlanoConta() {
        return planoConta;
    }

    public void setPlanoConta(String planoConta) {
        this.planoConta = planoConta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(Date dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public int getQtAtraso() {
        return qtAtraso;
    }

    public void setQtAtraso(int qtAtraso) {
        this.qtAtraso = qtAtraso;
    }

    public Double getTotalParcela() {
        return totalParcela;
    }

    public void setTotalParcela(Double totalParcela) {
        this.totalParcela = totalParcela;
    }
}
