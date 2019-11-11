/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

import Fila.Fila;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class TesteFila {

 
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner ler = new Scanner(System.in);
        Fila f = new Fila();  
        
        System.out.println("1 - Enfileirar ");
        System.out.println("2 - Desemfileirar");
        System.out.println("3 - Vazia?");
        System.out.println("4 - Mostrar fila");
        System.out.println("0 - Sair");
        
        
        System.out.print("ESCOLHA NOVA OPÇÃO: ");
        int x = ler.nextInt();
        int y=0;
        
        while(x!=0){
         switch(x){
             
             case 1:
                 System.out.print("Digite um valor: ");
                 y  =ler.nextInt();
                 System.out.println(f.Inserir(y));
                break;
             case 2:
                 System.out.println(f.remover());
                 break;
             case 3:
                 f.isVazia();
                 break;
             case 4:
                 f.Mostrar();
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