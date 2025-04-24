package list.OperacoesBasicas.CarrinhoDeCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantiadade;

    public Item(String nome, double preco, int quantiadade) {
        this.nome = nome;
        this.preco = preco;
        this.quantiadade = quantiadade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantiadade() {
        return quantiadade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantiadade=" + quantiadade +
                '}';
    }
}
