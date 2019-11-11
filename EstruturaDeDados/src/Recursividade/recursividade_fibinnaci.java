
package Recursividade;

public class recursividade_fibinnaci {
    
    public static int fib(int f){
         if(f<2){
             return 1;
         }
         return fib(f-1)+fib(f-2);
    }
    
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
