package conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        int menu; // opção no menu
        String nome; // nome do titular
        char menusaida = 'n'; // menu de saída
        float valor;
        ContaBanco c1 = new ContaBanco(null, null);
        ContaBanco c2 = new ContaBanco(null, null);
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("--- AGÊNCIA BANCÁRIA ---\n");
            System.out.println("Digite uma das opções do menu: ");
            System.out.println("MENU:");
            System.out.println("cod.      opção");
            System.out.println("01 -      Status de Conta");
            System.out.println("02 -      Saldo de Conta");
            System.out.println("03 -      Depósito");
            System.out.println("04 -      Saque");
            System.out.println("05 -      Abertura de Conta");
            System.out.println("06 -      Encerramento de Conta");
            System.out.println("07 -      Pagamento de taxa mensal da conta");
            System.out.print("\nCódigo da opção: ");

            do {
                op = sc.nextInt();
                if ((op < 1) || (op > 7)) {
                    System.out.println("Código inválido!\nDigite novamente.");
                    System.out.print("\nCódigo da opção: ");

                }
            } while ((op < 1) || (op > 7));

            switch (op) {
                case 1:
                    System.out.println("\nBem vindo à Agência Bancária!");
                    System.out.println("Por favor insira o número da conta a qual deseja verificar o status: ");
                    System.out.println(c1.getDono());
                    break;
                case 2:
                    System.out.println("Contas existentes:");
                    System.out.println("Opção 01 - " + c1.getNumConta() + " : " + c1.getDono());
                    System.out.println("Opção 02 - " + c2.getNumConta() + " : " + c2.getDono());
                    System.out.print("Digite uma das opções: ");
                    menu = sc.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Conta: " + c1.getNumConta() + "Aberta: " + c1.isStatus());
                            break;
                        case 2:
                            System.out.println("Conta: " + c2.getNumConta() + "Aberta: " + c2.isStatus());
                    }
                    break;
                case 3:
                    System.out.println("Contas existentes:");
                    System.out.println("Opção 01 - " + c1.getNumConta() + " : " + c1.getDono());
                    System.out.println("Opção 02 - " + c2.getNumConta() + " : " + c2.getDono());
                    System.out.print("Digite uma das opções: ");
                    menu = sc.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Conta: " + c1.getNumConta() + "Saldo atual: " + c1.getSaldo());
                            System.out.print("Digite o valor a ser depositado: R$ ");
                            valor = sc.nextFloat();
                            c1.setSaldo(valor);
                            System.out.println("Novo Saldo: R$ " + c1.getSaldo());
                            break;
                        case 2:
                            System.out.println("Conta: " + c1.getNumConta() + "Saldo atual: " + c1.getSaldo());
                            System.out.print("Digite o valor a ser depositado: R$ ");
                            valor = sc.nextFloat();
                            c1.setSaldo(valor);
                            System.out.println("Novo Saldo: R$ " + c1.getSaldo());
                    }
                    break;
                case 4:
                    System.out.println("Contas existentes:");
                    System.out.println("Opção 01 - " + c1.getNumConta() + " : " + c1.getDono());
                    System.out.println("Opção 02 - " + c2.getNumConta() + " : " + c2.getDono());
                    System.out.print("Digite uma das opções: ");
                    menu = sc.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Conta: " + c1.getNumConta() + "Saldo atual: " + c1.getSaldo());
                            System.out.print("Digite o valor a ser sacado: R$ ");
                            valor = sc.nextFloat();
                            if (valor > c1.getSaldo()) {
                                System.out.println("ERRO! - Valor superior ao limite da conta!");
                            } else {
                                c1.setSaldo(-valor);
                                System.out.println("Novo Saldo: R$ " + c1.getSaldo()); 
                            }
                            break;
                        case 2:
                            System.out.println("Conta: " + c2.getNumConta() + "Saldo atual: " + c2.getSaldo());
                            System.out.print("Digite o valor a ser sacado: R$ ");
                            valor = sc.nextFloat();
                            if (valor > c2.getSaldo()) {
                            System.out.println("ERRO! - Valor superior ao limite da conta!");
                            } else {
                                c2.setSaldo(-valor);
                                System.out.println("Novo Saldo: R$ " + c2.getSaldo()); 
                            }
                        break;
                    }
                    break;
                case 5:
                    System.out.println("\nBem vindo à Agência Bancária!");
                    System.out.println("Abrindo uma nova conta...");
                    System.out.println("Por gentileza digite o tipo de Conta que deseja abrir.");
                    System.out.println("Selecione uma das opções do Menu:\n");
                    System.out.println("cód.       opção");
                    System.out.println("01 -       Conta Corrente");
                    System.out.println("02 -       Conta Poupança");
                    System.out.print("Código da opção: ");
                    do {
                        menu = sc.nextInt();
                        if (((menu != 1) && (menu != 2))) {
                            System.out.println("Opção Inválida. Digite novamente.");
                            System.out.print("Código da opção: ");
                        }
                    } while ((menu != 1) & (menu != 2));

                    System.out.print("Digite o nome do titular da conta: ");

                    nome = sc.nextLine();
                    nome = sc.nextLine();

                    if (menu == 1) {
                        c1.setDono(nome);
                        c1.setTipo("Conta Corrente");
                        c1.setSaldo(50f);
                    } else {
                        c1.setDono(nome);
                        c1.setTipo("Conta Poupança");
                        c1.setSaldo(150f);
                    }
                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    break;
            }
            System.out.print("Deseja retornar ao menu inicial? (s/n): ");
            menusaida = sc.next().charAt(0);
        } while (menusaida == 's');
        sc.close();
    }

}
