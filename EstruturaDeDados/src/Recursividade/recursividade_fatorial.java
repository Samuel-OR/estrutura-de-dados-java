
package Recursividade;

import java.util.Scanner;


public class recursividade_fatorial {

    // casoso bases: casos que ja sei a resposta
    //casos recorrentes: usa-se a mesma função para calcular
    public static int fatorial(int n){
        if (n<=1){
            return 1;
        }
        return n * fatorial(n-1);
    }
    
    public static void main(String[] args) {
        // fatorial
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        
        
            System.out.println(fatorial(n));
        
        
    }
    
}
