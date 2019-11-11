/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

public class Fila {

    public int primeiro = -1;
    public int ultimo = -1;
    public int fila[] = new int[5];

    public boolean Inserir(int valor) {
        if (ultimo == fila.length) {
            System.out.println("Fila Cheia");
            return false;
        }
        if (primeiro == -1) {
            primeiro = 0;
            ultimo += 1;
            fila[primeiro] = valor;
            return true;
        }
        ultimo += 1;
        fila[ultimo] = valor;
        return true;
    }

    public boolean isVazia() {
        if (primeiro == -1) {
            System.out.println("Fila Vazia.");
            return true;
        }
        System.out.println("Fila em andamento.");
        return false;
    }

    public boolean remover() {
        if (isVazia() == true) {
          
            return false;
        } 
            for (int i = primeiro; i < ultimo; i++) {
                fila[i] = fila[i+1];
            }
            ultimo-=1;
            return true;
        
    }

    public boolean Mostrar() {
        if (isVazia() != true) {
            for (int i = primeiro; i <= ultimo; i++) {
                System.out.print(" "+fila[i]);
            }
            System.out.println("");
            return true;
        }
       
        return false;
    }
}
