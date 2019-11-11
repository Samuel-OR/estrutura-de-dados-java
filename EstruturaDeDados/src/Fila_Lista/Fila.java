package Fila_Lista;

public class Fila {

    static int tam = 0;
    static Elemento primeiro = new Elemento();

    private static class Elemento {

        int valor;
        Elemento proximo;

        public Elemento() {
        }

        public Elemento(int valor) {
            this.valor = valor;
        }
    }

    public static void remover() {
        if (!isVazia()) {
            primeiro.proximo = primeiro.proximo.proximo;
        }
    }
    
    public static boolean isVazia(){
        if(primeiro.proximo != null){
            return false;
        }
        return true;
    }

    public static void inserir(Elemento e) {
        Elemento temp = primeiro;

        while (temp.proximo != null) {
            temp = temp.proximo;
        }

        temp.proximo = e;
    }

    public static void exibir() {
        Elemento temp = primeiro;

        while (temp.proximo != null) {
            System.out.print(temp.proximo.valor + " ");
            temp = temp.proximo;
        }
    }

    public static void main(String[] args) {
        Fila F = new Fila();

        Fila.inserir(new Elemento(8));
        Fila.inserir(new Elemento(9));
        Fila.inserir(new Elemento(10));
        Fila.inserir(new Elemento(11));

        Fila.remover();
        Fila.remover();
        Fila.remover();
        Fila.remover();
        
        exibir();

    }
}
