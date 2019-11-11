package Lista_Simples;

import java.util.Scanner;

public class TestaLista {

    public static void main(String[] args) {

        Lista teste = new Lista();
        System.out.println("ESCOLHA UMA OPÇÃO:");
        System.out.println("1 - Adicionar valor x, posição y");
        System.out.println("2 - Adicionar valor primeira posiçao");
        System.out.println("3 - Adicionar valor ultima posiçao");
        System.out.println("4 - Remover ultimo valor");
        System.out.println("5 - Verificar se lista está vazia");
        System.out.println("6 - Limpar Lista");
        System.out.println("7 - Mostra Lista");
        System.out.println("0 - Sair");
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt(), y, w;
        while (x != 0) {
            switch (x) {
                case 1:

                    System.out.println("Digite valor seguido da posição: ");
                    y = ler.nextInt();
                    w = ler.nextInt();
                    System.out.println(teste.AdicionarValor_Posicao(y, w));
                    break;
                case 2:
                    System.out.println("Digite um valor: ");
                    y = ler.nextInt();
                    System.out.println(teste.AdicionarPrimeiroValor(y));
                    break;
                case 3:
                    System.out.println("Digite um valor: ");
                    y = ler.nextInt();
                    System.out.println(teste.AdicionarUltimaPosicao(y));
                    break;
                case 4:
                    System.out.println(teste.RemoverUltimoValor());
                    break;
                case 5:
                    if ((teste.isvazia() == true)) {
                        System.out.println("Vazia");
                    } else {
                        System.out.println("Não vazia");
                    }
                    break;
                case 6:
                    teste.limpar();
                    System.out.println("Lista limpa");
                    break;
                case 7:
                    System.out.println(teste.Mostrar());
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");
            }
             System.out.println("-------------------------------------");
            System.out.println("ESCOLHA NOVA OPÇÃO:"); x = ler.nextInt();
           
        }
    }
}