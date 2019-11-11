/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

/**
 *
 * @author samuel
 */
public class Pilha {

    public int topo = -1;
    public int qtde = 0;
    
    public int vet[] = new int[5];
    
    public boolean empilhar(int valor){
        if(qtde<vet.length){
            topo+=1;
            vet[topo] = valor;
            qtde +=1;            
        return true;
        }
        return false;
    }
    
    public boolean desempilhar(){
        if(qtde!=0){
            topo-=1;
            qtde-=1;
            return true;
        }
        return false;
    }
    
    public boolean isVazia(){
        if(qtde==0){
            System.out.println("Pilha vazia");
            return true;
        }
        System.out.println("Pré-completa");
        return false;
    }
    
    public boolean mostrar_topo(){
        if(isVazia()==true){            
           
            return false; 
            
        }
        System.out.println("Topo: "+ vet[topo]);
        return true;
    }
    
    
}
