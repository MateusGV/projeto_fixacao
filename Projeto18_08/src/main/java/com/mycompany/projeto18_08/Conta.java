/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto18_08;

/**
 *
 * @author aluno
 */
public class Conta {

    /**
     * @return the numero_da_conta
     */
    public int getNumero_da_conta() {
        return numero_da_conta;
    }

    /**
     * @param numero_da_conta the numero_da_conta to set
     */
    public void setNumero_da_conta(int numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }
    private int numero_da_conta;
    private int agencia;
    private float saldo;
    private float limite;
}
