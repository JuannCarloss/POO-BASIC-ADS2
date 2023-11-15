package com.senac.exemplo.adv.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fornecedor extends Pessoa{

    @Column(name = "cnpj", nullable = true)
    private String cnpj;
    @Column(name = "razao_especial", nullable = true)
    private String razaoEspecial;
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoEspecial() {
        return razaoEspecial;
    }

    public void setRazaoEspecial(String razaoEspecial) {
        this.razaoEspecial = razaoEspecial;
    }

    @Override
    public String toString() {
        return "Fornecedir{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoEspecial='" + razaoEspecial + '\'' +
                '}';
    }
}
