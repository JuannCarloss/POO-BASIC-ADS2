package com.senac.exemplo.adv.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {

    @Column(name = "cpf", nullable = true)
    private String cpf;
    @Column(name = "limite_credito", nullable = true)
    private Double limiteCredito;
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", limiteCredito=" + limiteCredito +
                '}';
    }
}
