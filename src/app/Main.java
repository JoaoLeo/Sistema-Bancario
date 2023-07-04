package app;

import entities.Cliente;
import entities.Conta;
import enums.StatusConta;
import enums.TipoConta;
import exceptions.TratadorExcecoes;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean loop = true;
        while(loop){
            int option = Menu.printMenuInicial();
            if (option <= 0 || option >= 3) {
                System.out.println("Opção invalida");
            }
            switch(option) {
                case 1:
                    int a = Menu.printMenuOpcoesCliente();
                    break;
                case 2:
                    int b = Menu.printMenuOpcoesConta();
                    break;
                default:

            }
        }
        in.close();
    }

    public Conta criarConta(String numero, String agencia, Cliente dono, TipoConta tipoConta,
     StatusConta statusConta, Date dtCriacao, Double valorTotal, Double valorTotalEmPoupanca){
        return new Conta(numero,agencia,dono,tipoConta,statusConta,dtCriacao,valorTotal,valorTotalEmPoupanca);
    }
}