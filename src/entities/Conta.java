package entities;

import enums.StatusConta;
import enums.TipoConta;
import exceptions.TratadorExcecoes;

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

    public String getAgencia() {
        return agencia;
    }
    public Cliente getDono() {
        return dono;
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
    public void pegarValores(){
        System.out.println("Valor na conta: " + valorTotal);
        System.out.println("Valor na poupança: " + valorTotalEmPoupanca);
        System.out.println("Valor total: " + (valorTotal + valorTotalEmPoupanca));
    }
    public void sacar(Double qtd){
        validarValor(qtd);
        valorTotal -= qtd;
        System.out.println("Sacando " + qtd + "R$");
    }
    public void depositar(Double qtd){
        if(qtd <= 0){
            throw new TratadorExcecoes("Valor invalido");
        }
        valorTotal += qtd;
        System.out.println(qtd + "R$ depositado valor atual: " + valorTotal);
    }
    public void guardarNaPoupanca(Double qtd){
        validarValor(qtd);
        valorTotal -= qtd;
        valorTotalEmPoupanca += qtd;
        System.out.println(qtd + "R$ guardado! Valor atual da poupança: " + valorTotalEmPoupanca);
    }
    public void validarValor(Double qtd){
        if(qtd > valorTotal){
            throw new TratadorExcecoes("A conta não possui essa quantidade de dinhero");
        }
        if(qtd <= 0){
            throw new TratadorExcecoes("Valor invalido");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", agencia='" + agencia + '\'' +
                ", dono=" + dono +
                ", tipoConta=" + tipoConta +
                ", statusConta=" + statusConta +
                ", dtCriacao=" + dtCriacao +
                ", valorTotal=" + valorTotal +
                ", valorTotalEmPoupanca=" + valorTotalEmPoupanca +
                '}';
    }
}