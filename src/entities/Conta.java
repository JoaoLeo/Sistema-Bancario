package entities;

import enums.StatusConta;
import enums.TipoConta;

import java.util.Date;

public class Conta {
    private String numero;
    private String agencia;
    private Cliente dono;
    private TipoConta tipoConta;
    private StatusConta statusConta;
    private Date dtCriacao;
    private Double valorTotal;
    private Double valorTotalEmPoupanca;

    public Conta() {
    }

    public Conta(String numero, String agencia, Cliente dono, TipoConta tipoConta, StatusConta statusConta, Date dtCriacao, Double valorTotal, Double valorTotalEmPoupanca) {
        this.numero = numero;
        this.agencia = agencia;
        this.dono = dono;
        this.tipoConta = tipoConta;
        this.statusConta = statusConta;
        this.dtCriacao = dtCriacao;
        this.valorTotal = valorTotal;
        this.valorTotalEmPoupanca = valorTotalEmPoupanca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public StatusConta getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(StatusConta statusConta) {
        this.statusConta = statusConta;
    }

    public Date getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorTotalEmPoupanca() {
        return valorTotalEmPoupanca;
    }

    public void setValorTotalEmPoupanca(Double valorTotalEmPoupanca) {
        this.valorTotalEmPoupanca = valorTotalEmPoupanca;
    }

    public void sacar(Double qtd){
        if(qtd > valorTotal){
            System.out.println("Essa conta não possui essa quantidade de dinheiro na conta");
            return;
        }
        valorTotal -= qtd;
        System.out.println("Sacando " + qtd + "R$");
    }
    public void depositar(Double qtd){
        valorTotal += qtd;
        System.out.println(qtd + "R$ depositado valor atual: " + valorTotal);
    }
    public void guardarNaPoupanca(Double qtd){
        if(qtd > valorTotal){
            System.out.println("Essa conta não possui essa quantidade de dinheiro na conta");
            return;
        }
        valorTotal -= qtd;
        valorTotalEmPoupanca += qtd;
        System.out.println(qtd + "R$ guardado! Valor atual da poupança: " + valorTotalEmPoupanca);
    }
}