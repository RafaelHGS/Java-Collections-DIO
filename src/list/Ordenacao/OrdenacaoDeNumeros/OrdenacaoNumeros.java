package list.Ordenacao.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(new Numero(numero));
    }

    public void ordenarAscendente() {
        Collections.sort(listaNumeros);
    }

    public void ordenarDescendente() {
        Collections.sort(listaNumeros, Collections.reverseOrder());
    }

    public List<Numero> getListaNumeros() {
        return listaNumeros;
    }
}

class Numero implements Comparable<Numero> {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(this.valor, n.valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}