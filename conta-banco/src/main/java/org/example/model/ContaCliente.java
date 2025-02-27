package org.example.model;

import java.util.Objects;

public class ContaCliente {
    Integer numero;
    String agencia;
    String nomeCliente;
    Double saldo;

    public ContaCliente(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public ContaCliente() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContaCliente that = (ContaCliente) o;
        return Objects.equals(numero, that.numero) && Objects.equals(agencia, that.agencia) && Objects.equals(nomeCliente, that.nomeCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agencia, nomeCliente);
    }

    @Override
    public String toString() {
        return "ContaCliente{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
