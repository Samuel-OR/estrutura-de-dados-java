/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

public class recursividade_soma {
    
    public static int soma( int n){
        if( n ==1){
            return 1;
        }
        return n + soma(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println( soma(10));
    }
}
