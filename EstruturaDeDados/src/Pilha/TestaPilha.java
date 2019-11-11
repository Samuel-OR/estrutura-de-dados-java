
package Pilha;

import Pilha.Pilha;
import java.util.Scanner;


public class TestaPilha {
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        Pilha p = new Pilha();  
        System.out.println("1 - Empilhar ");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Vazia?");
        System.out.println("4 - Mostrar valor topo");
        System.out.println("0 - Sair");
        
         System.out.print("ESCOLHA NOVA OPÇÃO: ");
        int x = ler.nextInt();
        int y=0;
        
        while(x!=0){
         switch(x){
             
             case 1:
                 System.out.print("Digite um valor: ");
                 y  =ler.nextInt();
                 System.out.println(p.empilhar(y));
                break;
             case 2:
                 System.out.println(p.desempilhar());
                 break;
             case 3:
                 p.isVazia();
                 break;
             case 4:
                 p.mostrar_topo();
                 break;
             default:
                 System.out.println("Opção Invalida");
         }
            System.out.println("---------------------------------------------------------------");
            System.out.print("ESCOLHA NOVA OPÇÃO: ");
            x = ler.nextInt();
        }
    }
}
