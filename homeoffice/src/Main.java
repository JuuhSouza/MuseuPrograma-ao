import salas.Sala;
import salas.SalaCuriosidades;
import salas.SalaFundadores;
import salas.SalaVersoes;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SALAS
        SalaFundadores sala1 = new SalaFundadores();
        SalaVersoes sala2 = new SalaVersoes();
        SalaCuriosidades sala3 = new SalaCuriosidades();

        // Visitante
        System.out.println("Bem-vindo ao Museu da Programação");
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        Visitante visitante = new Visitante();

        int opcao;
        do {
            System.out.println("----- MENU DO MUSEU ------");
            System.out.println("1 - " + sala1.getNome());
            System.out.println("2 - " + sala2.getNome());
            System.out.println("3 - " + sala3.getNome());
            System.out.println("0 - Sair do museu");

            System.out.print("Escolha uma sala para visitar: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    visitante.explorarSala(sala1);
                    break;
                case 2:
                    visitante.explorarSala(sala2);
                    break;
                case 3:
                    visitante.explorarSala(sala3);
                    break;
                case 0:
                    System.out.println("Obrigado pela visita, " + nome + "! Volte sempre");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
