package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantiade){
        listaDeItens.add(new Item(nome, preco, quantiade));
    }

    public void removerItem(String nome){
        List<Item> listaParaRemover = new ArrayList<>();
        for (Item i: listaDeItens) {
            if(i.getNome().equalsIgnoreCase(nome)){
                listaParaRemover.add(i);
            }
        }
        listaDeItens.removeAll(listaParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i:listaDeItens) {
            valorTotal += i.getPreco()*i.getQuantiadade();
        }
        return  valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaDeItens);;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhodeCompras = new CarrinhoDeCompras();
        System.out.println("Itens no carrinho:" );
        carrinhodeCompras.exibirItens();
        System.out.println("");

        carrinhodeCompras.adicionarItem("carrinho", 25, 1);
        carrinhodeCompras.adicionarItem("carrinho", 22, 1);
        carrinhodeCompras.adicionarItem("maça", 3.3, 8);
        carrinhodeCompras.adicionarItem("banana", 1.7, 12);

        System.out.printf("O valor do carrinho é: %.2f\n",carrinhodeCompras.calcularValorTotal());

        System.out.println("Itens no carrinho:" );
        carrinhodeCompras.exibirItens();
        System.out.println("");

        carrinhodeCompras.removerItem("carrinho");

        System.out.println("Itens no carrinho:" );
        carrinhodeCompras.exibirItens();
        System.out.printf("O valor do carrinho é: %.2f\n",carrinhodeCompras.calcularValorTotal());
        System.out.println("");

    }
}
