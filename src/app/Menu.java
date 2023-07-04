package app;

import java.util.Scanner;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public static int printMenuInicial() {
        System.out.println("[1] Acessar opções de cliente");
        System.out.println("[2] Acessar opções da conta");
        System.out.print("Digite uma opção: ");
        int option = in.nextInt();
        in.close();
        return option;
    }
    public static int printMenuOpcoesConta(){
        System.out.println("[1] Depositar");
        System.out.println("[2] Sacar");
        System.out.println("[3] Gurdar");
        System.out.println("[4] Criar conta");
        System.out.println("[5] Ver contas contas cadastradas");
        System.out.print("Digite uma opção: ");
        int option = in.nextInt();
        in.close();
        return option;
    }
    public static int printMenuOpcoesCliente(){
        System.out.println("Digite uma opção: ");
        System.out.println("[1] Criar cliente");
        System.out.println("[2] Alterar dados");
        System.out.println("[3] Excluir");
        System.out.println("[4] Ver clientes cadastrados");
        System.out.print("Digite uma opção: ");
        int option = in.nextInt();
        in.close();
        return option;
    }
}
