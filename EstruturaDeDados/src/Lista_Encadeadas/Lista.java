package Lista_Encadeadas;



public class Lista {

    int tamanho = 0;
    Elemento primeiro = new Elemento();

    public void inserir(int valor) {

        Elemento aux2 = primeiro;
        tamanho += 1;

        while (aux2.proximo != null) {
            aux2 = aux2.proximo;
        }
        Elemento e = new Elemento(valor);
        aux2.proximo = e;
    }

    public void exibir() {
        Elemento aux = primeiro;

        while (aux.proximo != null) {
            aux = aux.proximo;
            System.out.print(aux.valor + "  ");
        }

    }

    public void tamanho() {
        System.out.println(tamanho);
    }

    public void RemoverNoFinal() {
        if (!isVazia()) {
            Elemento temp = primeiro;

            while (temp.proximo != null) {
                if (temp.proximo.proximo == null) {
                    temp.proximo = null;
                    break;
                }
                temp = temp.proximo;
            }
            tamanho -= 1;
        }
    }

    public boolean isVazia() {
        return primeiro.proximo == null;
    }

    public void Remove_Valor(int valor) {
        if (!isVazia()) {
            Elemento temp = primeiro;

            while (temp.proximo != null) {
                if (temp.proximo.valor == valor) {
                    temp.proximo = temp.proximo.proximo;

                    tamanho--;
                    break;
                }
                temp = temp.proximo;
            }

        }
    }

    public void Add_ordem(int valor) {
        Elemento aux = primeiro;
        Elemento novo = new Elemento();

       
        while (aux.proximo != null) {
            if (aux.proximo.valor >= valor) {
                
                novo.valor = valor;
                novo.proximo= aux.proximo;
               
                aux.proximo = novo;
                
                ///aux.proximo.proximo.valor = novo.valor;

                tamanho++;
                break;

            }
            aux = aux.proximo;
        }

    }
}
