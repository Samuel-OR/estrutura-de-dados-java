package Lista_Simples;

public class Lista {

//    public static int primeiro;
    public static int ultimo = -1;
    public static int qtde = 0;
    public static int x = 0;
    public static int vet[] = new int[10];

    //ok
    public boolean AdicionarPrimeiroValor(int valor) {

        if (qtde > 0) {

            ultimo += 1;
            qtde += 1;
            for (int i = ultimo; i > 0; i--) {
                vet[i] = vet[i - 1];
            }
            vet[0]= valor;
            return true;
        }else if(qtde == 0){
            ultimo+=1;
            qtde+=1;
            vet[0]=valor;
            return true;
        }
        
        return false;
    }


    //ok
    public boolean RemoverUltimoValor() {
        ultimo -= 1;
        qtde -= 1;
        return true;
    }

    //ok
    public boolean AdicionarUltimaPosicao(int valor) {
        if (ultimo == vet.length) {
            return false;
        }
        ultimo += 1;
        qtde += 1;
        vet[ultimo] = valor;
        return true;

    }

    //ok
    public boolean AdicionarValor_Posicao(int valor, int posicao) {
        if (qtde < vet.length) {

            if (ultimo >= posicao) {
                x = ultimo;
                for (int i = ultimo; i >= posicao; i--) {

                    vet[x + 1] = vet[x];
                    x -= 1;
                }
                qtde += 1;
                ultimo += 1;
                vet[posicao] = valor;
                return true;
            }
            if (ultimo == posicao - 1) {
                vet[posicao] = valor;
                qtde += 1;
                ultimo += 1;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isvazia() {
        if (qtde != 0) {

            return false;
        }
        return true;
    }

    public boolean limpar() {
        ultimo = -1;
        qtde = 0;
        return true;
    }

    public boolean Mostrar() {
        for (int i = 0; i <= ultimo; i++) {
            System.out.println(" " + vet[i]);
        }
        return true;
    }

}
