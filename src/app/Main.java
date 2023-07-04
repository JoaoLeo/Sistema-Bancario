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
            System.out.println("Digite uma opção: ");
            System.out.println("[1] Criar conta");
            System.out.println("[2] Acessar opções da conta");
            System.out.println("[3] Criar cliente");
            System.out.println("[4] Acessar opções de cliente");
            System.out.println("[5] Ver clientes");
            System.out.println("[6] Ver contas");
            int option = in.nextInt();
            if (option <= 0 || option >= 8) {
                System.out.println("Opção invalida");
                loop = false;
            }
            switch(option) {
                case 1:

                    break;
                case 2:

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