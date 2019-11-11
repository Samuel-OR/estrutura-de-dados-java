/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_Encadeadas;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Testa {

    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);
            System.out.println("1 - Inserir");
            System.out.println("2 - Exibir");
            System.out.println("3 - Tamanho");
            System.out.println("4 - Remover Final");
            System.out.println("5 - Vazia?");
            System.out.println("6 - Remover valor");
            System.out.println("7 - Add Ordem");
            System.out.println("0 - Sair");
            System.out.print("ESCOLHA UMA OPÇÃO: ");

        int op = ler.nextInt();
        Lista lista = new Lista();

        while (op != 0) {
            switch (op) {
                case 1:
                    System.out.print("Informe um valor: ");
                    lista.inserir(ler.nextInt());
                    break;
                case 2:
                    System.out.print("Valores: ");
                    lista.exibir();
                    break;
                case 3:
                    System.out.print("Tamanho: ");
                    lista.tamanho();
                    break;
                case 4:
                    lista.RemoverNoFinal();
                    break;
                case 5:
                    System.out.println(lista.isVazia());
                    break;
                case 6:
                    System.out.print("Informe valor a ser removido: ");
                   lista.Remove_Valor(ler.nextInt());
                   break;
                case 7 :
                    System.out.print("Informe valor: "); 
                    lista.Add_ordem(ler.nextInt());
                    break;
               case 0:
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
            System.out.println("\n---------------------------------");
            
            System.out.println("1 - Inserir");
            System.out.println("2 - Exibir");
            System.out.println("3 - Tamanho");
            System.out.println("4 - Remover Final");
            System.out.println("5 - Vazia?");
            System.out.println("6 - Remover valor");
            System.out.println("7 - Add Ordem");
            System.out.println("0 - Sair");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            op = ler.nextInt();
            
        }

    }
}
