package list.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int somaTotal = 0;
        for (int i :listaNumeros) {
            somaTotal+=i;
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for (int i:listaNumeros) {
            if(i >= maior){
                maior = i;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = 0;
        for (int i = 1; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i-1) < listaNumeros.get(i)){
                menor = listaNumeros.get(i-1);
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        for (int i:listaNumeros) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        SomaNumeros listaDeNumeros = new SomaNumeros();

        listaDeNumeros.adicionarNumero(12);
        listaDeNumeros.adicionarNumero(7);
        listaDeNumeros.adicionarNumero(22);
        listaDeNumeros.adicionarNumero(4);
        listaDeNumeros.adicionarNumero(33);
        listaDeNumeros.adicionarNumero(70);
        listaDeNumeros.adicionarNumero(2);
        listaDeNumeros.adicionarNumero(8);

        System.out.println("Soma dos números: "+ listaDeNumeros.calcularSoma());
        System.out.println("Maior Numero: "+ listaDeNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero: "+ listaDeNumeros.encontrarMenorNumero());
        System.out.println("Lista dos Números:\n");
        listaDeNumeros.exibirNumeros();
    }
}
