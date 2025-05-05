package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> conjuntoDePalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoDePalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoDePalavras.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;
      if (!conjuntoDePalavras.isEmpty()){
          for (Palavra p:conjuntoDePalavras) {
              if(p.getPalavra().equals(palavra)){
                  palavraParaRemover = p;
                  break;
              }
          }
      }
        conjuntoDePalavras.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        Palavra palavraParaVerificacao = null;
        if (!conjuntoDePalavras.isEmpty()){
            for (Palavra p:conjuntoDePalavras) {
                if(p.getPalavra().equals(palavra)){
                    System.out.println("A Palavra está no conjunto");
                    break;
                }
            }
        }
    }

    public void exibirPalavras(){
        System.out.println(conjuntoDePalavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        // Adicionando palavras
        conjuntoPalavras.adicionarPalavra("maçã");
        conjuntoPalavras.adicionarPalavra("banana");
        conjuntoPalavras.adicionarPalavra("laranja");
        conjuntoPalavras.adicionarPalavra("banana"); // repetida

        // Exibindo todas as palavras
        System.out.println("Palavras no conjunto:");
        conjuntoPalavras.exibirPalavras();

        // Verificando se uma palavra está presente
        conjuntoPalavras.verificarPalavra("banana");
        conjuntoPalavras.verificarPalavra("melancia");

        // Removendo uma palavra
        conjuntoPalavras.removerPalavra("laranja");

        // Exibindo novamente após remoção
        System.out.println("Palavras após remoção:");
        conjuntoPalavras.exibirPalavras();
    }

}
